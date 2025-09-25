package com.tgervais.semaine1.solution.demos;

import com.tgervais.semaine1.solution.classes.Compteur;

//D�monstration de la classe Compteur.

public class DemoCompteur {

	public static void main(String[] args) {

		Compteur c1 = new Compteur(); //compteur initialement � 0
		Compteur c2 = new Compteur(20); //compteur initialement � 20
		
		System.out.println("Valeurs des compteurs - c1 : "+c1.getValeur()
						  +"; c2 : "+c2.getValeur());
		
		for (int i=0;i<8;i++) {
			c1.incrementer();
			c2.decrementer();
		}
		
		System.out.println("Nouvelles valeurs des compteurs - c1 : "
						  +c1.getValeur()+"; c2 : "+c2.getValeur());
		
		c1.reset();
		c2.reset();
		System.out.println("Valeurs des compteurs apr�s reset - c1 : "
				  +c1.getValeur()+"; c2 : "+c2.getValeur());
		
	}

}
