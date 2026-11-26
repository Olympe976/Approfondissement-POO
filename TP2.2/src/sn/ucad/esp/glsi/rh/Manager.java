package sn.ucad.esp.glsi.rh;

public class Manager extends Employe {
    private final double prime;

    public Manager(String nom, double salaireBase, double prime) {
        super(nom, salaireBase); // Initialise la partie Employe
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = super.calculerSalaire(); // Reutilise le calcul de base
        salaire += this.prime; // Calcul du salaire du Manager
        return salaire;
    }
}