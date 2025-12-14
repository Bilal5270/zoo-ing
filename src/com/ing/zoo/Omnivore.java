package com.ing.zoo;

public abstract class Omnivore extends Animal {

    public Omnivore(String name) {
        super(name);
    }

    public void eatLeaves() {
        System.out.println(getName() + " eats leaves");
    }

    public void eatMeat() {
        System.out.println(getName() + " eats meat");
    }
}
