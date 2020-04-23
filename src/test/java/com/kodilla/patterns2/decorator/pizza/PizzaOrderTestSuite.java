package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        Double price = pizzaOrder.getCost();
        //Then
        assertEquals(new Double(15.0), price);
    }

    @Test
    public void testBasicPizzaOrderGetIngredientsList() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        List<Ingredients> ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(3, ingredients.size());
        assertTrue(ingredients.contains(Ingredients.TOMATO_SAUCE));
        assertTrue(ingredients.contains(Ingredients.DOUGH));
        assertTrue(ingredients.contains(Ingredients.CHEESE));
    }

    @Test
    public void testExtraCheesePizzaOrderGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        //When
        Double price = pizzaOrder.getCost();
        //Then
        assertEquals(new Double(19.0), price);
    }

    @Test
    public void testExtraCheeseOrderGetIngredientsList() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);

        //When
        List<Ingredients> ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(4, ingredients.size());
        assertTrue(ingredients.contains(Ingredients.CHEESE));
        assertTrue(ingredients.contains(Ingredients.TOMATO_SAUCE));
        assertTrue(ingredients.contains(Ingredients.DOUGH));
        assertTrue(ingredients.contains(Ingredients.EXTRA_CHEESE));
    }

    @Test
    public void testExtraCheeseAndParmezanPizzaOrderGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ParmezanPizzaOrderDecorator(pizzaOrder);
        //When
        Double price = pizzaOrder.getCost();
        //Then
        assertEquals(new Double(24.5), price);
    }

    @Test
    public void testExtraCheeseAndParmezanPizzaOrderGetIngredientsList() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ParmezanPizzaOrderDecorator(pizzaOrder);

        //When
        List<Ingredients> ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(5, ingredients.size());
        assertTrue(ingredients.contains(Ingredients.CHEESE));
        assertTrue(ingredients.contains(Ingredients.TOMATO_SAUCE));
        assertTrue(ingredients.contains(Ingredients.DOUGH));
        assertTrue(ingredients.contains(Ingredients.EXTRA_CHEESE));
        assertTrue(ingredients.contains(Ingredients.PARMEZAN));
    }
}
