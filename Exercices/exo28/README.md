# Exercice 28 : Biens immobiliers

## Énoncé (résumé)

Une classe `Bien` (adresse, loyer mensuel) calcule des charges égales à 10 % du loyer. Deux sous-classes ajoutent leur supplément :

- `Appartement` : 2 000 FCFA par étage ;
- `Villa` : 100 FCFA par m² de jardin.

Un loyer négatif ou nul est refusé. La classe `Main` crée un bien de chaque type et affiche ses charges.

## Notions abordées

- Héritage (`extends`) et constructeur parent (`super(...)`)
- Redéfinition de méthode (`@Override`) en réutilisant le calcul parent (`super.calculerCharges()`)
- Polymorphisme : un tableau `Bien[]` contenant des `Appartement` et des `Villa`
- Encapsulation et validation dans le constructeur

## Compiler et lancer

```
cd Exercices/exo28
javac -d out src/*.java
java -cp out Main
```

Résultat attendu : charges de 21 000 FCFA pour l'appartement et de 70 000 FCFA pour la villa.
