/*
 * Fichier : Exercice1.java
 * Description : Correction de l'exercice 1 du laboratoire 2.
 * 				 Détermine la température en Fahrenheit équivalente à
 * 				 une température en Celsius fournie par l'utilisateur.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

import java.util.Locale;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner clavier;
		double temperatureCelsius, temperatureFahrenheit;
		
		clavier = new Scanner(System.in);
		clavier.useLocale(Locale.ENGLISH);

		System.out.print("Quel est la température en degrés celsius ? ");
		temperatureCelsius = clavier.nextDouble();
		
		temperatureFahrenheit = 9.0/5 * temperatureCelsius + 32;
		
		System.out.println(temperatureCelsius + " Celsius correspond à "
						   +temperatureFahrenheit + " Fahrenheit");
	}
}
