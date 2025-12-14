package com.ing.zoo;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void say(String text) {
        System.out.println(name + ": " + text);
    }

    public abstract void sayHello();

    public abstract void performTrick();
}