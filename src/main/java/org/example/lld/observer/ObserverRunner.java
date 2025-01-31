package org.example.lld.observer;

public class ObserverRunner {

    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();
        Observer tv = new TvDisplay();
        Observer mobile = new MobileDisplay();

        weatherStation.addObserver(tv);
        weatherStation.addObserver(mobile);

        weatherStation.setWeather("humid");
        Thread.sleep(1000);
        weatherStation.setWeather("rainy");
    }



}
