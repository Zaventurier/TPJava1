package Exercice5;

public class FabriqueMaison {
    public static Maison construireMaison(MonteurMaison monteur) {
        EtageBois etage = monteur.construireEtage();
        MursBois murs = monteur.construireMurs();
        ToitBois toit = monteur.construireToit();
        return new MaisonBois(etage, murs, toit);
    }
}
