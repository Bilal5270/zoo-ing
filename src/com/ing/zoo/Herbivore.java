package com.ing.zoo;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    public void eatLeaves() {
        System.out.println(getName() + " eats leaves");
    }
}
