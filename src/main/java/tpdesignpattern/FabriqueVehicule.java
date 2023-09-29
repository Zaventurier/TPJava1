package tpdesignpattern;

public interface FabriqueVehicule {
    Automobile creerAutomobile(String modele, String couleur, int puissance, String espace);
    Scooter creerScooter(String modele, String couleur, int puissance);
}
