package pizza;

public class ThinPizzaBuilder extends AbstractPizzaBuilder {
    @Override
    protected void applyDefaults() {
        crust = Pizza.Crust.THIN;
        if (sauce == null) sauce = Pizza.Sauce.TOMATO;
        if (cheese == null) cheese = "Mozzarella";
        if (bakingTime == 0) bakingTime = 8;
    }
}

class DeepPizzaBuilder extends AbstractPizzaBuilder {
    @Override
    protected void applyDefaults() {
        crust = Pizza.Crust.DEEP_DISH;
        if (sauce == null) sauce = Pizza.Sauce.TOMATO;
        if (cheese == null) cheese = "Cheddar";
        if (bakingTime == 0) bakingTime = 45;
        if (toppings.isEmpty()) {
            throw new IllegalStateException("Deep dish pizza requires at least one topping");
        }
    }
}
