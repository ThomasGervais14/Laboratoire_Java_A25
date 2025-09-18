package com.tgervais.semaine2.classes;

public class Diviseurs {
    private double nombre;

    public String diviseurNombre(double nombre){
        String diviseurs = "";
        for ( int i = 0; i < (nombre + 1); i++){
            if (nombre % i == 0){
                diviseurs = diviseurs + "," + i;
            }
        }
        return diviseurs;
    }
}
