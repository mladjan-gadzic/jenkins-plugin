package io.armadaproject.jenkins.plugin.pod.decorator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import edu.umd.cs.findbugs.annotations.NonNull;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.PodBuilder;
import io.armadaproject.jenkins.plugin.KubernetesCloud;
import io.armadaproject.jenkins.plugin.KubernetesSlave;
import io.armadaproject.jenkins.plugin.PodTemplate;
import io.armadaproject.jenkins.plugin.PodTemplateBuilder;
import io.armadaproject.jenkins.plugin.pod.decorator.PodDecorator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.TestExtension;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class PodDecoratorTest {
    @Rule
    public JenkinsRule j = new JenkinsRule();

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private KubernetesSlave slave;

    private KubernetesCloud cloud = new KubernetesCloud("test");

    @Before
    public void setUp() {
        when(slave.getKubernetesCloud()).thenReturn(cloud);
    }

    @TestExtension("activeDecorator")
    public static class PodDecoratorImpl implements PodDecorator {
        @NonNull
        @Override
        public Pod decorate(@NonNull KubernetesCloud kubernetesCloud, @NonNull Pod pod) {
            // @formatter:off
            return new PodBuilder(pod)
                    .editOrNewMetadata()
                    .addToLabels("poddecoratorimpl", "true")
                    .endMetadata()
                    .build();
            // @formatter:on
        }
    }

    @Test
    public void activeDecorator() {
        PodTemplate podTemplate = new PodTemplate();
        PodTemplateBuilder podTemplateBuilder = new PodTemplateBuilder(podTemplate, slave);
        Pod pod = podTemplateBuilder.build();
        assertEquals("true", pod.getMetadata().getLabels().get("poddecoratorimpl"));
    }
}
