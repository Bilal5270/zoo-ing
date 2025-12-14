package com.ing.zoo;

public abstract class Carnivore extends Animal {
    public Carnivore(String name) {
        super(name);
    }

    public void eatMeat() {
        System.out.println(getName() + " eats meat");
    }
}

