package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        Animal[] animals = {
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Panda("bobby"),
                new Rhino("billy")
        };


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().toLowerCase();
        String[] parts = input.split(" ");

        if (parts[0].equals("hello")) {
            if (parts.length == 1) {
                for (Animal a : animals) {
                    a.sayHello();
                }
            } else {
                for (Animal a : animals) {
                    if (a.getName().equals(parts[1])) {
                        a.sayHello();
                    }
                }
            }
            return;
        }

        // Giving leaves(pig joins in on the first feeding)
        if (input.equals("give leaves")) {
            for (Animal a : animals) {
                if (a instanceof Herbivore) {
                    ((Herbivore)a).eatLeaves();
                }
                if (a instanceof Omnivore) {
                    ((Omnivore)a).eatLeaves();
                }
            }
    }

        // giving meat
        if (input.equals("give meat")) {
            for (Animal a : animals) {
                if (a instanceof Carnivore) {
                    ((Carnivore) a).eatMeat();
                }
            }
            return;
        }

        // perform circus tricks
        if (input.equals("perform trick")) {
            for (Animal a : animals) {
                a.performTrick();
            }
            return;
        }

        // unknown
        System.out.println("Unknown command: " + input);
    }
}
