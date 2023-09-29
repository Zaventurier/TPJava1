package Exercice5;

public class ClientMaison {
    public static void main(String[] args) {
        System.out.println("Construction d'une maison en bois ...");
        MonteurMaison monteurBois = new MonteurBois();
        Maison maisonBois = FabriqueMaison.construireMaison(monteurBois);
        System.out.println(maisonBois.getRepresentation());
    }
}
