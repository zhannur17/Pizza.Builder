//concrete builder

public class PizzaBuilder implements Builder {
    private PizzaType pizza;
    private Toppings toppings;
    private Sauce sauce;
    private Size size;
    private double price;


    @Override
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public void setPizza(PizzaType pizza) {
        this.pizza = pizza;
    }

    @Override
    public void setPrice (double price){
        this.price = price;
    }

    public Pizza build() {
        return new Pizza(pizza, size, toppings, sauce, price);
    }
}
