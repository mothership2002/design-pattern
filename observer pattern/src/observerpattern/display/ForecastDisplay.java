package observerpattern.display;

import observerpattern.WeatherData;
import observerpattern.observerinterface.DisplayElement;
import observerpattern.observerinterface.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = ( float ) Math.random() * 100;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay( WeatherData weatherData ) {
        this.weatherData = weatherData;
        weatherData.registerObserver( this );
    }

    @Override
    public void update( float temperature, float humidity, float pressure ) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        StringBuilder builder = new StringBuilder();
        builder.append( "Forecast : " );
        if ( currentPressure > lastPressure ) {
            builder.append( "날씨가 쾌청 해졌어요 !" );
        }
        else if ( currentPressure == lastPressure ) {
            builder.append( "날씨가 변함이 없어요." );
        }
        else if ( currentPressure < lastPressure ) {
            builder.append( "기압이 낮아졌어요. 비가 올 수도 있을거 같아요." );
        }
        System.out.println(builder.toString());
        System.out.println();
    }

}
