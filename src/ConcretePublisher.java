import java.util.ArrayList;

public class ConcretePublisher implements Publisher {

    private String namePub;
    private ArrayList<Subscriber> subscribers;

    public ConcretePublisher(String namePub) {
        subscribers = new ArrayList<>();
        setNamePub(namePub);
    }

    public String getNamePub() {
        return namePub;
    }

    public void setNamePub(String namePub) {
        this.namePub = namePub;
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
            s.update(namePub);
        }
    }
}
