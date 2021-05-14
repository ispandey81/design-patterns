package strategy;

//programming to interface
public class WorkFromOfficeStrategy implements WorkingStrategy {
    @Override
    public void work() {
        System.out.println("Working from the office");
    }
}
