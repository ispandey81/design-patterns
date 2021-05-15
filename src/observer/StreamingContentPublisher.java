package observer;

public interface StreamingContentPublisher {
    void addSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscribers(Object o);
}
