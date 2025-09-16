package com.tgervais.semaine2.classes;

public class Thermostat {
    private double temperatureCelsius;

    public Thermostat(double temperaturecelsius){
        temperatureCelsius = temperaturecelsius;
    }

    public double calculTemperatureCToF(){
        double fahrenheit = 9.0/5 * temperatureCelsius + 32;
        return fahrenheit;
    }
}
