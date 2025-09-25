package com.tgervais.semaine3.Solution.exercice1;

public class ListeNotes {
    private double[] notes;
    private boolean trie = false;
    /**
     * Crée une ListeNotes contenant un tableau de notes par défaut.
     */
    public ListeNotes() {
        notes = new double[]{85.0,59.4,78.3,48.6,77.5,92.1,64.8,55.25,36.75,90.25};
    }
    /**
     * Crée une ListeNotes contenant le tableau reçu en paramètre.
     * @param valeurs tableau servant à initialiser le tableau de notes
     */
    public ListeNotes(double[] valeurs) {
        notes = valeurs;
    }
    /**
     * Retourne chaine contenant les notes du tableau séparées par un point-virgule. La chaine est délimitée par des
     * crochets.
     * @return chaine contenant les notes du tableau de notes
     */
    @Override
    public String toString() {
        String str = "[";
        for (int i=0;i<notes.length;i++) {
            str += notes[i];
            if (i<notes.length-1)
                str += ';';
        }
        str += ']';
        return str;
    }
    /**
     * Retourne la moyenne des notes du tableau de notes.
     * @return la moyenne des notes du tableau de notes
     */
    public double getMoyenne() {
        double somme = 0;
        for (int i=0;i<notes.length;i++)
            somme += notes[i];
        return somme/notes.length;
    }
    /**
     * Retourne la plus petite valeur du tableau de notes
     * @return la plus petite valeur du tableau de notes
     */
    public double getMinimum() {
        double min = notes[0];
        for (int i=1;i<notes.length;i++)
            if (notes[i]<min)
                min = notes[i];
        return min;
    }
    /**
     * Retourne un tableau contenant toutes les notes entre un minimum et un maximum. Le tableau retourné ne doit pas
     * contenir des cases vides.
     * @param min la note minimale
     * @param max la note maximale
     * @return tableau contenant toutes les notes du tableau comprises entre min et max, inclusivement
     */
    public double[] getNotesParIntervalle(double min, double max) {
        double[] resultat;
        int compteur = 0;
        for (int i=0;i<notes.length;i++) {
            if (notes[i]>=min && notes[i]<=max)
                compteur++;
        }
        resultat = new double[compteur];
        for (int i=0, j=0;i<notes.length;i++) {
            if (notes[i]>=min && notes[i]<=max) {
                resultat[j] = notes[i];
                j++;
            }
        }
        return resultat;
    }
    /**
     * Trie le tableau des notes par ordre croissant
     */
    public void trier() {
        //Utilise le tri par insertion.
        int i, j;
        double temp;
        for (i = 1; i < notes.length; ++i) {
            temp = notes[i];
            for (j = i; j > 0 && notes[j-1] > temp; j--) {
                notes[j] = notes[j-1];
            }
            notes[j] = temp;
        }
        //on marque la liste triée :
        trie = true;
    }
    /**
     * Recherche une note dans le tableau de notes et retourne le plus petit indice de case la contenant. Cette méthode
     * vérifie si le tableau est trié, elle effectue une recherche binaire. Sinon, elle effectue une recherche séquentielle.
     * @param note  la note à chercher
     * @return le plus petit indice de case contenant la note, si la note existe dans le tableau de notes. Retourne -1,
     *          si la note n'existe pas dans le tableau
     */
    public int getIndice(double note) {
        for (int i=0;i<notes.length;i++) {
            if (notes[i]==note)
                return i;
        }
        return -1;
    }
    /**
     * Insère une nouvelle note à une position spécifique. La dernière note est retirée du tableau et retournée.
     * @param v la nouvelle note à insérer
     * @param position indice à partir de laquelle seront insérées les notes
     * @return la note retirée du tableau
     */
    public double inserer(double v, int position) {
        double noteARetourner = notes[notes.length-1];
        for (int i=notes.length-1; i>position;i--) {
            notes[i] = notes[i-1];
        }
        notes[position] = v;
        return noteARetourner;
    }
    /**
     * Insère une liste de notes à une position spécifique.
     * @param t tableau contenant les notes à insérer
     * @param position indice à partir de laquelle seront insérées les notes
     * @return tableau contenant toutes les notes retirées du tableau
     */
    public double[] inserer(double[] t, int position) {
        //Cette méthode doit utiliser la méthode inserer() précédente.
        double[] notesARetourner;
        int nbNotesAInserer = notes.length - position;
        if (nbNotesAInserer>t.length)
            nbNotesAInserer = t.length;
        notesARetourner = new double[nbNotesAInserer];
        for (int i=0; i<t.length && i+position<notes.length;i++)
            notesARetourner[i] = inserer(t[i], i+position);
        return notesARetourner;
    }
}