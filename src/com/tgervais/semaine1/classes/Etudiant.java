package com.tgervais.semaine1.classes;

public class Etudiant {
    private String nom;
    private int numero;
    private double note;


    public double getNote() {
        return note;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String name) {
        nom = name;
    }

    public void setNumero(int num) {
        numero = num;
    }

    public void setNote(double result) {
        note = result;
    }
}
