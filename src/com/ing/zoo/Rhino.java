package com.ing.zoo;

import java.util.Random;

public class Rhino extends Herbivore {

    public Rhino(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        say("hgrhhh");
    }

    @Override
    public void eatLeaves() {
        say("munch munch on this lovely grass");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            say("Rams into a tree");
        } else {
            say("eats 30kg of vegetation to show off");
        }
    }
}
