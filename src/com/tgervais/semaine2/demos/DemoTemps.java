package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.Temps;

import java.util.Locale;
import java.util.Scanner;

public class DemoTemps {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.ENGLISH);

        System.out.print("Veuillez entrer une quantité de temps en secondes: ");
        double tps = clavier.nextInt();
        Temps temps = new Temps(tps);
        System.out.print("Le résultat est équivalent à " + temps.changementHeure());
    }
}
