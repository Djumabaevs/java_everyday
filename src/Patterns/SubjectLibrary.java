package Patterns;

public interface SubjectLibrary {

    public void subscribeObserver(Observer ob);

    void unsubscribeObserver(Observer ob);

    void notifyObserver();

}
