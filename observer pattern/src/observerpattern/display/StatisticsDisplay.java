package observerpattern.display;

import observerpattern.WeatherData;
import observerpattern.observerinterface.DisplayElement;
import observerpattern.observerinterface.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum = 0.0f;
    private int numReadings = 0;
    private WeatherData weatherData;

    public StatisticsDisplay( WeatherData weatherData ) {
        this.weatherData = weatherData;
        weatherData.registerObserver( this );
    }

    @Override
    public void update( float temperature, float humidity, float pressure ) {
        temperatureSum += temperature;
        numReadings++;

        if ( temperature > maxTemperature ) {
            maxTemperature = temperature;
        }

        if ( temperature < minTemperature ) {
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        StringBuilder builder = new StringBuilder();
        builder.append( "평균 온도 : " );
        builder.append( temperatureSum / numReadings );
        builder.append( " / 최대 온도 : " );
        builder.append( maxTemperature );
        builder.append( " / 최저 온도 : " );
        builder.append( minTemperature );
        System.out.println(builder.toString());
    }

}
