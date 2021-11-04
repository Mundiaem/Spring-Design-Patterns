package com.mundiaem.springdesignpatterns.decorator;

import java.math.BigDecimal;

/**
 * created with love by mundiaem
 * created on 28/06/2021
 * Time: 17:21
 * ⚡  - Spring-Design-Patterns
 */

public class ThickCrustPizza extends Pizza{
    public ThickCrustPizza() {
        super();
        this.description="Thick Crust Pizza";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("15.00");
    }
}
