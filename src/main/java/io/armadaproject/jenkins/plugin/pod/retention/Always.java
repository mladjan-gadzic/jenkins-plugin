package io.armadaproject.jenkins.plugin.pod.retention;

import hudson.Extension;
import io.armadaproject.jenkins.plugin.ArmadaCloud;
import io.fabric8.kubernetes.api.model.Pod;
import java.io.Serializable;
import java.util.function.Supplier;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class Always extends PodRetention implements Serializable {

    private static final long serialVersionUID = -3363056751880572952L;

    @DataBoundConstructor
    public Always() {}

    @Override
    public boolean shouldDeletePod(ArmadaCloud cloud, Supplier<Pod> pod) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof Always) {
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
        return Messages.always();
    }

    @Extension
    @Symbol("always")
    public static class DescriptorImpl extends PodRetentionDescriptor {

        @Override
        public String getDisplayName() {
            return Messages.always();
        }
    }
}
