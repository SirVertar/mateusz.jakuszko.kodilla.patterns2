package com.kodilla.patterns2.decorator.pizza;

import java.util.List;

public class ParmezanPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    protected ParmezanPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public Double getCost() {
        return super.getCost() + Ingredients.PARMEZAN.price;
    }

    @Override
    public List<Ingredients> getIngredients() {
        List<Ingredients> ingredients = super.getIngredients();
        ingredients.add(Ingredients.PARMEZAN);
        return ingredients;
    }
}
