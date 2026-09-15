package pizza;

import java.util.List;

public interface PizzaBuilder {
    PizzaBuilder setSize(Pizza.Size size);
    PizzaBuilder setCrust(Pizza.Crust crust);
    PizzaBuilder setSauce(Pizza.Sauce sauce);
    PizzaBuilder setCheese(String cheese);
    PizzaBuilder addTopping(String topping);
    PizzaBuilder setToppings(List<String> toppings);
    PizzaBuilder setBakingTime(int minutes);
    Pizza build();
}