/*
 * Fichier : Exercice7.java
 * Description : Correction de l'exercice 7 du laboratoire 2.
 * 				 Calcule une estimation de PI à l'aide du produit
 * 				 de Wallis.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

public class Exercice7 {

	public static void main(String[] args) {
		double pi;
		double k;
		
		pi = 1;
		for (k=0;k<10000;k++)
			pi *= (2*k+2)/(2*k+1)*(2*k+2)/(2*k+3);
		pi *= 2; //ou: pi = pi*2;
		
		System.out.println("pi = "+pi);
	}
}
