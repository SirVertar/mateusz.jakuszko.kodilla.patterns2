package com.kodilla.patterns2;

import com.kodilla.patterns2.decorator.pizza.BasicPizzaOrder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaPatterns2Application {

    public static void main(String[] args) {
        SpringApplication.run(KodillaPatterns2Application.class, args);
        BasicPizzaOrder basicPizzaOrder = new BasicPizzaOrder();
        System.out.println(basicPizzaOrder.getCost());
    }


}
