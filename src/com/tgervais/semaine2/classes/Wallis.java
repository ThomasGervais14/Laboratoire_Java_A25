package com.tgervais.semaine2.classes;

public class Wallis {

    public double calculWallis(){
        double depart = 1;
        for (double i = 1; i < 10000; i++){
            depart = depart * (((2 * i) / ((2 * i) - 1))*((2 * i) / ((2 * i) + 1)));
        }
        return depart * 2;
    }
}
