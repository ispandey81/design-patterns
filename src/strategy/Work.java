package strategy;

public class Work {
    // Composition over inheritance
    private WorkingStrategy workingStrategy;

    public Work(WorkingStrategy strategy) {
        this.workingStrategy = strategy;
    }

    public void setWorkingStrategy(WorkingStrategy workingStrategy) {
        this.workingStrategy = workingStrategy;
    }

    public void work() {
        this.workingStrategy.work();
    }
}
