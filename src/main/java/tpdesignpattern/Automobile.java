package tpdesignpattern;

public abstract class Automobile {

    private static int idCounter = 0;
    private int id;
    private String modele;
    private String couleur;
    private int puissance;
    private String espace;

    public Automobile(String modele, String couleur, int puissance, String espace) {
        this.id = idCounter++;
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.espace = espace;
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

    public String getEspace() {
        return espace;
    }

    public void setEspace(String espace) {
        this.espace = espace;
    }

    public String afficherCaracteristique(){
        return "La voiture n° " + this.id + " est un modèle de type " + this.modele + " de couleur " + this.couleur + " avec une puissance de "
                + this.puissance + " cheveaux et avec un espace de " + this.espace + " m2";
    }
}
