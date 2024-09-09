//package io.jenkins.plugins.armada.agent;
//
//import hudson.model.Executor;
//import hudson.model.Queue;
//import hudson.slaves.AbstractCloudComputer;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class ArmadaAgentComputer extends AbstractCloudComputer<ArmadaAgentSlave> {
//    private static final Logger LOGGER = Logger.getLogger(ArmadaAgentComputer.class.getName());
//
//    public ArmadaAgentComputer(ArmadaAgentSlave slave) {
//        super(slave);
//        System.out.println("ArmadaAgentComputer constructor");
//    }
//
//    @Override
//    public void taskAccepted(Executor executor, Queue.Task task) {
//        System.out.println("Computer taskAccepted");
//        super.taskAccepted(executor, task);
//        Queue.Executable exec = executor.getCurrentExecutable();
//        LOGGER.log(Level.FINE, " Computer {0} accepted task {1}", new Object[]{this, exec});
//    }
//
//    @Override
//    public void taskCompleted(Executor executor, Queue.Task task, long durationMS) {
//        System.out.println("Computer taskCompleted");
//        Queue.Executable exec = executor.getCurrentExecutable();
//        LOGGER.log(Level.FINE, " Computer {0} completed task {1}", new Object[] {this, exec});
//        super.taskCompleted(executor, task, durationMS);
//    }
//
//    @Override
//    public void taskCompletedWithProblems(Executor executor, Queue.Task task, long durationMS, Throwable problems) {
//        System.out.println("Computer taskCompletedWithProblems");
//        super.taskCompletedWithProblems(executor, task, durationMS, problems);
//        Queue.Executable exec = executor.getCurrentExecutable();
//        LOGGER.log(Level.FINE, " Computer {0} completed task {1} with problems", new Object[] {this, exec});
//    }
//}
