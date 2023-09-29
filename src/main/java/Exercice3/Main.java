package Exercice3;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000.0);

        compte.deposer(500.0);
        compte.retirer(200.0);

        System.out.println("Solde du compte : " + compte.getSolde() + " €");

        Journalisation.getInstance().afficherLogs();
    }
}
