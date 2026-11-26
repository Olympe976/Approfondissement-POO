package sn.ucad.esp.glsi.rh;

public class Vendeur extends Employe {
    private static final double TAUX_COMMISSION = 0.05;
    private final double ventes;

    public Vendeur(String nom, double salaireBase, double ventes) {
        super(nom, salaireBase); // Initialise la partie Employe
        this.ventes = ventes;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + ventes * TAUX_COMMISSION;
    }
}