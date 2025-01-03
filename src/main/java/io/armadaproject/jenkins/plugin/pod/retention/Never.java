package io.armadaproject.jenkins.plugin.pod.retention;

import hudson.Extension;
import io.armadaproject.jenkins.plugin.ArmadaCloud;
import io.fabric8.kubernetes.api.model.Pod;
import java.io.Serializable;
import java.util.function.Supplier;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class Never extends PodRetention implements Serializable {

    private static final long serialVersionUID = -7127652621214283411L;

    @DataBoundConstructor
    public Never() {}

    @Override
    public boolean shouldDeletePod(ArmadaCloud cloud, Supplier<Pod> pod) {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Never) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return Messages.never();
    }

    @Extension
    @Symbol("never")
    public static class DescriptorImpl extends PodRetentionDescriptor {

        @Override
        public String getDisplayName() {
            return Messages.never();
        }
    }
}
