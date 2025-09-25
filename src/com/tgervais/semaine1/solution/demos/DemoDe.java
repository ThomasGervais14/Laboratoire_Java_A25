package com.tgervais.semaine1.solution.demos;

import com.tgervais.semaine1.solution.classes.De;

class DemoDe
{
 public static void main(String s[])
 {
	De d1 = new De(); //d� � 6 facettes
	int n = 15;
	De d2 = new De(n); //d� � 15 facettes
	
	//Lancement des 2 d�s 20 fois :
	for (int i=1;i<=20;i++)
	{
		d1.lancer(); //lancement du d�
		d2.lancer();
		System.out.println(i+ "e lancer - r�sultats des d�s : "
						 +d1.getFacetteActuelle()+":"+d2.getFacetteActuelle());
	}
 }
}