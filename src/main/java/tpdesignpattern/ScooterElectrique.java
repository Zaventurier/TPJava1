package tpdesignpattern;

public class ScooterElectrique extends Scooter {
    public ScooterElectrique(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }
    @Override
    public String afficherCaracteristiqueScooter(){
        return "Scooter Electrique : " + super.afficherCaracteristiqueScooter();
    }
}
