/*
 * Fichier : Exercice2.java
 * Description : Correction de l'exercice 2 du laboratoire 2.
 * 				 Détermine le volume d'un cylindre à partir du rayon de sa
 * 				 section et de sa hauteur fournies par l'utilisateur.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

import java.util.Locale;
import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {

		Scanner clavier;
		double rayonSection, hauteur, volume;
		
		clavier = new Scanner(System.in);
		clavier.useLocale(Locale.ENGLISH);

		System.out.print("Quel est le rayon de la section ? ");
		rayonSection = clavier.nextDouble();
		
		System.out.print("Quel est la hauteur du cylindre ? ");
		hauteur = clavier.nextDouble();
		
		//Calcul du volume du cylindre :
		volume = hauteur * Math.PI * Math.pow(rayonSection, 2);
		
		System.out.println("Le volume du cylindre de rayon de section " 
						   +rayonSection + " et de hauteur " + hauteur
						   +" est " + volume);
	}

}
