package tpdesignpattern;

public class Main {
    public static void main(String[] args) {
        // Création d'une fabrique de véhicules électriques
        FabriqueVehicule fabriqueVehiculeElectrique = new FabriqueVehiculeElectricite();

        // Création d'une automobile électrique
        Automobile automobileElectrique = fabriqueVehiculeElectrique.creerAutomobile("Tesla Model S", "Noir", 450, "Grand");
        System.out.println(automobileElectrique.afficherCaracteristique());

        // Création d'un scooter électrique
        Scooter scooterElectrique = fabriqueVehiculeElectrique.creerScooter("Vespa Elettrica", "Bleu", 5);
        System.out.println(scooterElectrique.afficherCaracteristiqueScooter());

        // Création d'une fabrique de véhicules essence
        FabriqueVehicule fabriqueVehiculeEssence = new FabriqueVehiculeEssence();

        // Création d'une automobile essence
        Automobile automobileEssence = fabriqueVehiculeEssence.creerAutomobile("Renault Clio", "Rouge", 120, "Moyen");
        System.out.println(automobileEssence.afficherCaracteristique());

        // Création d'un scooter essence
        Scooter scooterEssence = fabriqueVehiculeEssence.creerScooter("Peugeot Django", "Noir", 8);
        System.out.println(scooterEssence.afficherCaracteristiqueScooter());
    }
}
