package com.ing.zoo;
import java.util.Random;

public class Lion extends Carnivore {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        say("roooaaarrr");
    }

    @Override
    public void eatMeat() {
        say("nomnomnom thx mate");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            say("Shows off his beautiful mane");
        } else {
            say("Starts scratching against a tree");
        }
    }
}
