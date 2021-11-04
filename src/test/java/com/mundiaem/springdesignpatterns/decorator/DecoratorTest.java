package com.mundiaem.springdesignpatterns.decorator;

import org.junit.jupiter.api.Test;

/**
 * created with love by mundiaem
 * created on 28/06/2021
 * Time: 17:30
 * ⚡  - Spring-Design-Patterns
 */

public class DecoratorTest {
@Test
public  void testDecorator(){
    Pizza pizza = new ThickCrustPizza();
    System.out.println(pizza.getDescription());
    System.out.println(pizza.getCost());

    Pepperoni pepperoni = new Pepperoni(pizza);
    System.out.println(pepperoni.getDescription());
    System.out.println(pepperoni.getCost());

    Pepperoni doublePepperoni = new Pepperoni(pepperoni);
    System.out.println(doublePepperoni.getDescription());
    System.out.println(doublePepperoni.getCost());

}
}
