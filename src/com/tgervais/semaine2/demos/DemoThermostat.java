package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.Thermostat;

import java.util.Scanner;
import java.util.Locale;

public class DemoThermostat {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.ENGLISH);

        System.out.print("Entrez une température en degré Celcius: ");
        double tempcelcius = clavier.nextDouble();
        Thermostat therm =  new Thermostat(tempcelcius);
        System.out.println("La température entrée équivaut à " + tempcelcius
        + " et elle équivaut à: " + therm.calculTemperatureCToF()
        + " degrés Fahrenheit");

    }
}
