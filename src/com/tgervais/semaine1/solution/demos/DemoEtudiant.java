package com.tgervais.semaine1.solution.demos;
import com.tgervais.semaine1.solution.classes.Etudiant;

//Fichier : DemoEtudiant.java
class DemoEtudiant
{
 public static void main(String s[])
 {
	Etudiant etud= new Etudiant();
	String n = new String("A101");//OU: String n = "A101";
	int x = 75;
	
	System.out.println("Donn�es initiales de l'�tudiant : ");
	System.out.println("\tLe num�ro de l'�tudiant est : "+etud.getNumero());
	System.out.println("\tLe nom de l'�tudiant est : "+etud.getNom());
	System.out.println("\tLa note de l'�tudiant est : "+etud.getNote());

	//Modification des donn�es avec les setters :
	etud.setNumero("250");
	etud.setNom("Johanne");
	etud.setNote(85);

	System.out.println("Donn�es de l'�tudiant : ");
	System.out.println("\tLe num�ro de l'�tudiant est: "+etud.getNumero());
	System.out.println("\tLe nom de l'�tudiant est: "+etud.getNom());
	System.out.println("\tLa note de l'�tudiant est: "+etud.getNote());

	etud.setNumero(n);
	etud.setNom("Serge");
	etud.setNote(x);

	System.out.println("Nouvelles donn�es de l'�tudiant : ");
	System.out.println("\tLe num�ro de l'�tudiant est maintenant : "+etud.getNumero());
	System.out.println("\tLe nom de l'�tudiant est maintenant : "+etud.getNom());
	System.out.println("\tLa note de l'�tudiant est maintenant : "+etud.getNote());

 }
}