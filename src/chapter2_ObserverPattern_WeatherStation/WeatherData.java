package chapter2_ObserverPattern_WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {
    // WeatherData implements Subject interface
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    // start of implementing Subject interface
    public void registerObserver(Observer o) {
        // when observer registers, add i to end of list
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        // when observer wants to unregister, take it off the list
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        // this is where we tell observers about the state
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    // end of interface implementation

    public void measurementsChanged() {
        // notify all Observers when we get updated measurements from the Weather Station
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        // this method used to test display elements in absence of actual weather station
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
