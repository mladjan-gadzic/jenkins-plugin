package armadaproject;

import hudson.Extension;
import hudson.model.Descriptor;
import hudson.slaves.Cloud;
import hudson.slaves.NodeProvisioner;
import java.util.Collection;
import java.util.logging.Logger;
import org.apache.commons.lang.StringUtils;
import org.kohsuke.stapler.DataBoundConstructor;

public class ArmadaCloud extends Cloud {

  private static final Logger LOG = Logger.getLogger(ArmadaCloud.class.getName());

  public final String armadactlAbsPath;

  @DataBoundConstructor
  public ArmadaCloud(String name, String armadactlAbsPath) {
    super(name);
    LOG.info("ArmadaCloud constructor");

    if (StringUtils.isBlank(armadactlAbsPath)) {
      throw new RuntimeException("Absolute path to armadactl binary can not be empty or null");
    }

    this.armadactlAbsPath = armadactlAbsPath;
  }

  @Override
  public Collection<NodeProvisioner.PlannedNode> provision(CloudState state, int excessWorkload) {
    LOG.info("ArmadaAgentCloud provision");
    return super.provision(state, excessWorkload);
  }

  @Override
  public boolean canProvision(CloudState state) {
    LOG.info("ArmadaAgentCloud canProvision");
    return super.canProvision(state);
  }

  @Extension
  public static class DescriptorImpl extends Descriptor<Cloud> {

    private static final Logger LOG = Logger.getLogger(DescriptorImpl.class.getName());


    @Override
    public String getDisplayName() {
      LOG.info("ArmadaAgentCloud getDisplayName");
      return "Armada";
    }
  }
}
