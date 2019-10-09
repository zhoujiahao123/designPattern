package com.jacob.oberserpattern;



public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        System.out.println(currentConditionsDisplay.toString());
        weatherData.setTemperature(100,100,100);
        System.out.println(currentConditionsDisplay.toString());
    }
}
