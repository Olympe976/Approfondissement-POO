# Travaux pratiques de Programmation Orientée Objet en Java

Dépôt regroupant mes TP du cours de **Programmation Orientée Objet (POO)** en Java, en Licence 3 Génie Logiciel et Système d'Information (L3 GLSI) à l'**École Supérieure Polytechnique (ESP)** de l'**Université Cheikh Anta Diop (UCAD)** de Dakar, année 2026-2027.

## Liste des TP

| Dossier | Thème | Description |
|---|---|---|
| [TP1.2](TP1.2/) | Débogueur | Somme des entiers de 1 à n, pour s'exercer aux points d'arrêt et à l'exécution pas à pas. |
| [TP1.4](TP1.4/) | Environnement de travail | Projet Maven avec interface JavaFX (FXML, Scene Builder) et connexion à MySQL via JDBC. |
| [TP2.1](TP2.1/) | Classes et encapsulation | Gestion d'une promotion d'étudiants : ajout, recherche, suppression, moyenne générale. |
| [TP2.2](TP2.2/) | Héritage et polymorphisme | Calcul de la paie d'employés (Manager, Vendeur, Stagiaire, Directeur) et aire de formes géométriques. |
| [Exercices/exo28](Exercices/exo28/) | Héritage | Biens immobiliers (Appartement, Villa) dont le calcul des charges est redéfini. |

## Prérequis

- JDK 25
- Maven 3.10 (pour TP1.2 et TP1.4)
- MySQL (pour la partie base de données de TP1.4)

## Compiler et lancer un TP

Chaque TP contient son propre README avec les commandes exactes. Le principe général :

**Projet Java simple** (TP2.1, TP2.2, exo28) : on compile les sources de `src/` vers un dossier `out/`, puis on lance la classe qui contient `main` avec son nom complet (package compris).

```
cd TP2.1
javac -encoding UTF-8 -d out src/sn/ucad/esp/glsi/tp21/*.java
java -Dstdout.encoding=UTF-8 -cp out sn.ucad.esp.glsi.tp21.Main
```

**Projet Maven** (TP1.2, TP1.4) : Maven lit le `pom.xml`, télécharge les dépendances et compile dans `target/`.

```
cd TP1.4
mvn compile
mvn clean javafx:run
```

L'option `-Dstdout.encoding=UTF-8` sert à afficher correctement les accents dans la console Windows.

Les dossiers `out/` et `target/` sont générés à la compilation et ne sont pas versionnés (voir `.gitignore`).

## Auteur

**Mahuna Olympe ATCHATIN** | L3-GLSI-A | ESP/UCAD | 2026-2027
