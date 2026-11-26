# TP 2.1 : Gestion des étudiants

Séquence 2, Objectif 2.1 : Concevoir des classes et manipuler des objets (Exercice 24).

## Énoncé

1. Créer le package `sn.ucad.esp.glsi.tp21` et y écrire la classe `Etudiant` (matricule, nom, prénom, date de naissance, moyenne ; les champs sont privés) avec un constructeur qui valide les données, et les méthodes `toString`, `equals` (sur le matricule) et `hashCode`.
2. Écrire une classe `Promotion` qui contient un tableau d'étudiants de taille fixe et les fonctionnalités `ajouter`, `rechercherParMatricule` et `moyenneGenerale`. L'égalité de deux étudiants porte sur le matricule.
3. Écrire un `main()` qui crée cinq étudiants, les ajoute, affiche la promotion, puis recherche un matricule existant et un autre inexistant.
4. Vérifier que la tentative de créer un étudiant avec une moyenne de 25 est refusée (levée d'exception).
5. Ajouter un compteur statique du nombre d'étudiants créés et l'afficher.
