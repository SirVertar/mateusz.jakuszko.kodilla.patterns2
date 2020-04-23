package com.kodilla.patterns2.decorator.pizza;

import java.util.List;

public class ExtraCheesePizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    protected ExtraCheesePizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public Double getCost() {
        return super.getCost() + Ingredients.EXTRA_CHEESE.price;
    }

    @Override
    public List<Ingredients> getIngredients() {
        List<Ingredients> ingredients = super.getIngredients();
        ingredients.add(Ingredients.EXTRA_CHEESE);
        return ingredients;
    }
}
