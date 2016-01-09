
public class Demo {
    public static void main(String[] args) {

        ConcretePublisher newspaper = new ConcretePublisher("newspaper");
        ConcretePublisher journal = new ConcretePublisher("Journal");

        Subscriber subscriber1 = new ConcreteSudcriber("Dmytro");
        Subscriber subscriber2 = new ConcreteSudcriber("Mikola");
        Subscriber subscriber3 = new ConcreteSudcriber("Taras");


        newspaper.addSubscriber(subscriber1);
        newspaper.addSubscriber(subscriber2);
        newspaper.addSubscriber(subscriber3);

        journal.addSubscriber(subscriber1);
        journal.addSubscriber(subscriber2);

        newspaper.notifySubscriber();
        journal.notifySubscriber();

    }
}
