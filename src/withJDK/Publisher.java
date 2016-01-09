package withJDK;


import java.util.Observable;

public class Publisher extends Observable {

    private String namePub;

    public Publisher(String namePub) {
        setNamePub(namePub);
    }


    public void setNamePub(String namePub) {
        this.namePub = namePub;
    }

    public String getNamePub() {
        return namePub;
    }

    public void doNotifyObservers(){
        setChanged();
        notifyObservers();
    }


}
