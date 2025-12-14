package com.ing.zoo;

import java.util.Random;

public class Hippo extends Herbivore {

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        say("splash");
    }

    @Override
    public void eatLeaves() {
        say("munch munch lovely");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            say("Splashes around in the water");
        } else {
            say("Belly flops into the water");
        }
    }
}
