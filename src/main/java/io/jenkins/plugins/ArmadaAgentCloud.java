package io.jenkins.plugins;

import com.google.common.base.Preconditions;
import hudson.Extension;
import hudson.model.Descriptor;
import hudson.slaves.Cloud;
import hudson.slaves.NodeProvisioner;
import java.util.Collection;
import java.util.logging.Logger;
import org.kohsuke.stapler.DataBoundConstructor;

public class ArmadaAgentCloud extends Cloud {

    private static final Logger LOGGER = Logger.getLogger(ArmadaAgentCloud.class.getName());

    public static final String CLOUD_ID_PREFIX = "armada-";

    public final String clusterIp;

    @DataBoundConstructor
    public ArmadaAgentCloud(String name, String clusterIp) {
        super(name);

        Preconditions.checkNotNull(clusterIp);

        this.clusterIp = clusterIp;
    }

    @Override
    public Collection<NodeProvisioner.PlannedNode> provision(CloudState state, int excessWorkload) {
        return super.provision(state, excessWorkload);
    }

    @Override
    public boolean canProvision(CloudState state) {
        return super.canProvision(state);
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<Cloud> {
        @Override
        public String getDisplayName() {
            return "Armada";
        }
    }
}
