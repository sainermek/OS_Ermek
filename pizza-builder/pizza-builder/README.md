# Pizza Builder

Java implementation of the Builder design pattern, packed into 5 source files.

## Structure

```
pizza/
  Pizza.java             Product, with nested enums Size, Crust, Sauce
  PizzaBuilder.java       Builder interface + AbstractPizzaBuilder (shared fluent logic)
  ConcreteBuilders.java   ThinPizzaBuilder and DeepPizzaBuilder
  PizzaDirector.java      Director - known recipe (Margherita)
  Main.java               Client - demo entry point
```

## Why these two builders are different representations

- **ThinPizzaBuilder**: forces `Crust.THIN`, defaults to tomato sauce, mozzarella, 8-minute bake.
- **DeepPizzaBuilder**: forces `Crust.DEEP_DISH`, defaults to tomato sauce, cheddar, 45-minute bake, and refuses to build (`IllegalStateException`) if no topping was added — a deep dish without filling isn't valid.

## Run it

```bash
javac -d out pizza/*.java
java -cp out pizza.Main
```

Expected output: a director-built Margherita, a custom small garlic pizza, and a caught validation error from trying to build a topping-less deep dish.
