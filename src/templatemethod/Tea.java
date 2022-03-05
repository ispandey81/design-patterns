package templatemethod;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dipping the teabag in boiling water");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding ginger and lemon");
    }
}
