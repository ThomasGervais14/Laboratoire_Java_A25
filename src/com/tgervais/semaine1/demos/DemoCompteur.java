package com.tgervais.semaine1.demos;

import com.tgervais.semaine1.classes.Compteur;

public class DemoCompteur {
    public static void main(String[] args) {
        Compteur compt1 = new Compteur();
        Compteur compt2 = new Compteur(100);

        compt1.incrementValeur();
        compt1.incrementValeur();
        System.out.println(compt1.getValeur());
        compt1.decrementValeur();
        System.out.println(compt1.getValeur());
        compt1.resetValeur();
        System.out.println(compt1.getValeur());

        compt2.incrementValeur();
        compt2.incrementValeur();
        System.out.println(compt2.getValeur());
        compt2.decrementValeur();
        System.out.println(compt2.getValeur());
        compt2.resetValeur();
        System.out.println(compt2.getValeur());

    }
}
