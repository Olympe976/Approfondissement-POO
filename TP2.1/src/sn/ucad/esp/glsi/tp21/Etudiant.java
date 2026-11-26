package sn.ucad.esp.glsi.tp21;

import java.time.LocalDate;

public class Etudiant {
    private final String matricule;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private double moyenne;

    private static int nombreEtudiantsCrees = 0;

    public Etudiant(String matricule, String nom, String prenom, LocalDate dateNaissance, double moyenne)
    {
        if (matricule == null || matricule.isBlank())
            throw new IllegalArgumentException("Matricule obligatoire");
        if (nom == null || nom.isBlank())
            throw new IllegalArgumentException("Nom obligatoire");
        if (prenom == null || prenom.isBlank())
            throw new IllegalArgumentException("Prénom obligatoire");
        if (dateNaissance == null || dateNaissance.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Date de naissance invalide");
        if (moyenne < 0 || moyenne > 20)
            throw new IllegalArgumentException("Moyenne hors de [0, 20]");

        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.moyenne = moyenne;

        nombreEtudiantsCrees++;
    }

    public String getMatricule(){
        return this.matricule;
    }
    public double getMoyenne(){
        return this.moyenne;
    }

    public static int getNombreEtudiantsCrees(){
        return nombreEtudiantsCrees;
    }

    @Override
    public String toString() {
        return matricule + " - " + prenom + " " + nom + " (né le " + dateNaissance + ") moyenne = " + moyenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Etudiant autre))
            return false;
        return matricule.equals(autre.matricule);
    }

    @Override
    public int hashCode() {
        return matricule.hashCode();
    }
}