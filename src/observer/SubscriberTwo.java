package observer;

public class SubscriberTwo implements Subscriber{
    @Override
    public void update(Object o) {
        NewContent newContent = (NewContent) o;
        System.out.println("Subscriber two "+ newContent.getName());
    }
}
