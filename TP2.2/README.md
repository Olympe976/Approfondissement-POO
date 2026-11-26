# TP 2.2 : Héritage et polymorphisme

## Énoncé (résumé)

Deux exercices :

- **Ressources humaines** (package `rh`) : une classe `Employe` et ses sous-classes `Manager` (prime), `Vendeur` (commission sur les ventes), `Stagiaire` (moitié du salaire) et `Directeur` (prime de 20 %). La classe `Paie` calcule la masse salariale, la catégorie de chaque employé et l'employé le mieux payé.
- **Formes** (package `formes`) : une classe `Forme` et ses sous-classes `Cercle` et `Rectangle`, chacune calculant son aire. On provoque ensuite une `ClassCastException` puis on la corrige avec `instanceof`.

## Notions abordées

- Héritage (`extends`) et appel au constructeur parent (`super(...)`)
- Visibilité `protected`
- Redéfinition de méthode (`@Override`) et réutilisation avec `super.methode()`
- Polymorphisme et liaison dynamique : un tableau `Employe[]` ou `Forme[]` contient des objets de sous-classes différentes
- Type réel d'un objet avec `getClass()`
- Transtypage (cast), `ClassCastException` et `instanceof` avec pattern matching
- `switch` avec pattern matching sur les types

## Compiler et lancer

```
cd TP2.2
javac -encoding UTF-8 -d out src/sn/ucad/esp/glsi/rh/*.java src/sn/ucad/esp/glsi/formes/*.java
java -Dstdout.encoding=UTF-8 -cp out sn.ucad.esp.glsi.rh.Paie
java -Dstdout.encoding=UTF-8 -cp out sn.ucad.esp.glsi.formes.Main
```
