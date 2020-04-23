package com.kodilla.patterns2.decorator.pizza;

public enum Ingredients {
    DOUGH(5.0),
    TOMATO_SAUCE(4.0),
    CHEESE(6.0),
    EXTRA_CHEESE(4.0),
    PARMEZAN(5.5),
    GARLIC(6.0),
    CUCUMBER(7.0),
    HAM(8.0);

    public final Double price;

    private Ingredients(Double price) {
        this.price = price;
    }
}
