package com.mundiaem.springdesignpatterns.controller;

import com.mundiaem.springdesignpatterns.factory.Pet;
import com.mundiaem.springdesignpatterns.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * created with love by mundiaem
 * created on 26/06/2021
 * Time: 15:50
 * ⚡  - Spring-Design-Patterns
 */
@RestController
@RequestMapping("/")
public class AppController {
    @Autowired
    private PetFactory petFactory;

    @GetMapping
    public String getDefault() {
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping("adoptpet/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
        Pet pet = this.petFactory.createPet(type);
        pet.setName(name);

        pet.feed();
        return pet;
    }
}
