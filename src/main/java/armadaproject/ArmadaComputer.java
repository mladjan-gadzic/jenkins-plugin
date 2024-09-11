package armadaproject;

import hudson.model.Executor;
import hudson.model.Queue;
import hudson.slaves.AbstractCloudComputer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArmadaComputer extends AbstractCloudComputer<ArmadaSlave> {

  private static final Logger LOG = Logger.getLogger(ArmadaComputer.class.getName());

  public ArmadaComputer(ArmadaSlave slave) {
    super(slave);
    LOG.info("ArmadaComputer constructor");
  }

  @Override
  public void taskAccepted(Executor executor, Queue.Task task) {
    LOG.info("Computer taskAccepted");
    super.taskAccepted(executor, task);
    Queue.Executable exec = executor.getCurrentExecutable();
    LOG.log(Level.INFO, " Computer {0} accepted task {1}", new Object[]{this, exec});
  }

  @Override
  public void taskCompleted(Executor executor, Queue.Task task, long durationMS) {
    LOG.info("Computer taskCompleted");
    Queue.Executable exec = executor.getCurrentExecutable();
    super.taskCompleted(executor, task, durationMS);
    LOG.log(Level.INFO, " Computer {0} completed task {1}", new Object[]{this, exec});
  }

  @Override
  public void taskCompletedWithProblems(Executor executor, Queue.Task task, long durationMS,
      Throwable problems) {
    LOG.info("Computer taskCompletedWithProblems");
    super.taskCompletedWithProblems(executor, task, durationMS, problems);
    Queue.Executable exec = executor.getCurrentExecutable();
    LOG.log(Level.INFO, " Computer {0} completed task {1} with problems",
        new Object[]{this, exec});
  }
}
