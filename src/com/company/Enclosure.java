package com.company;

import java.util.ArrayList;
import java.util.List;

public class Enclosure<T extends Animal> {

    private List<T> t;

    Enclosure() {
        t = new ArrayList<>();
    }

    public List<T> getT() {
        return t;
    }

    public void addT(T t) {
        this.t.add(t);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(T a :t)
            sb.append(a + " ");

        return sb.toString();
    }


}
