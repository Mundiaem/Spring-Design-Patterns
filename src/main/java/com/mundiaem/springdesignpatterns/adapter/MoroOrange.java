package com.mundiaem.springdesignpatterns.adapter;

/**
 * created with love by mundiaem
 * created on 28/06/2021
 * Time: 16:51
 * ⚡  - Spring-Design-Patterns
 */

public class MoroOrange implements Orange {
    @Override
    public String getVariety() {
        return "Moro Blood Orange";
    }

    @Override
    public void eat() {
        System.out.println("Moro gets enjoyed");

    }

    @Override
    public void peel() {
        System.out.println("More get peeled");
    }

    @Override
    public void juice() {
        System.out.println("Moro gets juiced");
    }
}
