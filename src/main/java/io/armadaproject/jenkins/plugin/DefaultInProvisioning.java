package io.armadaproject.jenkins.plugin;

import edu.umd.cs.findbugs.annotations.CheckForNull;
import hudson.Extension;
import hudson.model.Computer;
import hudson.model.Label;
import hudson.model.Node;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Extension
public class DefaultInProvisioning extends InProvisioning {
    private static final Logger LOGGER = Logger.getLogger(DefaultInProvisioning.class.getName());

    private static boolean isNotAcceptingTasks(Node n) {
        Computer computer = n.toComputer();
        return computer != null
                && (computer.isLaunchSupported() // Launcher hasn't been called yet
                        || !n.isAcceptingTasks()) // node is not ready yet
        ;
    }

    @Override
    public Set<String> getInProvisioning(@CheckForNull Label label) {
        if (label != null) {
            return label.getNodes().stream()
                    .filter(KubernetesSlave.class::isInstance)
                    .filter(DefaultInProvisioning::isNotAcceptingTasks)
                    .map(Node::getNodeName)
                    .collect(Collectors.toSet());
        } else {
            return Collections.emptySet();
        }
    }
}
