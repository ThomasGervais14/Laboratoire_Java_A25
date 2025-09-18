package com.tgervais.semaine2.classes;

public class Beton {
    private double ciment;
    private double sable;
    private double gravier;

    public double ratioCiment(double ciment) {
        return ciment / 350.0;
    }

    public double ratioSable(double sable) {
        return sable / 680.0;
    }

    public double ratioGravier(double gravier) {
        return gravier / 1175.0;
    }

    public double ratioVolume(double ciment, double sable, double gravier) {
        if (ciment < sable && ciment < gravier) {
            return ciment;
        }
        else if (sable < ciment && sable < gravier) {
            return sable;
        }
        else if (gravier < ciment && gravier < sable) {
            return gravier;
        }
        else if (ciment == sable || ciment == gravier){
            return ciment;
        }
        else if (sable == gravier){
            return sable;
        }
        return ciment;
    }
}
