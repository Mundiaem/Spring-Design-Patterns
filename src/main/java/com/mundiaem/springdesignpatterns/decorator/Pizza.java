package com.mundiaem.springdesignpatterns.decorator;

import java.math.BigDecimal;

/**
 * created with love by mundiaem
 * created on 28/06/2021
 * Time: 17:19
 * ⚡  - Spring-Design-Patterns
 */

public abstract class Pizza {
    protected  String description;

    public String getDescription() {
        return description;
    }
    public abstract BigDecimal getCost();
}
