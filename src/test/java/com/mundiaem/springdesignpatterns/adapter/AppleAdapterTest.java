package com.mundiaem.springdesignpatterns.adapter;

import org.junit.jupiter.api.Test;

/**
 * created with love by mundiaem
 * created on 28/06/2021
 * Time: 16:55
 * ⚡  - Spring-Design-Patterns
 */

public class AppleAdapterTest {
    @Test
    public void testAdapter(){
        Orange orange = new MoroOrange();
        Apple apple= new AppleAdapter(orange);
        System.out.println(apple.getVariety());
        apple.eat();
    }
}
