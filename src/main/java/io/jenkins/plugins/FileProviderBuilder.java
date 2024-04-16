package io.jenkins.plugins;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.EnvVars;
import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Result;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;
import jenkins.tasks.SimpleBuildStep;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class FileProviderBuilder extends Builder implements SimpleBuildStep {

  private final String absPath;

  @DataBoundConstructor
  public FileProviderBuilder(String absPath) {
    this.absPath = absPath;
  }

  public String getAbsPath() {
    return absPath;
  }


  @Override
  public void perform(Run<?, ?> run, FilePath workspace, EnvVars env, Launcher launcher, TaskListener listener)
      throws IOException {
    if (!Files.exists(Path.of(absPath))) {
      try (PrintWriter ignored = listener.fatalError("File with path '" + absPath + "' does not exist")) {
        Objects.requireNonNull(run.getExecutor()).interrupt(Result.FAILURE);
        return;
      }
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(absPath))) {
      StringBuilder content = new StringBuilder();
      String currentLine;
      while ((currentLine = reader.readLine()) != null) {
        content.append(currentLine);
        content.append(System.lineSeparator());
      }

      listener.getLogger().println("###File content start###");
      listener.getLogger().println(content);
      listener.getLogger().println("###File content end###");
    }

  }

  @Extension
  public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {

    public FormValidation doCheckAbsPath(@QueryParameter String absPath) {
      if (absPath.isBlank()) {
        return FormValidation.error("Cannot be blank");
      }

      return FormValidation.ok();
    }

    @Override
    public boolean isApplicable(Class<? extends AbstractProject> aClass) {
      return true;
    }

    @NonNull
    @Override
    public String getDisplayName() {
      return "Provide a file";
    }
  }
}
