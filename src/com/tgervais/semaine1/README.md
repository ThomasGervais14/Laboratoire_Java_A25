Exercice 1 :
Proposez une classe Etudiant pour représenter des étudiants.
Pour chaque étudiant on dispose de :
- Son numéro ;
- Son nom ;
- Sa note.
  La classe doit fournir des méthodes d’accès en lecture et en écriture à chacun des
  attributs.
  Proposez un programme de démonstration du fonctionnement de la classe Etudiant.
  
Exercice 2 :
  Proposez une classe Compteur pour représenter des compteurs entiers. Un compteur
  possède un seul attribut, qui contient sa valeur.
  La classe doit fournir un constructeur sans argument qui initialise sa valeur à 0 et un
  constructeur qui reçoit la valeur initiale.
  La classe doit avoir les méthodes permettant :
- D’incrémenter de 1 la valeur du compteur ;
- De décrémenter de 1 la valeur du compteur ;
- De remettre à 0 la valeur du compteur ;
- D’obtenir la valeur du compteur (un getter).
  Proposez un programme de démonstration du fonctionnement de la classe Compteur.

Exercice 3 :
Proposez une classe Voiture pour représenter des voitures.
Une voiture possède un numéro d’immatriculation, une position (entier) et un compteur
(objet de la classe Compteur de l’exercice 2).
La classe doit avoir les méthodes permettant :
- De faire avancer la voiture d’une certaine distance (reçue en paramètre);
- De faire reculer la voiture d’une certaine distance (reçue en paramètre);
- D’obtenir la valeur de son compteur;
- D’obtenir son numéro d’immatriculation;
- D’obtenir sa position.\
  Attention! Que la voiture avance ou recule, son compteur augmente toujours.
  Proposez un programme de démonstration du fonctionnement de la classe Voiture dans
  lequel vous créez une voiture et faites avancer et reculer en affichant à chaque fois sa
  position et la valeur de son compteur.
  
 
Exercice 4 :
  Proposez une classe De pour représenter un dé à plusieurs facettes.
  Le nombre de facettes doit pouvoir être fourni à un constructeur.
  Le constructeur sans paramètre crée un dé à 6 facettes.
  La classe doit avoir les méthodes permettant la simulation d’un lancer de dé et de
  récupérer la facette obtenue.
  Proposez un programme de démonstration du fonctionnement de la classe De dans lequel
  vous créez 2 dés de 6 et 15 facettes et les lancez 20 fois. Vous affichez à chaque fois le
  résultat du lancer.