package observer;

public class SubscriberOne implements Subscriber{
    @Override
    public void update(Object o) {
        NewContent newContent = (NewContent) o;
        System.out.println("Subscriber one "+ newContent.getName());
    }
}
