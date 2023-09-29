package tpdesignpattern;

public abstract class Scooter {
    private static int idCounter = 0;
    private int id;
    private String modele;
    private String couleur;
    private int puissance;

    public Scooter(String modele, String couleur, int puissance) {
        this.id = idCounter++;
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String afficherCaracteristiqueScooter(){
        return "La voiture n° " + this.id + " est un modèle de type " + this.modele + " de couleur " + this.couleur + " avec une puissance de "
                + this.puissance + " cheveaux";
    }
}
