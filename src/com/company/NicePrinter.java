package com.company;

public class NicePrinter implements FavNumber<Integer> {

    public void printFav(Integer a) {
        System.out.println(a);
    }

    public <T> boolean isDiff(T a, T b) {
        return !a.equals(b);
    }
}
