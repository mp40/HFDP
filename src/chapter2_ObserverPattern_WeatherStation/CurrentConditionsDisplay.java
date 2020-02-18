package chapter2_ObserverPattern_WeatherStation;

// this display implements Observer so it can get changes from WeatherData object
// also implements DisplayElements because our API requires all display elements to implement this interface
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        // constructor is passed the weatherData object (the Subject) and used to register the display as observer
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        // when update called, save temp and humidity and call display
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
