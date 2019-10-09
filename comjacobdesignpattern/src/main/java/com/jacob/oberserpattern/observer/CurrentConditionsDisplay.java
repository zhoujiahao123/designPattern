package com.jacob.oberserpattern.observer;

import com.jacob.oberserpattern.observer.Observer;
import com.jacob.oberserpattern.subject.Subject;

public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.subject = weatherData;
        subject.addObserver(this);
    }


    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
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
