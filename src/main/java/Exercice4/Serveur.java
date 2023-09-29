package Exercice4;

public class Serveur {
    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza monteurPizza) {
        this.monteurPizza = monteurPizza;
    }

    public Pizza getPizza() {
        return monteurPizza.getPizza();
    }

    public void construirePizza() {
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterPatte();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
    }
}
