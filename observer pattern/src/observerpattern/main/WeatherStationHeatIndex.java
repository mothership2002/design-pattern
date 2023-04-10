package observerpattern.main;

import observerpattern.WeatherData;
import observerpattern.display.CurrentConditionsDisplay;
import observerpattern.display.ForecastDisplay;
import observerpattern.display.HeatIndexDisplay;
import observerpattern.display.StatisticsDisplay;

public class WeatherStationHeatIndex {

    public static void main( String[] args ) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay( weatherData );
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay( weatherData );
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay( weatherData );
        ForecastDisplay forecastDisplay = new ForecastDisplay( weatherData );

        weatherData.setMeasurements( 80, 65, 30.4f );
        weatherData.setMeasurements( 82, 70, 29.2f );
        weatherData.setMeasurements( 78, 90, 29.2f );

        System.out.println("forecastDisplay 제거 !");
        System.out.println();

        weatherData.removeObserver( forecastDisplay );
        weatherData.setMeasurements( 62, 90, 28.1f );
    }
}
