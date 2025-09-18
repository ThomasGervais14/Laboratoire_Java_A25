package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.Diviseurs;

import java.util.Locale;
import java.util.Scanner;

public class DemoDiviseurs {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.ENGLISH);
        Diviseurs diviseurs = new Diviseurs();

        System.out.print("Veuillez entrez le nombre dont vous voulez savoir les diviseurs: ");
        double divis = clavier.nextDouble();
        System.out.print("Les diviseurs de ce nombre sont:" + diviseurs.diviseurNombre(divis));

    }
}
