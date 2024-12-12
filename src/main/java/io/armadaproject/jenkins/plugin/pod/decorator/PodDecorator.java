package io.armadaproject.jenkins.plugin.pod.decorator;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.ExtensionList;
import hudson.ExtensionPoint;
import io.fabric8.kubernetes.api.model.Pod;
import io.armadaproject.jenkins.plugin.ArmadaCloud;

/**
 * Allows to alter a pod definition after it has been built from the yaml and DSL/GUI configuration.
 */
public interface PodDecorator extends ExtensionPoint {

    /**
     * Goes through all the {@link PodDecorator} extensions and decorates the pod.
     * @param armadaCloud The cloud this pod will be scheduled as context.
     * @param pod the initial pod definition before decoration.
     * @return The modified pod definition.
     * @throws PodDecoratorException Should any of the decorators fail to decorate the pod.
     */
    @NonNull
    static Pod decorateAll(@NonNull ArmadaCloud armadaCloud, @NonNull Pod pod) throws PodDecoratorException {
        for (PodDecorator decorator : ExtensionList.lookup(PodDecorator.class)) {
            pod = decorator.decorate(armadaCloud, pod);
        }
        return pod;
    }

    @NonNull
    Pod decorate(@NonNull ArmadaCloud armadaCloud, @NonNull Pod pod);
}
