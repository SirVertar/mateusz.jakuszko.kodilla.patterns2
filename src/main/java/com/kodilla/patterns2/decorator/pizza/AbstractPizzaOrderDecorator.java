package com.kodilla.patterns2.decorator.pizza;

import java.util.List;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder{

    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public Double getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public List<Ingredients> getIngredients() {
        return pizzaOrder.getIngredients();
    }
}
