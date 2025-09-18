package com.tgervais.semaine2.classes;

public class Impair {
    private double iteration;

    public Impair(){
        iteration = 200;
    }
    public Impair(double ite){
        iteration = ite;
    }
    public String listeImpair(){
        String impair = "";
        for (int i = 0; i < iteration; i++ ){
            impair = impair + (2 * i + 1) + "\n";
        }
        return impair;
    }
}
