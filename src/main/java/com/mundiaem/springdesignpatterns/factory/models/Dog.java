package com.mundiaem.springdesignpatterns.factory.models;

import com.mundiaem.springdesignpatterns.factory.Pet;

/**
 * created with love by mundiaem
 * created on 26/06/2021
 * Time: 15:06
 * ⚡ '' - Spring-Design-Patterns
 */

public class Dog implements Pet {
    private String name;
    private boolean hungry;

    public Dog() {
        super();
        this.hungry = true;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return "DOG";
    }

    @Override
    public boolean isHungry() {
        return this.hungry;
    }

    @Override
    public void feed() {
        this.hungry=false;
    }
}
