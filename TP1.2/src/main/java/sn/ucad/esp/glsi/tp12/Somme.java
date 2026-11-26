package sn.ucad.esp.glsi.tp12;

public class Somme {
    // Calcule la somme des entiers de 1 a n
    static int somme(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;          // Poser un point d'arret sur cette ligne
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Somme de 1 a 10 = " + somme(10));   // affiche 55
    }
}