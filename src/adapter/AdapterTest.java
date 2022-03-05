package adapter;

// Client class
public class AdapterTest {
    public static void main(String[] args) {
        GreetHindi greetHindi = new EnglishAdapter(new EnglishGreeting());
        greetHindi.sayHelloInHindi();
    }
}
