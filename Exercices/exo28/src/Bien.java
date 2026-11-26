public class Bien {
    private final String adresse;
    private double loyerMensuel;

    public Bien(String adresse, double loyerMensuel) {
        if (loyerMensuel <= 0)
            throw new IllegalArgumentException("Loyer mensuel invalide");

        this.adresse = adresse;
        this.loyerMensuel = loyerMensuel;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getLoyerMensuel() {
        return loyerMensuel;
    }

    public double calculerCharges() {
        return loyerMensuel * 0.10;  // 10% du loyer pour les charges
    }
}