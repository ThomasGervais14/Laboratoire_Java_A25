package com.tgervais.semaine2.classes;

public class DeterminationPremier {
    public String calculPremier(double nbr){
        String premier = "";
        String normal = "";
        for (int i = 1; i <= nbr; i++){
            if (nbr % i != 0){
                normal = normal + nbr;
            }
        }
        if (normal.isEmpty()){
            premier = premier + nbr;
        }
        if (!premier.isEmpty()){
            return "Le nombre " + nbr + " n'est pas premier";
        }
        else {
            return "Le nombre " + nbr + " est premier";
        }
    }
}
