/*
 * Fichier : Exercice5.java
 * Description : Correction de l'exercice 5 du laboratoire 2.
 * 				 Affiche tous les nombres impairs entre 0 et 200.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

public class Exercice5 {

	public static void main(String[] args) {
		int nombre;
		
		nombre = 0;
		while (nombre<=200) {
			if (nombre%2==1) //si le nombre est impair
				System.out.println(nombre);
			nombre++;
		}
		System.out.println("Bye Bye !");
	}
}