package pizza;

import java.util.List;

public final class Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    public enum Crust { THIN, DEEP_DISH }
    public enum Sauce { TOMATO, GARLIC }

    private final Size size;
    private final Crust crust;
    private final Sauce sauce;
    private final String cheese;
    private final List<String> toppings;
    private final int bakingTime;

    public Pizza(Size size, Crust crust, Sauce sauce, String cheese, List<String> toppings, int bakingTime) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
        this.bakingTime = bakingTime;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + ", sauce=" + sauce +
               ", cheese=" + cheese + ", toppings=" + toppings + ", bakingTime=" + bakingTime + "m]";
    }
}
