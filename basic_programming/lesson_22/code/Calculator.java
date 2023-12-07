package inheritance;

public class Calculator {

    public static double power(double base, double exponent){
        return Math.pow(base, exponent);
    }

    public static double power(double base){
        return Math.pow(base, 2);
    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static double sum(double[] numbers){
        double total = 0;
        for (double elem : numbers){
            total += elem;
        }
        return total;
    }

    public static int sum(int number){
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sum(String string){
        int total = 0;
        for (int i = 0; i < string.length(); i++) {
            char elem = string.charAt(i);
            total += Character.getNumericValue(elem);
        }
        return total;
    }


//    создать еще один метод sum
//    который получает в качестве аргумента одно целое число
//    и возвращает сумму цифр

//    создать еще один метод sum
//    который получает в качестве аргумента строку из цифр
//    и возвращает сумму цифр (int)
//    решите эту задачу используя цикл по символам строки

    public static double sum(double[] array1, double[] array2){
        return sum(array1) + sum(array2);
    }
}
