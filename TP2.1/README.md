# TP 2.1 : Classes, objets et encapsulation

## Énoncé (résumé)

Modéliser un `Etudiant` (matricule, nom, prénom, date de naissance, moyenne) et une `Promotion` de capacité fixe stockée dans un tableau. La promotion permet d'ajouter un étudiant (sans doublon), de le rechercher ou le supprimer par matricule et de calculer la moyenne générale. Les données invalides sont refusées par une exception.

## Notions abordées

- Encapsulation : attributs `private`, accesseurs (getters)
- Constructeur avec validation des paramètres (`IllegalArgumentException`, `IllegalStateException`)
- Attribut `final` (matricule non modifiable) et attribut `static` (compteur d'étudiants créés)
- Redéfinition de `toString`, `equals` et `hashCode` (`@Override`)
- Composition : une `Promotion` contient un tableau d'`Etudiant`
- Gestion des exceptions avec `try` / `catch`

## Compiler et lancer

```
cd TP2.1
javac -encoding UTF-8 -d out src/sn/ucad/esp/glsi/tp21/*.java
java -Dstdout.encoding=UTF-8 -cp out sn.ucad.esp.glsi.tp21.Main
```
