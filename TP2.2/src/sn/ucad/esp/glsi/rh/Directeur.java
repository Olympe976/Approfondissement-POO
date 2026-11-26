package sn.ucad.esp.glsi.rh;

public class Directeur extends Employe{
    private static final double TAUX_PRIME = 0.2;

    public Directeur(String nom, double salaireBase){
        super(nom,salaireBase);
    }

    @Override
    public double calculerSalaire(){
        return super.calculerSalaire() + this.salaireBase * TAUX_PRIME;
    }
}
