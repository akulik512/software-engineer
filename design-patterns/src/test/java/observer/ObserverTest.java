package observer;

import com.akulik.designpatterns.observer.CurrentConditionsDisplay;
import com.akulik.designpatterns.observer.WeatherData;
import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void test() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setTestData(80f, 65f, 30.4f);
        weatherData.setTestData(82f, 70f, 29.2f);
        weatherData.setTestData(78f, 90f, 29.2f);
    }
}