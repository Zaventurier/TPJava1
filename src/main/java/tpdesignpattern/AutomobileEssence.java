package tpdesignpattern;

public class AutomobileEssence extends Automobile {
    public AutomobileEssence(String modele, String couleur, int puissance, String espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public String afficherCaracteristique(){
        return "Autombile essence : " + super.afficherCaracteristique();
    }
}
