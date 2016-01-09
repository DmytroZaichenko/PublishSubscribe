
public class ConcreteSudcriber implements Subscriber {

    @Override
    public void update() {
        System.out.println(this.toString() + " notified");
    }
}
