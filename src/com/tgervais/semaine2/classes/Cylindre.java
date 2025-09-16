package com.tgervais.semaine2.classes;

public class Cylindre {
    private double rayon;
    private double hauteur;

    public Cylindre(double r, double h){
        rayon = r;
        hauteur = h;
    }
    public double calculVolume(){
        double volume = Math.PI * Math.pow(rayon, 2) * hauteur;
        return volume;
    }
}
