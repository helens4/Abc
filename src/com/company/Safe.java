package com.company;

public class Safe {
    private Integer a;

    private Safe(Integer a) {
        this.a = a;
    }

    public Safe () {
        this(26);
    }

    public Integer getA() {
        return a;
    }
}
