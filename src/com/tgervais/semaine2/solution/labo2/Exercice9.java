/*
 * Fichier : Exercice9.java
 * Description : Correction de l'exercice 9 du laboratoire 2.
 * 				 Lit au clavier une série de nombres et détermine, pour chacun,
 * 				 s'il est premier.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

import java.util.Locale;
import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		Scanner clavier;
		int nombre, diviseur, racineCarree;
		boolean estPremier;

		clavier = new Scanner(System.in);
		clavier.useLocale(Locale.ENGLISH);

		System.out.print("Entrez un nombre entier positif (0 pour terminer) : ");
		nombre = clavier.nextInt();

		while (nombre != 0) {
			// On v�rifie si nombre est premier (même code que l'exercice 4):
			if (nombre <= 1)
				estPremier = false;
			else {
				diviseur = 2;

				racineCarree = (int) Math.sqrt(nombre);
				estPremier = true; // on présume que le nombre est premier jusqu'à
									// preuve du contraire
				while (diviseur <= racineCarree && estPremier) {
					if (nombre % diviseur == 0)// nombre est divisible par diviseur
						estPremier = false;
					diviseur++;
				}
			}
			if (estPremier)
				System.out.println("Le nombre " + nombre + " est premier");
			else
				System.out.println("Le nombre " + nombre + " n'est pas premier");
			// On demande le nombre suivant :
			System.out.print("Entrez un autre nombre entier positif (0 pour terminer) : ");
			nombre = clavier.nextInt();
		}
	}
}