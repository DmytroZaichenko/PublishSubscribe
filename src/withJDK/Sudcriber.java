package withJDK;

import java.util.Observable;
import java.util.Observer;

public class Sudcriber implements Observer {
    private String name;

    public Sudcriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(((Publisher) o).getNamePub()+" " + name +  " notified");

    }


}
