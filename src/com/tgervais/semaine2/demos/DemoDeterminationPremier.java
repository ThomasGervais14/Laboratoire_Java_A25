package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.DeterminationPremier;

import java.util.Locale;
import java.util.Scanner;

public class DemoDeterminationPremier {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.ENGLISH);

        DeterminationPremier d = new DeterminationPremier();

        System.out.print("Veuillez entrer un nombre: ");
        double nbr  = clavier.nextDouble();
        System.out.print(d.calculPremier(nbr));
    }
}
