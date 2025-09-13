import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder builder = new PizzaBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pizza that you would like to eat:");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "pepperoni" -> {
                director.constructPizzaPepperoniS(builder);
                printPizza(builder.build());
                director.constructPizzaPepperoniM(builder);
                printPizza(builder.build());
                director.constructPizzaPepperoniL(builder);
                printPizza(builder.build());
            }
            case "meat" -> {
                director.constructPizzaMeatS(builder);
                printPizza(builder.build());
                director.constructPizzaMeatM(builder);
                printPizza(builder.build());
                director.constructPizzaMeatL(builder);
                printPizza(builder.build());
            }
            case "cheese" -> {
                director.constructPizzaCheeseS(builder);
                printPizza(builder.build());
                director.constructPizzaCheeseM(builder);
                printPizza(builder.build());
                director.constructPizzaCheeseL(builder);
                printPizza(builder.build());
            }
            case "margarita" -> {
                director.constructPizzaMargaritaS(builder);
                printPizza(builder.build());
                director.constructPizzaMargaritaM(builder);
                printPizza(builder.build());
                director.constructPizzaMargaritaL(builder);
                printPizza(builder.build());
            }
            case "hawaii" -> {
                director.constructPizzaHawaiiS(builder);
                printPizza(builder.build());
                director.constructPizzaHawaiiM(builder);
                printPizza(builder.build());
                director.constructPizzaHawaiiL(builder);
                printPizza(builder.build());
            }
        }
    }

    private static void printPizza(Pizza pizza) {
        System.out.println(pizza.getPizza() +
                " | Size: " + pizza.getSize() +
                " | Sauce: " + pizza.getSauce() +
                " | Topping: " + pizza.getTopping() +
                " | Price: $" + pizza.getPrice());
    }
}
