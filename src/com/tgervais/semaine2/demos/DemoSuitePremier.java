package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.DeterminationPremier;

import java.util.Locale;
import java.util.Scanner;

public class DemoSuitePremier {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.ENGLISH);

        DeterminationPremier d = new DeterminationPremier();
        boolean lancerBoucle = true;
        while (lancerBoucle) {
            System.out.print("\nVeuillez entrer un nombre: ");
            double nbr =  clavier.nextDouble();
            if (nbr == 0) {
                lancerBoucle = false;
            }
            System.out.print(d.calculPremier(nbr));
        }
    }
}
