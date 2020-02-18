package chapter2_ObserverPattern_WeatherStation;

public interface Subject {
    // Takes an Observer to be registered as an argument
    public void registerObserver(Observer o);

    // Takes an Observer to be removed as an argument
    public void removeObserver(Observer o);

    // Called to notify all observers when Subject's state has changed
    public void notifyObservers();
}
