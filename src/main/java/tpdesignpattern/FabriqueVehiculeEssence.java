package tpdesignpattern;

public class FabriqueVehiculeEssence implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, String espace) {
        return new AutomobileEssence(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterEssence(modele, couleur, puissance);
    }
}
