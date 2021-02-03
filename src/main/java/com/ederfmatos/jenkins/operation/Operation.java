package com.ederfmatos.jenkins.operation;

import com.ederfmatos.jenkins.expression.Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operation {

    private final List<Expression> expressions;

    public Operation() {
        this.expressions = new ArrayList<>();
    }

    public Operation(Expression... expressions) {
        this.expressions = Arrays.asList(expressions);
    }

    public Operation withExpression(Expression expression) {
        this.expressions.add(expression);
        return this;
    }

    public int run() {
        return expressions.stream().reduce(0, (integer, expression) -> expression.resolve() + integer, Integer::sum);
    }

}
