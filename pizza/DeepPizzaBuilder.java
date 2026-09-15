package pizza;

public class DeepPizzaBuilder extends AbstractPizzaBuilder {
    @Override
    protected void applyDefaults() {
        crust = Pizza.Crust.THICK;
        if (sauce == null) {
            sauce = Pizza.Sauce.TOMATO;
        }
        if (cheese == null) {
            cheese = "Cheddar";
        }
        if (bakingTime == 0) {
            bakingTime = 20;
        }

        if (toppings.isEmpty()) {
            throw new IllegalStateException("Deep dish pizza requires at least one topping");
        }
    }
}