package com.tgervais.semaine1.solution.classes;

public class Voiture
{
	private String immatriculation;
	private int position;
	private final Compteur compteur;

	public Voiture(String matricule)
	{
		immatriculation = matricule;
		compteur = new Compteur();
		position = 0;
	}

	public void avancer(int distance)
	{
		position += distance;
		//Faire augmenter le compteur de distance :
		for (int i=0;i<distance;i++)
			compteur.incrementer();
	}

	public void reculer(int distance)
	{
		position -= distance;
		//Faire augmenter le compteur de distance :
		for (int i=0;i<distance;i++)
			compteur.incrementer();
	}

	public int getValeurDuCompteur()
	{
		return compteur.getValeur();
	}
	public int getPosition()
	{
		return position;
	}
	public String getImmatriculation()
	{
		return immatriculation;
	}
}