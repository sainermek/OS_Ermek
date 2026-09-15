package pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizzaBuilder implements PizzaBuilder {
    protected Pizza.Size size;
    protected Pizza.Crust crust;
    protected Pizza.Sauce sauce;
    protected String cheese;
    protected List<String> toppings = new ArrayList<>();
    protected int bakingTime;

    @Override
    public PizzaBuilder setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setCrust(Pizza.Crust crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(Pizza.Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public PizzaBuilder setToppings(List<String> toppings) {
        this.toppings = new ArrayList<>(toppings);
        return this;
    }

    @Override
    public PizzaBuilder setBakingTime(int minutes) {
        this.bakingTime = minutes;
        return this;
    }

    protected abstract void applyDefaults();

    @Override
    public final Pizza build() {
        applyDefaults();

        if (size == null) {
            throw new IllegalStateException("Pizza size must be specified");
        }
        if (cheese == null) {
            throw new IllegalStateException("Cheese type must be specified");
        }

        return new Pizza(size, crust, sauce, cheese, toppings, bakingTime);
    }
}