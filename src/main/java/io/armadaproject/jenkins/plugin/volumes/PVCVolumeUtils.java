package io.armadaproject.jenkins.plugin.volumes;

import hudson.util.ListBoxModel;

public class PVCVolumeUtils {
    public static final ListBoxModel ACCESS_MODES_BOX =
            new ListBoxModel().add("ReadWriteOnce").add("ReadOnlyMany").add("ReadWriteMany");
}
