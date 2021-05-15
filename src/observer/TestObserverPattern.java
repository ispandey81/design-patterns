package observer;

public class TestObserverPattern {
  public static void main(String[] args) {
      Subscriber subscriberOne = new SubscriberOne();
      Subscriber subscriberTwo = new SubscriberTwo();
      StreamingContentPublisher streamingContentPublisher = new Netflix();
      streamingContentPublisher.addSubscriber(subscriberOne);
      streamingContentPublisher.addSubscriber(subscriberTwo);
      streamingContentPublisher.notifySubscribers(new NewContent("Titanic-3D"));
      streamingContentPublisher.removeSubscriber(subscriberTwo);
      streamingContentPublisher.notifySubscribers(new NewContent("Avatar"));
  }
}
