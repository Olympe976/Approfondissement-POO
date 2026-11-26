public class Villa extends Bien {
    private final double surfaceJardin;

    public Villa(String adresse, double loyerMensuel, double surfaceJardin) {
        super(adresse, loyerMensuel);
        this.surfaceJardin = surfaceJardin;
    }

    @Override
    public double calculerCharges() {
        return super.calculerCharges() + 100 * surfaceJardin; // charges de base + 100F par m2 du jardin
    }
}