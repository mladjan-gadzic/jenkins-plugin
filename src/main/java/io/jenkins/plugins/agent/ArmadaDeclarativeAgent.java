package io.jenkins.plugins.agent;

import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.ExtensionList;
import hudson.util.ListBoxModel;
import org.apache.commons.lang.StringUtils;
import org.jenkinsci.Symbol;
import org.jenkinsci.plugins.pipeline.modeldefinition.agent.DeclarativeAgent;
import org.jenkinsci.plugins.pipeline.modeldefinition.agent.DeclarativeAgentDescriptor;
import org.jenkinsci.plugins.variant.OptionalExtension;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

public class ArmadaDeclarativeAgent extends DeclarativeAgent<ArmadaDeclarativeAgent> {
    private static final Logger LOGGER = Logger.getLogger(ArmadaDeclarativeAgent.class.getName());

    @CheckForNull
    private String yaml;

    @DataBoundConstructor
    public ArmadaDeclarativeAgent() {
        System.out.println("ArmadaDeclarativeAgent constructor");
    }

    public String getYaml() {
        System.out.println("getYaml");
        return yaml;
    }

    @DataBoundSetter
    public void setYaml(String yaml) {
        System.out.println("setYaml");
        this.yaml = yaml;
    }

    public Map<String, Object> getAsArgs() {
        System.out.println("getAsArgs");
        Map<String, Object> argMap = new TreeMap<>();

        if (!StringUtils.isEmpty(yaml)) {
            argMap.put("yaml", yaml);
        }

        return argMap;
    }

    @OptionalExtension(requirePlugins = "pipeline-model-extensions")
    @Symbol("armada")
    public static class DescriptorImpl extends DeclarativeAgentDescriptor<ArmadaDeclarativeAgent> {

//        static final String[] POD_TEMPLATE_FIELDS = {
//                "namespace",
//                "inheritFrom",
//                "yaml",
//                "showRawYaml",
//                "instanceCap",
//                "podRetention",
//                "supplementalGroups",
//                "idleMinutes",
//                "activeDeadlineSeconds",
//                "serviceAccount",
//                "nodeSelector",
//                "workingDir",
//                "workspaceVolume"
//        };

        public DescriptorImpl() {
            System.out.println("DescriptorImpl constructor");
//            for (String field : new String[] {"cloud", "label"}) {
                addHelpFileRedirect("yaml", ArmadaDeclarativeAgent.class, "yaml");
//            }
//            for (String field : POD_TEMPLATE_FIELDS) {
//                addHelpFileRedirect(field, PodTemplate.class, field);
//            }
        }

        @NonNull
        @Override
        public String getDisplayName() {
            System.out.println("ArmadaDeclarativeAgent.getDisplayName");
            return "Armada";
        }

//        @SuppressWarnings("unused") // by stapler/jelly
//        public ListBoxModel doFillCloudItems() {
//            return ExtensionList.lookupSingleton(PodTemplateStep.DescriptorImpl.class)
//                    .doFillCloudItems();
//        }

//        @SuppressWarnings("unused") // by stapler/jelly
//        public ListBoxModel doFillInheritFromItems(@QueryParameter("cloud") String cloudName) {
//            return ExtensionList.lookupSingleton(PodTemplateStep.DescriptorImpl.class)
//                    .doFillInheritFromItems(cloudName);
//        }
    }
}
