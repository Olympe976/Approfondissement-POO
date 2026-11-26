# TP 1.2 : Prise en main du débogueur

## Énoncé (résumé)

Écrire une méthode qui calcule la somme des entiers de 1 à n, puis suivre son exécution avec le débogueur de l'IDE : poser un point d'arrêt dans la boucle, avancer pas à pas et observer l'évolution des variables `i` et `total`.

## Notions abordées

- Méthode `static` et méthode `main`
- Organisation en package (`sn.ucad.esp.glsi.tp12`) et projet Maven
- Débogage : point d'arrêt, exécution pas à pas, inspection des variables

## Compiler et lancer

Avec `javac` / `java` :

```
cd TP1.2
javac -d out src/main/java/sn/ucad/esp/glsi/tp12/Somme.java
java -cp out sn.ucad.esp.glsi.tp12.Somme
```

Avec Maven :

```
cd TP1.2
mvn compile
java -cp target/classes sn.ucad.esp.glsi.tp12.Somme
```

Résultat attendu : `Somme de 1 a 10 = 55`
