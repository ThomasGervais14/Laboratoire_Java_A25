package com.tgervais.semaine1.solution.demos;

import com.tgervais.semaine1.solution.classes.Voiture;

//D�monstration de la classe Voiture.

class DemoVoiture
{
 public static void main(String s[])
 {
	Voiture v1 = new Voiture("HHH 999");
	Voiture v2 = new Voiture("AAA 000");

	v1.avancer(10); //la voiture avance de 10
	v1.reculer(5);	//la voiture recule de 5
	v1.avancer(3);
	v1.avancer(17);
	v1.reculer(5);

	System.out.println("Position de la voiture : "+v1.getPosition());
	System.out.println("Compteur de la voiture : "+v1.getValeurDuCompteur());
 }
}