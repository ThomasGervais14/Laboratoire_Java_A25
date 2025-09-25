/*
 * Fichier : Exercice3.java
 * Description : Correction de l'exercice 3 du laboratoire 2.
 * 				 Détermine le nombre d'heures, de minutes et de secondes
 * 				 contenus dans une durée totale en secondes fournie par
 * 				 l'utilisateur.
 * Date : 2022-01-02
 * Auteur : Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * Version : 1.0
 */
package com.tgervais.semaine2.solution.labo2;

import java.util.Locale;
import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		final int SECONDES_PAR_HEURE = 3600,
				  SECONDES_PAR_MINUTE = 60;
		Scanner clavier;
		int dureeTotaleEnSecondes,
			secondes, minutes, heures;
		
		clavier = new Scanner(System.in);
		clavier.useLocale(Locale.ENGLISH);

		System.out.print("Entrez la durée totale en secondes : ");
		dureeTotaleEnSecondes = clavier.nextInt();
		
		//Nombre d'heures contenu dans la durée totale :
		heures = dureeTotaleEnSecondes/SECONDES_PAR_HEURE;
		
		//Nombre de secondes restantes après avoir retranché les heures :
		dureeTotaleEnSecondes = dureeTotaleEnSecondes%SECONDES_PAR_HEURE;
		
		//Nombre de minutes contenu dans la durée restante :
		minutes = dureeTotaleEnSecondes/SECONDES_PAR_MINUTE;
		
		//Nombre de secondes restantes après avoir retranché les minutes :
		secondes = dureeTotaleEnSecondes%SECONDES_PAR_MINUTE;		
		
		System.out.println("Voici la durée dans le format heures:minutes:secondes : "
						   +heures + "h:" + minutes+"m:" + secondes + "s");
	}

}
