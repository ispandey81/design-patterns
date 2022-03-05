package templatemethod;

public abstract class CaffeineBeverage {
    // template method - defines the steps of an algorithm which in this case is preparing a caffeine beverage
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    // the implementations of these methods are provided by the subclasses
    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
