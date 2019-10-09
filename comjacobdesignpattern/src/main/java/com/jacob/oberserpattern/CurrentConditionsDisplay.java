package com.jacob.oberserpattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData){
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            System.out.println("转换成功");
            Float[] args = (Float[]) arg;
            temperature = args[0];
            humidity = args[1];
            pressure = args[2];
        }
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
