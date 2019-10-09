package com.jacob.oberserpattern.subject;

import com.jacob.oberserpattern.observer.Observer;
import com.jacob.oberserpattern.subject.Subject;
import javafx.beans.InvalidationListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        int num = observerList.indexOf(observer);
        if (num >= 0) {
            observerList.remove(num);
        }
    }
    private void measurementsChanged(){
        notifyObservers();
    }
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setTemperature(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
