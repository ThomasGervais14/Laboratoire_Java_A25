package com.tgervais.semaine2.demos;

import com.tgervais.semaine2.classes.Wallis;

public class DemoWallis {
    public static void main(String[] args) {
        Wallis w = new Wallis();
        double pisimule =  w.calculWallis();
        System.out.print(pisimule);
    }
}
