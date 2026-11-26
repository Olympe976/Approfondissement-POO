public class Main {
    public static void main(String[] args) {
        Bien[] biens = {
                new Appartement("Sicap Liberte 6", 150000, 3),
                new Villa("Almadies", 500000, 200)
        };

        for (Bien b : biens) {
            System.out.println(b.getClass().getSimpleName() + " " + b.getAdresse()
                    + " : loyer = " + b.getLoyerMensuel() + " FCFA, charges = " + b.calculerCharges() + " FCFA");
        }

        try {
            new Villa("Ngor", -1000, 50);
        } catch (IllegalArgumentException e) {
            System.out.println("Creation refusee : " + e.getMessage());
        }
    }
}
