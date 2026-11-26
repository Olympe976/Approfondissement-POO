package sn.ucad.esp.glsi.formes;

public class Main {

    // fonctionne pour toute Forme, présente ou future
    static double sommeAires(Forme[] formes) {
        double total = 0;
        for (Forme f : formes) {
            total += f.aire();
        }
        return total;
    }

    public static void main(String[] args) {
        Forme[] formes = {
                new Cercle(2),
                new Cercle(1),
                new Rectangle(3, 4),
                new Rectangle(5, 2)
        };

        for (Forme f : formes)
            System.out.println(f);

        System.out.println("Somme des aires : " + String.format("%.2f", sommeAires(formes)));

        //Provoquer volontairement une ClassCastException
        System.out.println("\n--- Cast sans vérification ---");
        Forme f = new Cercle(2);
        try {
            Rectangle r = (Rectangle) f;
            System.out.println("Cast réussi : " + r);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException : " + e.getMessage());
        }

        //Correction
        System.out.println("\n--- Cast avec instanceof ---");
        if (f instanceof Rectangle r)
            System.out.println("Cast réussi : " + r);
        else
            System.out.println("Cast évité : f n'est pas un Rectangle mais un " + f.getClass().getSimpleName());
    }
}