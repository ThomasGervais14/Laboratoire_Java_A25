/*
 * Fichier : Exercice4.java
 * Description : Correction de l'exercice 4 du laboratoire 2.
 * 				 Détermine le nombre de mètres cubes de béton qu'on peut
 * 			 	 produire à partir de quantités de ciment, de sable et de
 * 				 gravier fournies par l'utilisateur.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

import java.util.Locale;
import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		final int QTE_CIMENT = 350, //quantité de ciment pour 1m3 de béton
					 QTE_SABLE = 680, //quantité de sable pour 1m3 de béton
					 QTE_GRAVIER = 1175; //quantité de gravier pour 1m3 de béton
		Scanner clavier;
		int ciment, sable, gravier, //les quantités d'entrée
			beton, //quantité de béton possible
			qtePossibleCiment, //quantités de
			qtePossibleSable,  // béton par
			qtePossibleGravier;// type
		
		clavier = new Scanner(System.in);
		clavier.useLocale(Locale.ENGLISH);

		//Saisie des donn�es :
		System.out.print("Entrez la quantité de ciment : ");
		ciment = clavier.nextInt();

		System.out.print("Entrez la quantité de sable : ");
		sable = clavier.nextInt();

		System.out.print("Entrez la quantité de gravier : ");
		gravier = clavier.nextInt();
		
		//On calcule la quantité de béton possible pour chaque type :
		qtePossibleCiment = ciment/QTE_CIMENT;
		qtePossibleSable = sable/QTE_SABLE;
		qtePossibleGravier = gravier/QTE_GRAVIER;
		
		//On détermine la petite des 3 quantit�s :
		beton = Math.min( Math.min(qtePossibleCiment, qtePossibleSable), 
						  qtePossibleGravier);
		
		//On affiche le résultat :
		System.out.println("Avec " + ciment + "kg de ciment, " 
							+ sable + "kg de sable et " 
							+ gravier + "kg de gravier, on peut produire "
							+ beton +"m3 de béton.");
	}

}
