package com.tgervais.semaine1.classes;

public class De {
    private int facette;

    public De(int face) {
        facette = face;
    }

    public De() {
        facette = 6;
    }

    public int getFacette() {
        return facette;
    }
    public void setFacette(int faces) {
        facette = faces;
    }

    public int roulementDe(De d) {
        int etandu = d.getFacette();
        int aleatoire = (int) ((etandu * Math.random()) + 1);
        return aleatoire;
    }
}
