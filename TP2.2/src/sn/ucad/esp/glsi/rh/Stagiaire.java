package sn.ucad.esp.glsi.rh;

public class Stagiaire extends Employe {

    public Stagiaire(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() / 2;   // moitié du salaire de base
    }
}
