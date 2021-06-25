package com.company;

public class Elephant extends Animal {

    public static final String MEAL_DEFAULT = "pije wodę";

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eats() {
        System.out.println("Słoń " + name + " " + MEAL_DEFAULT);

    }
    public void eats(int numberOfMeals) {
        for(int i = 0; i < numberOfMeals; i++)
            eats();
    }
}
