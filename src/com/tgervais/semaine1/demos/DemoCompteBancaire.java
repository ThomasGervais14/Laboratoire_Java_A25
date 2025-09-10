package com.tgervais.semaine1.demos;

import com.tgervais.semaine1.classes.CompteBancaire;

public class DemoCompteBancaire {

    public static void main(String[] args) {
        CompteBancaire cpt1 = new CompteBancaire("AGHDJ8765");

        cpt1.setTitulaire("Pierre Dupond");
        cpt1.crediter(1500);
        cpt1.debiter(150);

        System.out.println("Compte : "+cpt1.getNumero()
        +"; "+cpt1.getTitulaire()
        +"; "+cpt1.getSolde()+"$");
    }
}
