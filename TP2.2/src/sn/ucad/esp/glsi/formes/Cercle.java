package sn.ucad.esp.glsi.formes;

public class Cercle extends Forme {
    private final double rayon;

    public Cercle(double rayon) {
        if (rayon <= 0)
            throw new IllegalArgumentException("Rayon invalide");
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}