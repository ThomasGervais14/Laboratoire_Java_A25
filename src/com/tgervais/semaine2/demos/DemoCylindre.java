package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.Cylindre;

import java.util.Locale;
import java.util.Scanner;

public class DemoCylindre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.ENGLISH);

        System.out.print("Veuillez entrer le rayon du cylindre: ");
        double rayon = clavier.nextDouble();
        System.out.print("Veuillez entrer la hauteur du cylindre: ");
        double hauteur = clavier.nextDouble();
        Cylindre cylindre = new Cylindre(rayon, hauteur);
        System.out.println("Le volume du cylindre est de: " + cylindre.calculVolume() + "cm3");
    }
}
