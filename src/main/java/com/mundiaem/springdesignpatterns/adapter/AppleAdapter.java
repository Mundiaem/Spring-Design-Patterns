package com.mundiaem.springdesignpatterns.adapter;

/**
 * created with love by mundiaem
 * created on 28/06/2021
 * Time: 16:49
 * ⚡  - Spring-Design-Patterns
 */

public class AppleAdapter implements Apple{
    private final Orange orange;

    public AppleAdapter(Orange orange) {
        super();
        this.orange = orange;
    }

    @Override
    public String getVariety() {
        return orange.getVariety();
    }

    @Override
    public void eat() {
        orange.peel();
        orange.eat();

    }
}
