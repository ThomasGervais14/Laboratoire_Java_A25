package com.tgervais.semaine2.classes;

public class Temps {
    private double secondes;

    public Temps(double sec){
        secondes = sec;
    }

    public String changementHeure(){
        double secondeschange = secondes;
        if (secondeschange < 60){
            return "00:00:"+((int) secondes);
        }
        else {
            double minuteschange = secondeschange / 60;
            if (minuteschange < 60){
            return "00:" + ((int) minuteschange) + ":" + ((int) (secondeschange % 60));
            }
            else {
                double heureschange = minuteschange / 60;
                double minutesretablis = ((minuteschange % 60) * 60);
                return ((int) heureschange) + ":" + ((int) (minutesretablis/60)) + ":" + ( (int) (minutesretablis % 60));
            }

        }
    }
}
