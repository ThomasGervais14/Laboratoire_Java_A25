package com.tgervais.semaine1.demos;

import com.tgervais.semaine1.classes.Etudiant;

public class DemoEtudiant {
    public static void main(String[] args) {
        Etudiant etu1 = new Etudiant();

        etu1.setNom("Thomas Gervais");
        etu1.setNumero(1582725);
        etu1.setNote(93);

        System.out.println("Bonjour je m'appelle "+etu1.getNom()
        +" mon numéro d'identification est le "+etu1.getNumero()
        +" et j'ai eu la merveilleuse note de: "+etu1.getNote()
        +"%.");
    }
}
