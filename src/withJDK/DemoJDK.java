package withJDK;

public class DemoJDK {

    public static void main(String[] args) {

        Publisher newspaper = new Publisher("newspaper");
        Publisher journal = new Publisher("Journal");

        Sudcriber sudcriber1 = new Sudcriber("Dmytro");
        Sudcriber sudcriber2 = new Sudcriber("Mikola");
        Sudcriber sudcriber3 = new Sudcriber("Taras");

        newspaper.addObserver(sudcriber1);
        newspaper.addObserver(sudcriber2);
        newspaper.addObserver(sudcriber3);

        journal.addObserver(sudcriber1);
        journal.addObserver(sudcriber2);

        journal.doNotifyObservers();
        newspaper.doNotifyObservers();



    }

}
