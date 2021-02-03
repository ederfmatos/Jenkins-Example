package com.ederfmatos.jenkins.expression;

public class Sum implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public Sum(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int resolve() {
        return Integer.sum(firstExpression.resolve(), secondExpression.resolve());
    }

    @Override
    public String show() {
        return String.format("(%s + %s)", firstExpression.show(), secondExpression.resolve());
    }

}
