package com.ing.zoo;

import java.util.Random;

public class Panda extends Herbivore {

    public Panda(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        say("wow-wow");
    }

    @Override
    public void eatLeaves() {
        say("hmm tasty bamboo, munch");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            say("Climbs a tree");
        } else {
            say("Starts to sleep..");
        }
    }
}
