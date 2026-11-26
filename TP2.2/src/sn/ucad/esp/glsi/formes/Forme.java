package sn.ucad.esp.glsi.formes;

public class Forme {

    // Comportement par défaut : une forme quelconque n'a pas d'aire connue
    public double aire() {
        return 0;
    }

    @Override
    public String toString() {
        // getClass() renvoie le type REEL, comme dans Employe
        return getClass().getSimpleName() + " : aire = " + String.format("%.2f", aire());
    }
}