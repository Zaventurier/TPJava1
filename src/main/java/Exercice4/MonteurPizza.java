package Exercice4;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellePizza() {
        pizza = new Pizza();
    }

    public abstract void monterPatte();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}
