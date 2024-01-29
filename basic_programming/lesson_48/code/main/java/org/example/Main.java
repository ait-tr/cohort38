package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator =  new Calculator();
        try{
            calculator.div(12, 0);
        }catch (ArithmeticException e){
            throw  new RuntimeException("Что-то пошло не так с делением");
        }
    }
}