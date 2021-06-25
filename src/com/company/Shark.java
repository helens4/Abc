package com.company;

public class Shark extends Animal {

    public static final String MEAL_DEFAULT = "je tuńczyka";

    public Shark(String name) {
        super(name);
    }

    @Override
    public void eats() {
        System.out.println("Żyrafa " + name + " " + MEAL_DEFAULT);
    }

    @Override
    public void eats(int howMany) {
        for(int i = 0; i < howMany; i++)
            System.out.println("Rekin " + name + " " + MEAL_DEFAULT);
    }
}