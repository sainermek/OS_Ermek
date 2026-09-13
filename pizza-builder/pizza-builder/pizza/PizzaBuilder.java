package pizza;

import java.util.ArrayList;
import java.util.List;

public interface PizzaBuilder {
    PizzaBuilder setSize(Pizza.Size size);
    PizzaBuilder setSauce(Pizza.Sauce sauce);
    PizzaBuilder setCheese(String cheese);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}

abstract class AbstractPizzaBuilder implements PizzaBuilder {
    protected Pizza.Size size;
    protected Pizza.Crust crust;
    protected Pizza.Sauce sauce;
    protected String cheese;
    protected List<String> toppings = new ArrayList<>();
    protected int bakingTime;

    public PizzaBuilder setSize(Pizza.Size size) { this.size = size; return this; }
    public PizzaBuilder setSauce(Pizza.Sauce sauce) { this.sauce = sauce; return this; }
    public PizzaBuilder setCheese(String cheese) { this.cheese = cheese; return this; }
    public PizzaBuilder addTopping(String topping) { this.toppings.add(topping); return this; }

    protected abstract void applyDefaults();

    @Override
    public final Pizza build() {
        applyDefaults();
        if (size == null) throw new IllegalStateException("Pizza size must be specified");
        if (cheese == null) throw new IllegalStateException("Cheese type must be specified");
        return new Pizza(size, crust, sauce, cheese, toppings, bakingTime);
    }
}
