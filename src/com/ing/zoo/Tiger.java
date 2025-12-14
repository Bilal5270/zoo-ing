package com.ing.zoo;

import java.util.Random;

public class Tiger extends Carnivore {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        say("rraaarww");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            say("jumps in tree");
        } else {
            say("scratches ears");
        }
    }
}
