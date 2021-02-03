package com.ederfmatos.jenkins.expression;

public class Number implements Expression {

    private final int value;

    private Number(int value) {
        this.value = value;
    }

    public static Number of(int value) {
        return new Number(value);
    }

    @Override
    public int resolve() {
        return value;
    }

    @Override
    public String show() {
        return String.valueOf(value);
    }
}
