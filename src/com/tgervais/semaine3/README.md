Objectifs :
Être capable de :
- Exploiter les structures de contrôle (séquences, conditionnelles et itératives);
- Exploiter les tableaux;
- Définir et utiliser des sous-programmes (méthodes);
- Pratiquer les algorithmes de tris et de fouille;
- Travailler avec les chaines de caractères.
  Un projet de nom Lab3_Enonce vous est fourni dans lequel vous devez
  faire le travail de ce laboratoire.


  Exercice 1 :
  Le package exercice1 contient une classe ListeNotes et une classe Programme1. Un
  objet de type ListeNotes encapsule une liste de notes dans un tableau. Programme1 est
  un programme de manipulation d’une liste de notes référencée par la variable liste1.
  Le programme affiche le menu suivant :
 

  On vous demande de compléter les définitions des méthodes de la classe ListeNotes et
  la structure switch..case de la classe Programme1 pour que le programme fonctionne
  correctement.
  Voici ce qui doit être fait dans chacune des options du menu :

 - l. Affiche la liste des notes dans le format [note1;note2;…]. Le code du case est déjà
  complet. Vous devez juste faire le nécessaire dans la classe ListeNotes pour effectuer
  correctement la conversion en String.

 - m. Affiche la moyenne des notes. Le code du case est déjà complet. Vous devez juste
  compléter la définition de la méthode getMoyenne() de la classe ListeNotes.

 - p. Affiche la plus petite note. Le code du case est déjà complet. Vous devez juste
  compléter la définition de la méthode getMinimum() de la classe ListeNotes.

 - v. Demande à l’utilisateur une note minimale et une note maximale puis affiche toutes
  les notes comprises entre ces 2 notes, inclusivement.

 - t. Trie la liste des notes par ordre croissant. Le code du case est déjà complet. Vous
  devez juste compléter la définition de la méthode trier() de la classe ListeNotes.
  Vous devez utiliser le tri par sélection ou le tri par insertion. Cette méthode doit marquer
  que le tableau est trié (avec l’attribut trie).

 - r. Demande à l’utilisateur une note puis la recherche dans la liste. S’il la trouve, le
  programme doit afficher sa position. Sinon, le programme doit afficher un message en
  conséquence. Vous devez compléter la méthode getIndice() qui doit effectuer une
  recherche séquentielle, si le tableau n’est pas trié, et une recherche binaire, si le tableau
  est trié.

 - c. Remplace la liste de notes par une autre. Cette option demande à l’utilisateur combien
  de notes il a dans sa nouvelle liste. Ensuite, il crée un tableau de la bonne taille et le
  remplit à partir de notes saisies par l’utilisateur. Finalement, il crée un autre objet
  ListeNotes avec ce tableau et le fait référencer par la variable liste1.

 - i. Demande à l’utilisateur combien de notes il veut insérer dans la liste et à quelle position
  il veut les insérer. Ensuite, il crée un tableau de la bonne taille et le remplit à partir de
  notes saisies par l’utilisateur. Finalement, il insère ces notes dans la liste en utilisant la
  méthode inserer(), que vous devez compléter. Le programme doit afficher les notes
  retirées de la liste après insertion.
  

On ne fait pas de validation. On suppose que l’utilisateur rentre des valeurs valides. Par
  exemple, la position est un indice valide du tableau des notes, les notes sont des valeurs
  entre 0 et 100,….

 

Exercice 2 :
Le programme Programme2 (package execice2) crée un tableau de chaines de caractères
qui contient des noms de fruits.

2.1. Utilisez un des algorithmes de tri vu en cours pour trier le tableau par ordre
« alphabétique ». Le tableau trié doit être affiché à l’écran.

2.2. Après le tri, faites en sorte que le programme demande à l’utilisateur une série de
noms de fruits jusqu’à ce qu’il saisisse la chaine « fin ». Pour chacun des noms saisis, le
programme doit effectuer une recherche dichotomique pour voir s’il est présent dans le
tableau. S’il est trouvé, le programme affiche sa position, sinon il affiche un message en
conséquence.

Rappels (voir notes de cours sur les chaines de caractères) :
✓ On ne peut pas vérifier si 2 chaines s1 et s2 sont égales à l’aide de
l’opérateur ==. Il faut utiliser une des méthodes equals() ou
compareTo() :

    String s1 = "...", s2 = "...";
    if (s1==s2) //NON, toujours false
    if (s1.equals(s2)) //OK
    if (s1.compareTo(s2)==0) //OK
    ✓ Pour vérifier si 2 chaines s1 et s2 sont différentes :
    if (!s1.equals(s2)) //OK
    if (s1.compareTo(s2)!=0) //OK
    ✓ Pour vérifier si une chaine s1 est supérieure à une chaine s2 :
    if (s1.compareTo(s2) > 0) //s1 supérieure à s2
    ✓ Pour vérifier si une chaine s1 est inférieure à une chaine s2 :
    if (s1.compareTo(s2) < 0) //s1 inférieure à s2
    ✓ Pour effectuer des comparaisons sans tenir compte de la casse des
    caractères (case insensitive), on utilise les méthodes
    equalsIgnoreCase() et compareToIgnoreCase().