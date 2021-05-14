package strategy;

public class WorkTest {
    public static void main(String[] arg) {
        Work home = new Work(new WorkFromHomeStrategy());
        home.work();
        Work office = new Work(new WorkFromOfficeStrategy());
        office.work();
        office.setWorkingStrategy(new FlexibleWorkingStrategy());
        office.work();
    }
}
