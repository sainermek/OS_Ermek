package pizza;

public class PizzaDirector {
    public Pizza makeMargherita(PizzaBuilder builder) {
        return builder
                .setSize(Pizza.Size.MEDIUM)
                .setCheese("Mozzarella")
                .addTopping("Basil")
                .build();
    }
}
