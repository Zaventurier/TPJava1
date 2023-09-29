package Exercice4;

public class MonteurPizzaPiquante extends MonteurPizza {
    @Override
    public void monterPatte() {
        pizza.setPate("Patte feuilletée");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("Sauce piquante");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("Garniture en saucisson");
    }
}
