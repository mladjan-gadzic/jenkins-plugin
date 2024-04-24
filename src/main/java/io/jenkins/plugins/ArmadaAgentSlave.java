package io.jenkins.plugins;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.model.Descriptor;
import hudson.model.TaskListener;
import hudson.slaves.AbstractCloudSlave;
import hudson.slaves.ComputerLauncher;
import hudson.slaves.JNLPLauncher;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kohsuke.stapler.DataBoundConstructor;

public class ArmadaAgentSlave extends AbstractCloudSlave {

    private static final Logger LOGGER = Logger.getLogger(ArmadaAgentSlave.class.getName());

    protected ArmadaAgentSlave(@NonNull String name, String remoteFS, ComputerLauncher launcher)
            throws Descriptor.FormException, IOException {
        super(name, remoteFS, launcher);
    }

    @DataBoundConstructor
    public ArmadaAgentSlave() throws Descriptor.FormException, IOException {
        super("armada-agent", "armada-agent", new JNLPLauncher());
    }

    public ComputerLauncher getLauncher() {
        return new JNLPLauncher();
    }

    @Override
    public ArmadaAgentComputer createComputer() {
        return new ArmadaAgentComputer(this);
    }

    @Override
    protected void _terminate(TaskListener listener) throws IOException, InterruptedException {
        LOGGER.log(Level.INFO, "Terminating Armada instance for slave " + name);

        try {
            toComputer().disconnect(null);
            // TODO

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failure to terminate instance for slave " + name, e);
        }
    }

    @Extension
    public static final class DescriptorImpl extends SlaveDescriptor {

        @Override
        public String getDisplayName() {
            return "Armada Slave";
        }
        ;

        @Override
        public boolean isInstantiable() {
            return false;
        }
    }
}
