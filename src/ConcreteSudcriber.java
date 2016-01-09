
public class ConcreteSudcriber implements Subscriber {
    private String name;

    public ConcreteSudcriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String namePub) {
        System.out.println(namePub + " " + name + " notified");
    }
}
