import java.util.ArrayList;

public class ConcretePublisher implements Publisher {

    private ArrayList<Subscriber> subscribers;

    public ConcretePublisher() {
        subscribers = new ArrayList<>();

    }

    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber s : subscribers){
            s.update();
        }
    }
}
