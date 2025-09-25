package com.tgervais.semaine1.solution.classes;

public class Etudiant
{
	private String numero;
	private String nom;
	private double note;

	public void setNumero(String n)
	{
		numero=n;
	}

	public void setNom(String n)
	{
		nom=n;
	}

	public void setNote(double note)
	{
		this.note=note;
	}

	public String getNumero()
	{
		return this.numero;
	}

	public String getNom()
	{
		return nom;
	}

	public double getNote()
	{
		return note;
	}
}