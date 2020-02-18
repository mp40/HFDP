package chapter2_ObserverPattern_WeatherStation;

public interface Observer {
    // This interface is implemented by all observers, so all have to implement the update method
    public void update(float temp, float humidity, float pressure);
    // parameters are state values the Observers get from the Subject when weather measurement changes
}
