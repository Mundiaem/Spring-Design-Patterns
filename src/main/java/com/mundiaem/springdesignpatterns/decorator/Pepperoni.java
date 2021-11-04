package com.mundiaem.springdesignpatterns.decorator;

import java.math.BigDecimal;

/**
 * created with love by mundiaem
 * created on 28/06/2021
 * Time: 17:25
 * ⚡  - Spring-Design-Patterns
 */

public class Pepperoni extends  PizzaIngredient{
    private Pizza pizza;
    public Pepperoni(Pizza pizza) {
        super();
        this.pizza= pizza;
    }

    @Override
    public BigDecimal getCost() {
        return (new BigDecimal("1.50")).add(this.pizza.getCost());
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+"+ pepperoni";
    }
}
