package tpdesignpattern;

public class AutomobileElectricite extends Automobile {
    public AutomobileElectricite(String modele, String couleur, int puissance, String espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public String afficherCaracteristique(){
        return "Autombile Electrique : "+ super.afficherCaracteristique();
    }
}
