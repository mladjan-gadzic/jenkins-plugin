package random;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.model.Descriptor;
import hudson.model.DescriptorVisibilityFilter;
import hudson.slaves.Cloud;
import java.util.List;
import java.util.stream.Collectors;
import jenkins.model.Jenkins;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

public class NonConfigurableArmadaCloud extends
    ArmadaCloud {
    public NonConfigurableArmadaCloud(@NonNull String name, @NonNull ArmadaCloud source) {
        super(name, source);
    }

    @Override
    public void replaceTemplate(PodTemplate oldTemplate, PodTemplate newTemplate) {}

    @Override
    public void addTemplate(PodTemplate template) {}

    @Override
    public void removeTemplate(PodTemplate template) {}

    @Override
    public Cloud reconfigure(@NonNull StaplerRequest req, JSONObject form) throws Descriptor.FormException {
        return DescriptorImpl.class.cast(getDescriptor()).newInstance(req, form);
    }

    @NonNull
    @Override
    public List<PodTemplate> getTemplates() {
        return super.getTemplates().stream()
                .peek(podTemplate -> podTemplate.setReadonlyFromUi(true))
                .collect(Collectors.toList());
    }

    @Extension
    public static class FilterImpl extends DescriptorVisibilityFilter {
        @Override
        public boolean filter(Object context, Descriptor descriptor) {
            return !(descriptor instanceof DescriptorImpl);
        }
    }

    @Extension
    public static class DescriptorImpl extends ArmadaCloud.DescriptorImpl {
        @Override
        public String getDisplayName() {
            return Messages.NonConfigurableKubernetesCloud_displayName();
        }

        @Override
        public boolean configure(StaplerRequest request, JSONObject object) throws FormException {
            return true;
        }

        @Override
        public Cloud newInstance(StaplerRequest req, JSONObject formData) throws FormException {
            if (req != null) {
                // We prevent the cloud reconfiguration from the web UI
                String cloudName = req.getParameter("cloudName");
                return Jenkins.get().getCloud(cloudName);
            } else {
                throw new IllegalStateException("Expecting req to be non-null");
            }
        }
    }
}
