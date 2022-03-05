package adapter;
// implementing the target interface which in this case is the GreetHindi interface
public class EnglishAdapter implements GreetHindi{
    // Adaptee
    GreetEnglish greetEnglish;

    public EnglishAdapter(GreetEnglish greetEnglish) {
        this.greetEnglish = greetEnglish;
    }

    @Override
    public void sayHelloInHindi() {
        System.out.println("The adapter says - Namaste");
    }
}
