package io.jenkins.plugins.agent;

import hudson.Extension;
import hudson.model.Descriptor;
import hudson.slaves.Cloud;
import hudson.slaves.NodeProvisioner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.logging.Logger;

import io.jenkins.plugins.service.ShellOutService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.routines.InetAddressValidator;
import org.kohsuke.stapler.DataBoundConstructor;

public class ArmadaAgentCloud extends Cloud {

    private static final Logger LOGGER = Logger.getLogger(ArmadaAgentCloud.class.getName());

    public static final String CLOUD_ID_PREFIX = "armada-";

    public final String clusterIp;

    public final String armadactlAbsPath;

    @DataBoundConstructor
    public ArmadaAgentCloud(String name, String clusterIp, String armadactlAbsPath) {
        super(name);
        System.out.println("ArmadaAgentCloud constructor");

        InetAddressValidator validator = InetAddressValidator.getInstance();

        if(!validator.isValid(clusterIp)) {
            throw new RuntimeException("Invalid Armada cluster ip address format");
        }

        if(StringUtils.isBlank(armadactlAbsPath)){
            throw new RuntimeException("Absolute path to armadactl binary can not be empty or null");
        }

        this.clusterIp = clusterIp;
        this.armadactlAbsPath = armadactlAbsPath;

        try {
            ShellOutService.runCommand("ls -la");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
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
