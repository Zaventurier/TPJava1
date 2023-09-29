package Exercice3;

public class Journalisation {
    private static Journalisation instance;
    private StringBuilder logs;

    public Journalisation() {
        this.logs = new StringBuilder();
    }

    public static Journalisation getInstance(){
        if(instance == null){
            instance = new Journalisation();
        }
        return instance;
    }

    public void ajouterLog(String log){
        this.logs.append("\n");
    }

    public void afficherLogs(){
        System.out.println("Historique des opérations :\n" + this.logs.toString());
    }
}
