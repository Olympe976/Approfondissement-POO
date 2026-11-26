package sn.ucad.esp.glsi.tp21;

public class Promotion {
    private Etudiant[] etudiants;  // Ce tableau est vide. Il peut contenir 0 étudiants

    private int nbEtudiant = 0;

    public Promotion(int taille){
        if (taille <= 0) throw new IllegalArgumentException("Taille de la promotion invalide");
        etudiants = new Etudiant[taille];
    }

    public void ajouter(Etudiant e) {
        if (e == null)
            throw new IllegalArgumentException("Etudiant obligatoire");

        if (this.nbEtudiant == etudiants.length)
            throw new IllegalStateException("La promotion est déjà pleine");

        for (int i = 0; i < nbEtudiant; i++){
            if (etudiants[i].equals(e))
                throw new IllegalArgumentException("Cet étudiant existe déjà");
        }

        etudiants[nbEtudiant++] = e;
    }

    public boolean supprimerEtudiant(String matricule){
        if (matricule == null || matricule.isBlank())
            throw new IllegalArgumentException("Matricule invalide");

        for(int i = 0; i < nbEtudiant; i++){
            if(etudiants[i].getMatricule().equals(matricule)) {
                //On decale le reste des éléments du tableau vers la gauche
                for (int j = i; j < nbEtudiant - 1; j++) {
                    etudiants[j] = etudiants[j + 1];
                }
                etudiants[--nbEtudiant] = null;
                return true;
            }
        }
        return false;
    }

    public Etudiant rechercherParMatricule(String matricule) {
        if (matricule == null || matricule.isBlank())
            throw new IllegalArgumentException("Matricule invalide");

        for(int i = 0; i < nbEtudiant; i++){
            if(etudiants[i].getMatricule().equals(matricule))
                return etudiants[i];
        }
        return null;
    }

    public double moyenneGenerale() {
        double somme = 0.0;
        if (nbEtudiant == 0)
            throw new IllegalStateException("Promotion vide");

        for (int i = 0; i < nbEtudiant; i++) {
            somme+= etudiants[i].getMoyenne();
        }
        return somme / nbEtudiant;
    }

    @Override
    public String toString(){
        String promotion =  "Promotion - Capacité: " + etudiants.length + " - Effectif: " + nbEtudiant + "\n";
        for (int i = 0; i < nbEtudiant; i++) {
            promotion += etudiants[i].toString() + "\n";
        }

        return promotion;

    }

    
}
