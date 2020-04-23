package com.kodilla.patterns2.decorator.pizza;

import java.util.ArrayList;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder {

    private List<Ingredients> ingredients = new ArrayList<>();
    private Double price;

    public BasicPizzaOrder() {
        ingredients.add(Ingredients.DOUGH);
        ingredients.add(Ingredients.CHEESE);
        ingredients.add(Ingredients.TOMATO_SAUCE);
    }

    @Override
    public Double getCost() {
        return calculateCostOfIngredients();
    }

    @Override
    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    private Double calculateCostOfIngredients() {
        return ingredients.stream()
                .mapToDouble(e -> e.price).sum();
    }
}
