public class Appartement extends Bien {
    private final int etage;

    public Appartement(String adresse, double loyerMensuel, int etage) {
        super(adresse, loyerMensuel);
        this.etage = etage;
    }

    @Override
    public double calculerCharges() {
        return super.calculerCharges() + 2000 * etage; //charges de base + 2000 par etage
    }
}