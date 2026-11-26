package sn.ucad.esp.glsi.rh;

public class Paie {
    // Fonctionne pour tout Employe, présent ou futur
    static double masseSalariale(Employe[] employes) {
        double total = 0;
        for (Employe e : employes) {
            total += e.calculerSalaire(); // Détermination du type d'employé par liaison dynamique
        }
        return total;
    }

    static String categorie(Employe e) {
        return switch (e) {
            case Manager m -> "Encadrement";
            case Directeur d -> "Encadrement";
            case Vendeur v -> "Commercial";
            case Stagiaire s -> "Stage";
            default -> "Autre";
        };
    }

    static void afficher_employes(Employe[] employes) {
        for (Employe e : employes) {
            System.out.println(e + " (" + categorie(e) + ")");
        }
    }

    static Employe plusPaye(Employe[] employes){
        if (employes == null || employes.length == 0)
            return null;

        Employe p = employes[0];
        for(Employe e : employes){
            if(e.calculerSalaire() > p.calculerSalaire())
                p = e;
        }
        return p;
    }

    public static void main(String[] args) {
        // Un tableau de type Employe peut contenir des Manager et des Vendeur
        Employe[] equipe = {
                new Employe("Awa", 200000),
                new Manager("Moussa", 400000, 100000),
                new Vendeur("Fatou", 150000, 2000000),
                new Stagiaire("Boubacar", 100000),
                new Directeur("Maktar", 800000)
        };

        afficher_employes(equipe);
        System.out.println("Masse salariale : " + masseSalariale(equipe));
        Employe p = plusPaye(equipe);
        if(p != null)
            System.out.println("Le plus payé : " + p);
    }
}