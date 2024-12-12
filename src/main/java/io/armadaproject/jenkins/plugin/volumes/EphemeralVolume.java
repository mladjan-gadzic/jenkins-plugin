package io.armadaproject.jenkins.plugin.volumes;

import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeBuilder;
import io.armadaproject.jenkins.plugin.volumes.workspace.GenericEphemeralWorkspaceVolume;

/**
 * Interface containing common code between {@link GenericEphemeralVolume} and {@link GenericEphemeralWorkspaceVolume}.
 */
public interface EphemeralVolume extends ProvisionedVolume {
    default Volume buildEphemeralVolume(String volumeName) {
        return new VolumeBuilder()
                .withName(volumeName)
                .withNewEphemeral()
                .withNewVolumeClaimTemplate()
                .withNewSpec()
                .withAccessModes(getAccessModesOrDefault())
                .withStorageClassName(getStorageClassNameOrDefault())
                .withNewResources()
                .withRequests(getResourceMap())
                .endResources()
                .endSpec()
                .endVolumeClaimTemplate()
                .endEphemeral()
                .build();
    }
}
