package sn.ucad.esp.glsi.rh;

public class Employe {
    private final String nom;
    protected double salaireBase; // visible des sous-classes

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public String getNom() {
        return nom;
    }

    // Comportement par defaut, que les sous-classes pourront redéfinir
    public double calculerSalaire() {
        return salaireBase;
    }

    @Override
    public String toString() {
        // getClass() renvoie le type REEL de l'objet
        return getClass().getSimpleName() + " " + nom + " : " + calculerSalaire() + " FCFA";
    }
}