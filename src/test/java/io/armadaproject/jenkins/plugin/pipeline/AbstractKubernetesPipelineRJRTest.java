package io.armadaproject.jenkins.plugin.pipeline;

import static io.armadaproject.jenkins.plugin.KubernetesTestUtil.assumeKubernetes;

import org.apache.commons.lang.StringUtils;
import io.armadaproject.jenkins.plugin.KubernetesTestUtil;
import io.armadaproject.jenkins.plugin.pipeline.steps.CreateWorkflowJobThenScheduleRun;
import io.armadaproject.jenkins.plugin.pipeline.steps.RunId;
import io.armadaproject.jenkins.plugin.pipeline.steps.SetupCloud;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.jvnet.hudson.test.RealJenkinsRule;

public abstract class AbstractKubernetesPipelineRJRTest {

    @Rule
    public TestName name = new TestName();

    @Rule
    public RealJenkinsRule rjr;

    {
        rjr = new RealJenkinsRule();
        String port = System.getProperty("port");
        if (StringUtils.isNotBlank(port)) {
            System.err.println("Overriding port using system property: " + port);
            rjr = rjr.withPort(Integer.parseInt(port));
        }
    }

    private SetupCloud setup;

    public AbstractKubernetesPipelineRJRTest(SetupCloud setup) {
        this.setup = setup;
    }

    @BeforeClass
    public static void isKubernetesConfigured() throws Exception {
        assumeKubernetes();
    }

    @Before
    public void setUp() throws Throwable {
        rjr.startJenkins();
        rjr.runRemotely(setup);
    }

    protected RunId createWorkflowJobThenScheduleRun() throws Throwable {
        return rjr.runRemotely(new CreateWorkflowJobThenScheduleRun(
                KubernetesTestUtil.loadPipelineScript(getClass(), name.getMethodName() + ".groovy")));
    }
}
