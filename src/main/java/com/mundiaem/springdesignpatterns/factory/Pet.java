package com.mundiaem.springdesignpatterns.factory;

/**
 * created with love by mundiaem
 * created on 26/06/2021
 * Time: 15:06
 * ⚡ '' - Spring-Design-Patterns
 */
public interface Pet {
    void setName(String name);
    String getName();
    String getType();
    boolean isHungry();
    void feed();
}
