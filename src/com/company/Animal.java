package com.company;

public abstract class Animal implements Eatable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
