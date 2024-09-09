package armadaproject;

import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;
import java.util.logging.Logger;
import org.jenkinsci.Symbol;
import org.jenkinsci.plugins.pipeline.modeldefinition.agent.DeclarativeAgent;
import org.jenkinsci.plugins.pipeline.modeldefinition.agent.DeclarativeAgentDescriptor;
import org.jenkinsci.plugins.variant.OptionalExtension;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class ArmadaDeclarativeAgent extends DeclarativeAgent<ArmadaDeclarativeAgent> {

  private static final Logger LOG = Logger.getLogger(ArmadaDeclarativeAgent.class.getName());

  @CheckForNull
  private String yaml;

  @DataBoundConstructor
  public ArmadaDeclarativeAgent() {
    LOG.info("ArmadaDeclarativeAgent constructor");
  }

  public String getYaml() {
    LOG.info("getYaml");
    return yaml;
  }

  @DataBoundSetter
  public void setYaml(String yaml) {
    LOG.info("setYaml");
    this.yaml = yaml;
  }

  @OptionalExtension(requirePlugins = "pipeline-model-extensions")
  @Symbol("armada")
  public static class DescriptorImpl extends DeclarativeAgentDescriptor<ArmadaDeclarativeAgent> {
    
    private static final Logger LOG = Logger.getLogger(DescriptorImpl.class.getName());

    public DescriptorImpl() {
      LOG.info("DescriptorImpl constructor");
    }

    @NonNull
    @Override
    public String getDisplayName() {
      LOG.info("ArmadaDeclarativeAgent.getDisplayName");
      return "Armada";
    }

  }
}
