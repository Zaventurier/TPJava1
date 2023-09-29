package Exercice2;

public class Database {
    private static Database instance = null;
    private int record;
    private String name;

    private Database(String name) {
        this.name = name;
        this.record = 0;
    }

    public static Database getInstance(String name) {
        if (instance == null) {
            instance = new Database(name);
        }
        return instance;
    }

    public void editRecord() {
        // Simule l'édition d'un enregistrement
        record++;
        System.out.println("Enregistrement édité dans la base de données.");
    }

    public String getName() {
        return this.name;
    }

    public int getRecord() {
        return this.record;
    }

    public static void main(String[] args) {
        // Crée une instance de la base de données
        Database db = Database.getInstance("MaBaseDeDonnees");

        // Affiche le nom de la base de données
        System.out.println("Nom de la base de données : " + db.getName());

        // Affiche le numéro d'enregistrement courant
        System.out.println("Numéro d'enregistrement courant : " + db.getRecord());

        // Édite un enregistrement
        db.editRecord();

        // Affiche à nouveau le numéro d'enregistrement courant après l'édition
        System.out.println("Numéro d'enregistrement courant après l'édition : " + db.getRecord());
    }
}

