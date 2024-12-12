package io.armadaproject.jenkins.plugin.pipeline;

import java.net.UnknownHostException;
import io.armadaproject.jenkins.plugin.pipeline.steps.AssertBuildStatusSuccess;
import io.armadaproject.jenkins.plugin.pipeline.steps.RunId;
import io.armadaproject.jenkins.plugin.pipeline.steps.SetupCloud;
import org.junit.Test;

public class KubernetesPipelineWebsocketRJRTest extends AbstractKubernetesPipelineRJRTest {

    public KubernetesPipelineWebsocketRJRTest() throws UnknownHostException {
        super(new SetupCloud(true));
    }

    @Test
    public void basicPipeline() throws Throwable {
        RunId runId = createWorkflowJobThenScheduleRun();
        rjr.runRemotely(new AssertBuildStatusSuccess(runId));
    }
}
