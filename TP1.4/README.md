# TP 1.4, Séquence 1 (L'environnement de travail),

## Contenu

- Projet Maven `sn.ucad.esp.glsi:tp14`, Java 25
- JavaFX 25.0.5 (`javafx-controls`, `javafx-fxml`)
- Fenêtre vide `vue.fxml` créée avec Scene Builder (`src/main/resources/sn/ucad/esp/glsi/`)
- Connexion à MySQL avec `mysql-connector-j` 26.10.0 (classe `Test_MySQL`)

## Notions abordées

- Héritage d'une classe de bibliothèque : `App extends Application`
- Redéfinition de méthode (`@Override start(Stage)`)
- Séparation vue / contrôleur : fichiers FXML liés aux classes `PrimaryController` et `SecondaryController`
- Système de modules Java (`module-info.java` : `requires`, `opens`, `exports`)
- Accès à une base de données avec JDBC (`Connection`, `PreparedStatement`, `ResultSet`) et `try`-with-resources

## Prérequis

- JDK 25
- Maven 3.10.0
- MySQL avec la base `tp13`, sa table `information` et l'utilisateur `esp`

## Utilisation

Compiler le projet :

```
mvn compile
```

Lancer l'application JavaFX (classe principale `sn.ucad.esp.glsi.App`) :

```
mvn clean javafx:run
```

Tester la connexion à la base : exécuter la classe `Test_MySQL` depuis l'IDE, après avoir adapté les identifiants de connexion dans `Test_MySQL.java`.

Ce projet dépend de JavaFX et du connecteur MySQL : il se compile avec Maven plutôt qu'avec `javac` seul, car Maven télécharge et ajoute ces bibliothèques automatiquement.


**Auteur** : Mahuna Olympe ATCHATIN | L3-GLSI-A | ESP/UCAD | 2026-2027  