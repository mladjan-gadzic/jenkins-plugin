package io.armadaproject.jenkins.plugin;

import java.io.IOException;
import io.armadaproject.jenkins.plugin.pod.decorator.PodDecorator;
import org.junit.Before;
import org.junit.Test;

public class RestrictedPssSecurityInjectorTest extends AbstractGoldenFileTest {
    @Before
    public void configureCloud() {
        cloud.setRestrictedPssSecurityContext(true);
    }

    @Override
    protected PodDecorator newDecorator() {
        return new RestrictedPssSecurityContextInjector();
    }

    @Test
    public void simple() throws IOException {
        test("simple");
    }

    @Test
    public void multiContainer() throws IOException {
        test("multiContainer");
    }

    @Test
    public void existingSecurityContext() throws IOException {
        test("existingSecurityContext");
    }
}
