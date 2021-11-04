package com.mundiaem.springdesignpatterns.factory;

import com.mundiaem.springdesignpatterns.factory.models.Cat;
import com.mundiaem.springdesignpatterns.factory.models.Dog;
import org.springframework.stereotype.Component;

/**
 * created with love by mundiaem
 * created on 26/06/2021
 * Time: 15:20
 * ⚡  - Spring-Design-Patterns
 */
@Component
public class PetFactory {
    public Pet createPet(String animalType){
        switch (animalType.toLowerCase()){
            case "dog":
                return new Dog();
            case "cat":
                return  new Cat();
            default:
                throw new UnsupportedOperationException("Unknown animal type");
        }
    }
}
