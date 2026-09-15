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
        System.out.println("Custom Thin Pizza: " + custom);

        Pizza deepDish = new DeepPizzaBuilder()
                .setSize(Pizza.Size.LARGE)
                .addTopping("Pepperoni")
                .build();
        System.out.println("Custom Deep Dish: " + deepDish);
    }
}