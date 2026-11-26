# Exercice 28 : Conception de la hiérarchie d'un système

Séquence 2, Objectif 2.2 : Mettre en œuvre l'héritage et le polymorphisme.

## Énoncé

Concevoir la hiérarchie d'un système de location immobilière :

- `Bien` (adresse, loyer mensuel)
- `Appartement` (étage)
- `Villa` (surface du jardin)

Préciser les attributs, les constructeurs, et une méthode `calculerCharges()` redéfinie différemment dans chaque sous-classe.

## Règles de calcul retenues

- `Bien` : charges égales à 10 % du loyer ; un loyer négatif ou nul est refusé
- `Appartement` : charges de base + 2 000 FCFA par étage
- `Villa` : charges de base + 100 FCFA par m² de jardin

## Résultat attendu

Charges de 21 000 FCFA pour l'appartement (loyer 150 000, 3e étage) et de 70 000 FCFA pour la villa (loyer 500 000, jardin de 200 m²).
