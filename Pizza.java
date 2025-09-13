import java.util.List;
//product

public class Pizza {
    private final PizzaType pizza;
    private final Size size;
    private final Toppings topping;
    private final Sauce sauce;
    private final double price;

    public Pizza(PizzaType pizza, Size size, Toppings topping, Sauce sauce, double price) {
        this.pizza = pizza;
        this.size = size;
        this.topping = topping;
        this.sauce = sauce;
        this.price = price;
    }

    public PizzaType getPizza() {
        return pizza;
    }
    public Size getSize() {
        return size;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Toppings getTopping() {
        return topping;
    }

    public double getPrice() {
        return price;
    }
}

enum Size {
    Large, Medium, Small
}
enum Toppings {
    Pineapple,Pepperoni,Parmezan,Chicken,Tomatoes
}
enum PizzaType {
    Margarita,Meat,Cheese,Pepperoni,Hawaii
}
enum Sauce {
    Tomato,creamy
}




    //
//    public Pizza(String size, String dough, String topping, String sauce) {
//        this.size = size;
//        this.dough = dough;
//        this.topping = topping;
//        this.sauce = sauce;
//    }



