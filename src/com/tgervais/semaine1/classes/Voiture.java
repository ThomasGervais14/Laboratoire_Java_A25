package com.tgervais.semaine1.classes;

public class Voiture {
    private String immatriculation;
    private int position;
    private Compteur compteur;

    public Voiture(String plaque) {
        immatriculation = plaque;
        position = 0;
        compteur = new Compteur();
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public int getPosition() {
        return position;
    }

    public int getValeurCompteur() {
        return compteur.getValeur();
    }

    public void avancerVoiture(int kilometrage) {
        for (int i = 0; i < kilometrage; i++) {
            compteur.incrementValeur();
        }
        position += kilometrage;
    }

    public void reculerVoiture(int kilometrage) {
        for (int i = 0; i < kilometrage; i++) {
            compteur.incrementValeur();
        }
        position -= kilometrage;
    }
}
