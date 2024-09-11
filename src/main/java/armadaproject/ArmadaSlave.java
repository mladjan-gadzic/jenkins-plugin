package armadaproject;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.model.Descriptor;
import hudson.model.TaskListener;
import hudson.slaves.AbstractCloudSlave;
import hudson.slaves.ComputerLauncher;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class ArmadaSlave extends AbstractCloudSlave {

  private static final Logger LOG = Logger.getLogger(ArmadaSlave.class.getName());
  private String armadactlAbsPath;

  @DataBoundConstructor
  public ArmadaSlave(@NonNull String name, String remoteFS, ComputerLauncher launcher)
      throws Descriptor.FormException, IOException {
    super(name, remoteFS, launcher);
    LOG.info("ArmadaAgentSlave constructor");
  }

  @Override
  public ArmadaComputer createComputer() {
    LOG.info("createComputer");
    return new ArmadaComputer(this);
  }

  @Override
  protected void _terminate(TaskListener listener) throws IOException, InterruptedException {
    LOG.log(Level.INFO, "Terminating Armada instance for slave " + name);

    try {
      toComputer().disconnect(null);
      // TODO

    } catch (Exception e) {
      LOG.log(Level.SEVERE, "Failure to terminate instance for slave " + name, e);
    }
  }

  @Extension
  public static final class DescriptorImpl extends SlaveDescriptor {

    @Override
    public String getDisplayName() {
      LOG.info("ArmadaAgentSlave.getDisplayName");
      return "Armada";
    }

    @Override
    public boolean isInstantiable() {
      LOG.info("ArmadaAgentSlave.isInstantiable");
      return true;
    }
  }

  public String getArmadactlAbsPath() {
    LOG.info("getArmadactlAbsPath");
    return armadactlAbsPath;
  }

  @DataBoundSetter
  public void setArmadactlAbsPath(String armadactlAbsPath) {
    LOG.info("setArmadactlAbsPath");
    this.armadactlAbsPath = armadactlAbsPath;
  }
}
