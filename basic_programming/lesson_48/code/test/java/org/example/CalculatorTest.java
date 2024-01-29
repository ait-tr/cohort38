package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUp(){
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"1,1,1", "2,2,4", "5,5,25"})
    public void mult(double a, double b, double c){
        double result = calculator.mult(a, b);
        Assertions.assertEquals(c, result);
    }
//    реализовать набор тестов для метода mult

    @ParameterizedTest
    @CsvSource({"1,1,2", "2,2,5", "5,5,10"})
    public void sum(double a, double b, double sumResult){
        double result = calculator.sum(a, b);
        Assertions.assertEquals(sumResult, result);
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,4", "12,144"})
    public void sq(double a, double result){
        Assertions.assertEquals(result, calculator.sq(a));
    }

    @Test
    public void error(){
        Assertions.assertThrows(RuntimeException.class,
                () -> {
                    calculator.error();
                });
    }

    @Test
    public void divPositive(){
        Assertions.assertEquals(
                6.0,
                calculator.div(12, 2)
        );
    }

    @Test
    public void divError(){
        Assertions.assertThrows(ArithmeticException.class, () ->{
            calculator.div(12, 0);
        });
    }
}


// добавить метод sq в класс Calculator,
// который получает в качестве аргумента число
// и возвращает квадрат этого числа

// добавить тесты для этого метода