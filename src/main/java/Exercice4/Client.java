package Exercice4;

public class Client {
    public static void main(String[] args) {
        Serveur serveur = new Serveur();
        MonteurPizzaPiquante monteurPizzaPiquante = new MonteurPizzaPiquante();
        serveur.setMonteurPizza(monteurPizzaPiquante);

        serveur.construirePizza();
        Pizza pizza = serveur.getPizza();

        System.out.println("Pizza prête : " + pizza.toString());
    }
}
