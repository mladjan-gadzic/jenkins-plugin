package io.armadaproject.jenkins.plugin.volumes.workspace;

import static org.junit.Assert.assertEquals;

import io.fabric8.kubernetes.api.model.Volume;
import io.armadaproject.jenkins.plugin.volumes.workspace.GenericEphemeralWorkspaceVolume;
import org.junit.Test;

public class GenericEphemeralWorkspaceVolumeTest {

    @Test
    public void testCreatesVolumeCorrectly() {

        GenericEphemeralWorkspaceVolume genericEphemeralWorkspaceVolume = new GenericEphemeralWorkspaceVolume();
        genericEphemeralWorkspaceVolume.setStorageClassName("test-storageclass");
        genericEphemeralWorkspaceVolume.setRequestsSize("1Gi");
        genericEphemeralWorkspaceVolume.setAccessModes("ReadWriteOnce");

        Volume volume = genericEphemeralWorkspaceVolume.buildVolume("testvolume", "testpod");

        assertEquals("testvolume", volume.getName());
        assertEquals(
                "ReadWriteOnce",
                volume.getEphemeral()
                        .getVolumeClaimTemplate()
                        .getSpec()
                        .getAccessModes()
                        .get(0));
        assertEquals(
                "test-storageclass",
                volume.getEphemeral().getVolumeClaimTemplate().getSpec().getStorageClassName());
        assertEquals(
                "1Gi",
                volume.getEphemeral()
                        .getVolumeClaimTemplate()
                        .getSpec()
                        .getResources()
                        .getRequests()
                        .get("storage")
                        .toString());
    }
}
