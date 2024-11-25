package random.pod.decorator;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.fabric8.kubernetes.api.model.Pod;
import java.util.Collections;
import random.ArmadaCloud;

/**
 * Sets the default node selector to linux if it hasn't been set explicitly in the pod before.
 */
@Extension
public class DefaultNodeSelector implements PodDecorator {
    @NonNull
    @Override
    public Pod decorate(@NonNull ArmadaCloud armadaCloud, @NonNull Pod pod) {
        // default OS: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
        if (pod.getSpec().getRuntimeClassName() == null
                && (pod.getSpec().getNodeSelector() == null
                        || pod.getSpec().getNodeSelector().isEmpty())
                && (pod.getSpec().getAffinity() == null
                        || pod.getSpec().getAffinity().getNodeAffinity() == null)) {
            pod.getSpec().setNodeSelector(Collections.singletonMap("kubernetes.io/os", "linux"));
        }
        return pod;
    }
}
