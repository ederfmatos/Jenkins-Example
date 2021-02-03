package com.ederfmatos.jenkins;

import com.ederfmatos.jenkins.expression.*;
import com.ederfmatos.jenkins.expression.Number;

public class Application {

    public static void main(String[] args) {
        Expression expression = new Sum(new Subtraction(Number.of(422), Number.of(100)), Number.of(4));

        expression = new Division(expression, Number.of(2));
        expression = new Multiplication(expression, Number.of(10));

        System.out.println(expression.show());
        System.out.println(expression.resolve());
    }

}
