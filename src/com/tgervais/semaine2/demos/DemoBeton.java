package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.Beton;

import java.util.Locale;
import java.util.Scanner;

public class DemoBeton {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.ENGLISH);

        Beton mix1 = new Beton();

        System.out.print("Entrez une quantité de ciment en kg: ");
        double ciment  = clavier.nextDouble();
        System.out.print("Entrez une quantité de sable en kg:");
        double sable  = clavier.nextDouble();
        System.out.print("Entrez une quantité de gravier en kg: ");
        double gravier = clavier.nextDouble();

        System.out.print("Vous pouvez au maximum faire une quantité de béton équivalente à: "
        + mix1.ratioVolume(mix1.ratioCiment(ciment), mix1.ratioSable(sable), mix1.ratioGravier(gravier) )
        + "m3");
    }
}
