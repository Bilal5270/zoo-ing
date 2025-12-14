package com.ing.zoo;

import java.util.Random;

public class Zebra extends Herbivore {

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        say("zebra zebra");
    }

    @Override
    public void eatLeaves() {
        say("munch munch zank yee bra");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            say("plays with their fellow zebras");
        } else {
            say("runs quickly to the edge of the habitat");
        }
    }
}
