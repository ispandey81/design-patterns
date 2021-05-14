package strategy;

//programming to interface
public class WorkFromHomeStrategy implements WorkingStrategy {
    @Override
    public void work() {
        System.out.println("Working from home");
    }
}
