package templatemethod;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Get coffee through a filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar");
    }
}
