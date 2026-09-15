package pizza;

public class ThinPizzaBuilder extends AbstractPizzaBuilder {
    @Override
    protected void applyDefaults() {
        crust = Pizza.Crust.THIN;
        if (sauce == null) {
            sauce = Pizza.Sauce.TOMATO;
        }
        if (cheese == null) {
            cheese = "Mozzarella";
        }
        if (bakingTime == 0) {
            bakingTime = 8;
        }
    }
}