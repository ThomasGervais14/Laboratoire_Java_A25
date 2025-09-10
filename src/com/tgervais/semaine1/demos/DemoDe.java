package com.tgervais.semaine1.demos;

import com.tgervais.semaine1.classes.De;

public class DemoDe {
    public static void main(String[] args) {
        De six = new De(6);
        De quinze = new De(15);

        for (int i = 0; i < 21; i++){
            System.out.println("Roulement " + i + ". Le résultat pour le dé à 6 facettes est: " + six.roulementDe(six));
            System.out.println("Roulement " + i + ". Pour le dé à 15 facettes, le résultat est: "
                    +  quinze.roulementDe(quinze));
        }
    }
}
