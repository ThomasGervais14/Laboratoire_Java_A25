package com.tgervais.semaine1.classes;

public class Compteur {
    private int valeur;

    public Compteur() {
        valeur = 0;
    }

    public Compteur(int initiale) {
        valeur = initiale;
    }

    public int getValeur() {
        return valeur;
    }

    public void incrementValeur() {
        valeur++;
    }

    public void decrementValeur() {
        valeur--;
    }

    public void resetValeur() {
        valeur = 0;
    }
}
