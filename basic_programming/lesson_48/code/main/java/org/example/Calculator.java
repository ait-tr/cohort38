package org.example;

import javax.management.RuntimeErrorException;

public class Calculator {
//    добавить методы sum, sub, mult, div
    public double sum(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }
    public double mult(double a, double b){
        return a * b;
    }
    public double sq(double a){
        return a * a;
    }
    public double div(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Error!!");
        }
        return a / b;
    }

    public void error(){
        throw new RuntimeException("Exception!!");
    }
}
