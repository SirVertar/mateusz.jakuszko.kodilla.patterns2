package com.kodilla.patterns2.decorator.pizza;

import java.util.List;

public interface PizzaOrder {
    Double getCost();
    List<Ingredients> getIngredients();
}
