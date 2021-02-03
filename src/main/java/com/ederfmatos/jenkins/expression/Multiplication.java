package com.ederfmatos.jenkins.expression;

public class Multiplication implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public Multiplication(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int resolve() {
        return firstExpression.resolve() * secondExpression.resolve();
    }

    @Override
    public String show() {
        return String.format("(%s * %s)", firstExpression.show(), secondExpression.resolve());
    }

}
