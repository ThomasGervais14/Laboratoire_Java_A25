package com.tgervais.semaine1.solution.classes;

public class De
{
	private int nombreDeFacettes;
	private int facetteActuelle;//facette tir�e au dernier lancer du d�

	public De()
	{
	 	nombreDeFacettes = 6;
	}

	public De(int nombreDeFacettes)
	{
	 	this.nombreDeFacettes = nombreDeFacettes;
	}
	public void lancer()
	{
		facetteActuelle = (int)(Math.random()*nombreDeFacettes+1);
	}

	public int getFacetteActuelle()
	{
		return facetteActuelle;
	}
	//M�thode pour tricher (pas r�aliste) :
	/*
	public void setFacetteActuelle(int f)
	{
		facetteActuelle = f;
	}
	*/
}