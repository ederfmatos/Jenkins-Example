package com.ederfmatos.jenkins.expression;

public class Subtraction implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public Subtraction(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int resolve() {
        return firstExpression.resolve() - secondExpression.resolve();
    }

    @Override
    public String show() {
        return String.format("(%s - %s)", firstExpression.show(), secondExpression.resolve());
    }

}
