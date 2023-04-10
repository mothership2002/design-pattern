package observerpattern.display;

import observerpattern.WeatherData;
import observerpattern.observerinterface.DisplayElement;
import observerpattern.observerinterface.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay( WeatherData weatherData ) {
        this.weatherData = weatherData;
        weatherData.registerObserver( this );
    }

    @Override
    public void update( float temperature, float humidity, float pressure ) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        StringBuilder builder = new StringBuilder();

        builder.append( "Current Conditions : " );
        builder.append( temperature );
        builder.append( "`F (화씨) / 습도 : " );
        builder.append( humidity );
        builder.append( "%" );

        System.out.println(builder.toString());
    }

}
