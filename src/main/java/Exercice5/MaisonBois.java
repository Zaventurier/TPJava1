package Exercice5;

public class MaisonBois extends Maison {
    private EtageBois etage;
    private MursBois murs;
    private ToitBois toit;

    public MaisonBois(EtageBois etage, MursBois murs, ToitBois toit) {
        this.etage = etage;
        this.murs = murs;
        this.toit = toit;
    }

    @Override
    public String getRepresentation() {
        return etage.getRepresentation() + "\n" + murs.getRepresentation() + "\n" + toit.getRepresentation();
    }
}
