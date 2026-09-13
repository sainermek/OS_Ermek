package pizza;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        Pizza margherita = director.makeMargherita(new ThinPizzaBuilder());
        System.out.println("Director Margherita: " + margherita);

        Pizza custom = new ThinPizzaBuilder()
                .setSize(Pizza.Size.SMALL)
                .setSauce(Pizza.Sauce.GARLIC)
                .setCheese("Goat Cheese")
                .addTopping("Spinach")
                .build();
        System.out.println("Custom Pizza: " + custom);

        try {
            new DeepPizzaBuilder().setSize(Pizza.Size.MEDIUM).build();
        } catch (IllegalStateException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }
    }
}
