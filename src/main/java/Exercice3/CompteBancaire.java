package Exercice3;

public class CompteBancaire {
    private double solde;

    /**
     * Constrcteur de la class
     * @param solde
     */
    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    /**
     * Getteur getSolde
     * @return solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setteur
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant){
        this.solde += montant;
        Journalisation.getInstance().ajouterLog("Déoôt de " + montant + " €.");
    }

    public void retirer(double montant){
        if(montant <= this.solde){
            this.solde -= montant;
            Journalisation.getInstance().ajouterLog("Retrait de " + montant + " €.");
        }else{
            System.out.println("Solde insufisant pour effectuer le retrait !");
        }
    }
}
