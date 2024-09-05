package io.jenkins.plugins.agent;

import hudson.Plugin;

public class ArmadaPlugin extends Plugin {

    @Override
    public void start() throws Exception {
        System.out.println("ArmadaPlugin start");
        super.start();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("ArmadaPlugin stop");
        super.stop();
    }
}
