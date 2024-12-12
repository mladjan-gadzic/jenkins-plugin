package io.armadaproject.jenkins.plugin.pod.decorator;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.fabric8.kubernetes.api.model.Pod;
import org.apache.commons.lang.StringUtils;
import io.armadaproject.jenkins.plugin.ArmadaCloud;

/**
 * Sets the restart policy to Never.
 */
@Extension
public class DefaultRestartPolicy implements PodDecorator {
    @NonNull
    @Override
    public Pod decorate(@NonNull ArmadaCloud armadaCloud, @NonNull Pod pod) {
        if (StringUtils.isBlank(pod.getSpec().getRestartPolicy())) {
            pod.getSpec().setRestartPolicy("Never");
        }
        return pod;
    }
}
