
package com.tgervais.semaine1.classes;

public class CompteBancaire {
    private String numero;
    private String titulaire;
    private double solde;

    public CompteBancaire(String n) {
        numero = n;
        titulaire = "";
        solde = 0;
    }

    public String getNumero() {
        return numero;
    }
    public String getTitulaire() {
        return titulaire;
    }
    public double getSolde() {
        return solde;
    }

    public void setTitulaire(String tit) {
        titulaire = tit;
    }
    public void crediter(double montant) {
        solde = solde+montant;
    }
    public void debiter(double montant) {
        solde = solde-montant;
    }
}
