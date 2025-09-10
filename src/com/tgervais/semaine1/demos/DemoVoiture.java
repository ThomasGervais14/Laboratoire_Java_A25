package com.tgervais.semaine1.demos;

import com.tgervais.semaine1.classes.Voiture;

public class DemoVoiture {
    public static void main(String[] args) {
        Voiture elantra = new Voiture("J45 MXN");

        elantra.avancerVoiture(1200);
        System.out.println("Je suis une voiture ma plaque d'immatriculation possède le numéro "
                +elantra.getImmatriculation()+". J'ai un kilométrage de "
                +elantra.getValeurCompteur()+" et je me situe à une position de: "
                +elantra.getPosition()+"KM.");
        elantra.reculerVoiture(200);
        System.out.println("Je suis une voiture ma plaque d'immatriculation possède le numéro "
                +elantra.getImmatriculation()+". J'ai un kilométrage de "
                +elantra.getValeurCompteur()+" et je me situe à une position de: "
                +elantra.getPosition()+"KM.");
    }
}
