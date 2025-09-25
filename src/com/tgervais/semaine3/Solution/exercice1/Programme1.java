package com.tgervais.semaine3.Solution.exercice1;

import java.util.Locale;
import java.util.Scanner;

public class Programme1 {

    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        ListeNotes liste1 = new ListeNotes();
        char choix;
        double noteCherchee, noteMin, noteMax;
        int indice, nbNotes;
        double[] tabNotes, notesRetirees;

        clavier.useLocale(Locale.ENGLISH);

        choix = menu();
        while (choix != 'q') {
            switch (choix) {
                case 'l' : //affichage de la liste des notes
                    System.out.println("Liste des notes : "+liste1);
                    break;
                case 'm' : //moyenne des notes
                    System.out.println("Moyenne des notes : "+liste1.getMoyenne());
                    break;
                case 'p' : //plus petite note
                    System.out.println("Plus petite note : "+liste1.getMinimum());
                    break;
                case 'v' : //rechercher des notes d'un intervalle
                    System.out.println("=> Rechercher des notes d'un intervalle.");
                    System.out.print("Quelle note minimale cherchez-vous ? ");
                    noteMin = clavier.nextDouble();
                    System.out.print("Quelle note maximale cherchez-vous ? ");
                    noteMax = clavier.nextDouble();
                    clavier.nextLine();//"flusher" le ENTER
                    tabNotes = liste1.getNotesParIntervalle(noteMin, noteMax);
                    if (tabNotes.length==0)
                        System.out.println("Aucune note entre "+noteMin+" et "+noteMax);
                    else {
                        System.out.println("Voici les notes entre " + noteMin + " et "+noteMax);
                        for (int i=0;i<tabNotes.length;i++)
                            System.out.println(tabNotes[i]);
                    }
                    break;
                case 't' : //tri
                    liste1.trier();
                    break;
                case 'r' : //recherche de notes
                    System.out.println("=> Recherche de note.");
                    System.out.print("Quelle note cherchez-vous ? ");
                    noteCherchee = clavier.nextDouble();
                    clavier.nextLine();//"flusher" le ENTER
                    indice = liste1.getIndice(noteCherchee);
                    if (indice==-1)
                        System.out.println("Note "+noteCherchee+" introuvable");
                    else
                        System.out.println("Note "+noteCherchee+" trouvée à la case d'indice "+indice);
                    break;
                case 'c' : //changer de liste de notes
                    System.out.println("=> Changer de liste.");
                    System.out.print("Combien de notes avez-vous dans la nouvelle liste ? ");
                    nbNotes = clavier.nextInt();
                    tabNotes = new double[nbNotes];
                    for (int i=0;i<tabNotes.length;i++) {
                        System.out.print("Note #" + (i + 1) + " : ");
                        tabNotes[i] = clavier.nextDouble();
                    }
                    clavier.nextLine();//"flusher" le ENTER
                    liste1 = new ListeNotes(tabNotes);
                    break;
                case 'i' : //insérer des notes
                    System.out.println("=> Insérer des notes.");
                    System.out.print("Combien de notes insérer ? ");
                    nbNotes = clavier.nextInt();
                    tabNotes = new double[nbNotes];
                    for (int i=0;i<tabNotes.length;i++) {
                        System.out.print("Note #" + (i + 1) + " : ");
                        tabNotes[i] = clavier.nextDouble();
                    }
                    System.out.print("À quelle position les insérer ? ");
                    indice = clavier.nextInt();
                    clavier.nextLine();//"flusher" le ENTER
                    notesRetirees = liste1.inserer(tabNotes,indice);
                    System.out.println("Voici les notes retirées ? ");
                    for (int i=0;i<notesRetirees.length;i++)
                        System.out.println(notesRetirees[i]);
                    break;
                default :
                    System.out.println("Choix invalide.");
            }
            choix = menu();
        }
        System.out.println("Bye Bye !");
    }
    private static char menu() {
        System.out.println("\n\n\tl. Afficher la liste de notes");
        System.out.println("\tm. Afficher la moyenne des notes");
        System.out.println("\tp. Afficher la plus petite note");
        System.out.println("\tv. Afficher notes par intervalle");
        System.out.println("\tt. Trier la liste de notes");
        System.out.println("\tr. Rechercher une note");
        System.out.println("\tc. Changer de liste de notes");
        System.out.println("\ti. Insérer des notes");
        System.out.println("\tq. Quitter");

        System.out.print("\n\t\tVotre choix :");
        String rep = clavier.nextLine();
        char choix;
        if (rep.length()>0)
            choix = rep.charAt(0);
        else
            choix = 'x';
        return choix;
    }
}
