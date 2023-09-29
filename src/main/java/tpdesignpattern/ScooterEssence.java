package tpdesignpattern;

public class ScooterEssence extends Scooter {

    public ScooterEssence(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public String afficherCaracteristiqueScooter(){
        return "Scooter essence : " + super.afficherCaracteristiqueScooter();
    }
}
