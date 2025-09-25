package com.tgervais.semaine3.Solution.exercice2;

import java.util.Locale;
import java.util.Scanner;

public class Programme2 {

		public static void main(String[] args) {
			String[] fruits = {"Poires","Figues","Grenadines","Prunes","Mangues",
					"Raisins","Mandarines","Pommes","Melons","Kiwis","Abricots",
					"Bananes","Cerises"};
			String fruitCherche;
			boolean trouvee;
			int debut;
			int fin;
			int milieu;

			Scanner clavier = new Scanner(System.in);
			clavier.useLocale(Locale.ENGLISH);

			//tri du tableau par insertion :
			int i, j;
			String temp;
			for (i = 1; i < fruits.length; ++i) {
				temp = fruits[i];
				for (j = i; j > 0 && fruits[j-1].compareTo(temp) > 0; j--) {
					fruits[j] = fruits[j-1];
				}
				fruits[j] = temp;
			}
			//Affichage du tableau :
			System.out.println("Voici le tableau trié :");
			for (i = 0; i < fruits.length; ++i)
				System.out.println(fruits[i]);

			//Recherches binaires dans le tableau :
			System.out.println("Fruit cherché ? (tapez fin pour terminer) ");
			fruitCherche = clavier.nextLine();
			while (!"fin".equals(fruitCherche)) {

				//Recherche binaire :
				trouvee = false;
				debut = 0;
				fin = fruits.length-1;
				milieu = -1;
				while (debut<=fin && !trouvee) {
					milieu = (debut+fin)/2;
					if (fruits[milieu].equals(fruitCherche)) {
						trouvee = true;
					}
					else if (fruits[milieu].compareTo(fruitCherche) > 0) {
						fin = milieu-1;
					}
					else {
						debut = milieu+1;
					}
				}
				if (trouvee)
					System.out.println("La valeur "+fruitCherche+" est à la position "+milieu);
				else
					System.out.println("La valeur "+fruitCherche+" n'existe pas.");

				//On demande si on veut encore chercher :
				System.out.println("Fruit cherché ? (tapez fin pour terminer) ");
				fruitCherche = clavier.nextLine();
			}
		}
	}

