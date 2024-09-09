package armadaproject;

import hudson.Extension;
import hudson.model.Descriptor;
import hudson.slaves.Cloud;
import hudson.slaves.NodeProvisioner;
import java.util.Collection;
import org.apache.commons.lang.StringUtils;
import org.kohsuke.stapler.DataBoundConstructor;

public class ArmadaCloud extends Cloud {

  public final String armadactlAbsPath;

  @DataBoundConstructor
  public ArmadaCloud(String name, String armadactlAbsPath) {
    super(name);
    System.out.println("ArmadaAgentCloud constructor");

    if (StringUtils.isBlank(armadactlAbsPath)) {
      throw new RuntimeException("Absolute path to armadactl binary can not be empty or null");
    }

    this.armadactlAbsPath = armadactlAbsPath;
  }

  @Override
  public Collection<NodeProvisioner.PlannedNode> provision(CloudState state, int excessWorkload) {
    System.out.println("ArmadaAgentCloud provision");
    return super.provision(state, excessWorkload);
  }

  @Override
  public boolean canProvision(CloudState state) {
    System.out.println("ArmadaAgentCloud canProvision");
    return super.canProvision(state);
  }

  @Extension
  public static class DescriptorImpl extends Descriptor<Cloud> {

    @Override
    public String getDisplayName() {
      System.out.println("ArmadaAgentCloud getDisplayName");
      return "Armada";
    }
  }
}
