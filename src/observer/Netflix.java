package observer;

import java.util.ArrayList;
import java.util.List;

public class Netflix implements StreamingContentPublisher {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        int i = subscribers.indexOf(s);
        if (i >= 0) {
            subscribers.remove(s);
        }
    }

    @Override
    public void notifySubscribers(Object o) {
        for (Subscriber s: subscribers) {
            s.update(o);
        }
    }
}
