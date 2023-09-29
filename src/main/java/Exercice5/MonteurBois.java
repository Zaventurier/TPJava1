package Exercice5;

public class MonteurBois extends MonteurMaison {
    @Override
    public EtageBois construireEtage() {
        return new EtageBoisBois();
    }
    @Override
    public MursBois construireMurs() {
        return new MursBoisBois();
    }

    @Override
    public ToitBois construireToit() {
        return new ToitBoisBois();
    }
}
