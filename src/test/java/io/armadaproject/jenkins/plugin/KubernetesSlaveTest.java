/*
 * The MIT License
 *
 * Copyright (c) 2016, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package io.armadaproject.jenkins.plugin;

import static org.junit.Assert.*;

import hudson.model.Descriptor;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import io.armadaproject.jenkins.plugin.pod.retention.Always;
import io.armadaproject.jenkins.plugin.pod.retention.Default;
import io.armadaproject.jenkins.plugin.pod.retention.Never;
import io.armadaproject.jenkins.plugin.pod.retention.OnFailure;
import io.armadaproject.jenkins.plugin.pod.retention.PodRetention;
import io.armadaproject.jenkins.plugin.volumes.PodVolume;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.WithoutJenkins;

/**
 * @author Carlos Sanchez
 */
public class KubernetesSlaveTest {

    @Rule
    public JenkinsRule r = new JenkinsRule();

    @WithoutJenkins
    @Test
    public void testGetSlaveName() {
        List<? extends PodVolume> volumes = Collections.emptyList();
        List<ContainerTemplate> containers = Collections.emptyList();

        KubernetesTestUtil.assertRegex(KubernetesSlave.getSlaveName(new PodTemplate("image", volumes)), "^jenkins-agent-[0-9a-z]{5}$");
        KubernetesTestUtil.assertRegex(
                KubernetesSlave.getSlaveName(new PodTemplate("", volumes, containers)), "^jenkins-agent-[0-9a-z]{5}$");
        KubernetesTestUtil.assertRegex(
                KubernetesSlave.getSlaveName(new PodTemplate("a name", volumes, containers)), ("^a-name-[0-9a-z]{5}$"));
        KubernetesTestUtil.assertRegex(
                KubernetesSlave.getSlaveName(new PodTemplate("an_other_name", volumes, containers)),
                ("^an-other-name-[0-9a-z]{5}$"));
        KubernetesTestUtil.assertRegex(
                KubernetesSlave.getSlaveName(new PodTemplate("whatever...", volumes, containers)),
                ("jenkins-agent-[0-9a-z]{5}"));
    }

    @Test
    public void testGetPodRetention() {
        try {
            List<KubernetesSlaveTestCase<PodRetention>> cases = Arrays.asList(
                    createPodRetentionTestCase(new Never(), new Default(), new Default()),
                    createPodRetentionTestCase(new Never(), new Always(), new Always()),
                    createPodRetentionTestCase(new Never(), new OnFailure(), new OnFailure()),
                    createPodRetentionTestCase(new Never(), new Never(), new Never()),
                    createPodRetentionTestCase(new OnFailure(), new Default(), new Default()),
                    createPodRetentionTestCase(new OnFailure(), new Always(), new Always()),
                    createPodRetentionTestCase(new OnFailure(), new OnFailure(), new OnFailure()),
                    createPodRetentionTestCase(new OnFailure(), new Never(), new Never()),
                    createPodRetentionTestCase(new Always(), new Default(), new Default()),
                    createPodRetentionTestCase(new Always(), new Always(), new Always()),
                    createPodRetentionTestCase(new Always(), new OnFailure(), new OnFailure()),
                    createPodRetentionTestCase(new Always(), new Never(), new Never()));
            ArmadaCloud cloud = new ArmadaCloud("test");
            r.jenkins.clouds.add(cloud);
            for (KubernetesSlaveTestCase<PodRetention> testCase : cases) {
                cloud.setPodRetention(testCase.getCloudPodRetention());
                KubernetesSlave testSlave = testCase.buildSubject(cloud);
                assertEquals(testCase.getExpectedResult(), testSlave.getPodRetention(cloud));
            }
        } catch (IOException | Descriptor.FormException e) {
            fail(e.getMessage());
        }
    }

    private KubernetesSlaveTestCase<PodRetention> createPodRetentionTestCase(
            PodRetention cloudRetention, PodRetention templateRetention, PodRetention expectedResult) {
        return new KubernetesSlaveTestBuilder<PodRetention>()
                .withCloudPodRetention(cloudRetention)
                .withTemplatePodRetention(templateRetention)
                .withExpectedResult(expectedResult)
                .build();
    }

    public static class KubernetesSlaveTestCase<T> {

        private PodRetention cloudPodRetention;
        private PodTemplate podTemplate;
        private String podPhase;
        private T expectedResult;

        public KubernetesSlave buildSubject(ArmadaCloud cloud) throws IOException, Descriptor.FormException {
            return new KubernetesSlave.Builder()
                    .cloud(cloud)
                    .podTemplate(podTemplate)
                    .build();
        }

        public PodRetention getCloudPodRetention() {
            return this.cloudPodRetention;
        }

        public T getExpectedResult() {
            return this.expectedResult;
        }

        public PodTemplate getPodTemplate() {
            return this.podTemplate;
        }

        public String getPodPhase() {
            return this.podPhase;
        }
    }

    public static class KubernetesSlaveTestBuilder<T> {

        private PodRetention cloudPodRetention;
        private PodRetention templatePodRetention;
        private String podPhase;
        private T expectedResult;

        public KubernetesSlaveTestBuilder<T> withExpectedResult(T expectedResult) {
            this.expectedResult = expectedResult;
            return this;
        }

        public KubernetesSlaveTestBuilder<T> withCloudPodRetention(PodRetention podRetention) {
            this.cloudPodRetention = podRetention;
            return this;
        }

        public KubernetesSlaveTestBuilder<T> withTemplatePodRetention(PodRetention podRetention) {
            this.templatePodRetention = podRetention;
            return this;
        }

        public KubernetesSlaveTestBuilder<T> withPodPhase(String podPhase) {
            this.podPhase = podPhase;
            return this;
        }

        public KubernetesSlaveTestCase<T> build() {
            ContainerTemplate testContainer = new ContainerTemplate("busybox", "busybox");
            PodTemplate testTemplate = new PodTemplate();
            testTemplate.setPodRetention(templatePodRetention);
            testTemplate.setName("test-template");
            testTemplate.setLabel("test-template");
            testTemplate.setContainers(Arrays.asList(testContainer));

            KubernetesSlaveTestCase<T> testCase = new KubernetesSlaveTestCase<>();
            testCase.cloudPodRetention = cloudPodRetention;
            testCase.podTemplate = testTemplate;
            testCase.expectedResult = expectedResult;
            testCase.podPhase = podPhase;
            return testCase;
        }
    }
}
