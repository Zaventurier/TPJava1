package tpdesignpattern;

public class FabriqueVehiculeElectricite implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, String espace) {
        return new AutomobileElectricite(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterElectrique(modele, couleur, puissance);
    }
}
