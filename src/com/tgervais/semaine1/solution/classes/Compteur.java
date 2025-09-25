package com.tgervais.semaine1.solution.classes;

public class Compteur
{
	private int valeur;

	public Compteur()  //Constructeur sans argument
	{
		valeur = 0;
	}
	public Compteur(int v)	//Constructeur
	{
		valeur = v;
	}

	public void reset()
	{
		valeur = 0;
	}

	public void incrementer()
	{
		valeur++;
	}
	public void decrementer()
	{
		valeur--;
	}
	public int getValeur()
	{
		return valeur;
	}
	/* Cette m�thode n'est pas r�aliste:
	public void setValeur(int v)
	{
		valeur = v;
	}
	*/
}