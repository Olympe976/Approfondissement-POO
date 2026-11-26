package sn.ucad.esp.glsi.tp21;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Promotion promotion = new Promotion(5);

        Etudiant etudiant1 = new Etudiant("1ZSER4", "Astou", "Faye", LocalDate.of(2004,3,21), 11.6);
        Etudiant etudiant2 = new Etudiant("8545GH", "Diop", "Mohamed", LocalDate.of(2003,12,1), 17.5);
        Etudiant etudiant3 = new Etudiant("HNDFNH", "Diene", "Mame Diarra", LocalDate.of(2005,6,5), 20.0);
        Etudiant etudiant4 = new Etudiant("DFER53", "Sarr", "Awa", LocalDate.of(2001,8,27), 7.3);
        Etudiant etudiant5 = new Etudiant("4HTETG", "Ba", "Babacar", LocalDate.of(2004,10,17), 14.0);

        promotion.ajouter(etudiant1);
        promotion.ajouter(etudiant2);
        promotion.ajouter(etudiant3);
        promotion.ajouter(etudiant4);
        promotion.ajouter(etudiant5);

        System.out.println(promotion);

        Etudiant res = promotion.rechercherParMatricule("1ZSER4");
        if( res == null)
            System.out.println("Recherche matricule existant (1ZSER4): aucun étudiant trouvé");
        else
            System.out.println("Recherche matricule existant (1ZSER4): " + res);

        res = promotion.rechercherParMatricule("123456");
        if( res == null)
            System.out.println("Recherche matricule inexistant (123456): aucun étudiant trouvé");
        else
            System.out.println("Recherche matricule inexistant (123456): " + res);

        System.out.println("Moyenne générale de la promotion: " + String.format("%.2f", promotion.moyenneGenerale()));

        try {
            Etudiant e = new Etudiant("X2343E", "Dieng", "Mamour", LocalDate.of(2004, 1, 1), 25);
            System.out.println("Etudiant créé.");
        } catch (IllegalArgumentException e) {
            System.out.println("\n\nCréation refusée: "+ e.getMessage());
        }

        System.out.println("Nombre d'étudiants créés: "+ Etudiant.getNombreEtudiantsCrees());
    }
}
