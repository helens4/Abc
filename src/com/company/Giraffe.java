package com.company;

public class Giraffe extends Animal {

    public static final String MEAL_DEFAULT = "je paszę";

    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void eats() {
        System.out.println("Żyrafa " + name + " " + MEAL_DEFAULT);
    }

    @Override
    public void eats(int howMany) {
        for(int i = 0; i < howMany; i++)
            System.out.println("Żyrafa " + name + " " + MEAL_DEFAULT);
    }
}
