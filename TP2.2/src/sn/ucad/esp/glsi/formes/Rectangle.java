package sn.ucad.esp.glsi.formes;

public class Rectangle extends Forme {
    private final double longueur;
    private final double largeur;

    public Rectangle(double longueur, double largeur) {
        if (longueur <= 0 || largeur <= 0)
            throw new IllegalArgumentException("Dimensions invalides");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        return longueur * largeur;
    }
}