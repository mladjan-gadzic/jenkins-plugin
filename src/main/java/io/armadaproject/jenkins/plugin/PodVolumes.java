package io.armadaproject.jenkins.plugin;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.fabric8.kubernetes.api.model.VolumeMount;
import java.util.List;

@Deprecated
public class PodVolumes {

    @Deprecated
    public abstract static class PodVolume extends
        io.armadaproject.jenkins.plugin.volumes.PodVolume {}

    @SuppressFBWarnings(
            value = "SE_NO_SERIALVERSIONID",
            justification = "Serialization happens exclusively through XStream and not Java Serialization.")
    @Deprecated
    public static class EmptyDirVolume extends
        io.armadaproject.jenkins.plugin.volumes.EmptyDirVolume {

        public EmptyDirVolume(String mountPath, Boolean memory) {
            super(mountPath, memory);
        }

        protected Object readResolve() {
            return new io.armadaproject.jenkins.plugin.volumes.EmptyDirVolume(
                    this.getMountPath(), this.getMemory());
        }
    }

    @SuppressFBWarnings(
            value = "SE_NO_SERIALVERSIONID",
            justification = "Serialization happens exclusively through XStream and not Java Serialization.")
    @Deprecated
    public static class SecretVolume extends
        io.armadaproject.jenkins.plugin.volumes.SecretVolume {

        public SecretVolume(String mountPath, String secretName) {
            super(mountPath, secretName);
        }

        protected Object readResolve() {
            return new io.armadaproject.jenkins.plugin.volumes.SecretVolume(
                    this.getMountPath(), this.getSecretName());
        }
    }

    @SuppressFBWarnings(
            value = "SE_NO_SERIALVERSIONID",
            justification = "Serialization happens exclusively through XStream and not Java Serialization.")
    @Deprecated
    public static class HostPathVolume extends
        io.armadaproject.jenkins.plugin.volumes.HostPathVolume {

        public HostPathVolume(String hostPath, String mountPath, Boolean readOnly) {
            super(hostPath, mountPath, readOnly);
        }

        protected Object readResolve() {
            return new io.armadaproject.jenkins.plugin.volumes.HostPathVolume(
                    this.getHostPath(), this.getMountPath(), this.getReadOnly());
        }
    }

    @SuppressFBWarnings(
            value = "SE_NO_SERIALVERSIONID",
            justification = "Serialization happens exclusively through XStream and not Java Serialization.")
    @Deprecated
    public static class NfsVolume extends io.armadaproject.jenkins.plugin.volumes.NfsVolume {

        public NfsVolume(String serverAddress, String serverPath, Boolean readOnly, String mountPath) {
            super(serverAddress, serverPath, readOnly, mountPath);
        }

        protected Object readResolve() {
            return new io.armadaproject.jenkins.plugin.volumes.NfsVolume(
                    this.getServerAddress(), this.getServerPath(), this.getReadOnly(), this.getMountPath());
        }
    }

    /**
     * @deprecated Use {@link PodVolume#volumeMountExists(String, List)} instead
     */
    @Deprecated
    public static boolean volumeMountExists(String path, List<VolumeMount> existingMounts) {
        return PodVolume.volumeMountExists(path, existingMounts);
    }

    /**
     * @deprecated Use {@link PodVolume#podVolumeExists(String,List)} instead
     */
    @Deprecated
    public static boolean podVolumeExists(String path, List<PodVolume> existingVolumes) {
        for (PodVolume podVolume : existingVolumes) {
            if (podVolume.getMountPath().equals(path)) {
                return true;
            }
        }
        return false;
    }
}
