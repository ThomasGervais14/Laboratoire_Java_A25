/*
 * Fichier : Exercice6.java
 * Description : Correction de l'exercice 6 du laboratoire 2.
 * 				 Affiche tous les diviseurs d'un nombre saisi au clavier.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

import java.util.Locale;
import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner clavier;
		int nombre, diviseur;
		
		clavier = new Scanner(System.in);
		clavier.useLocale(Locale.ENGLISH);

		System.out.print("Entrez un nombre entier positif : ");
		nombre = clavier.nextInt();
		
		System.out.println("Voici les diviseurs de "+nombre+" :"); 
		diviseur = 1;
		while (diviseur<=nombre) {
			if (nombre%diviseur==0)//nombre est divisible par diviseur
				System.out.print(diviseur+"\t");
			diviseur++;
		}		
	}

}
