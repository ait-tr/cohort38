package overload;

import java.util.Objects;

public class Calculation {

    public static int max(int value1, int value2){
        return value1 > value2 ? value1 : value2;
    }

    public static int max(int value1, int value2, int value3){
        int preResult = max(value1, value2);
        return max(preResult, value3);
    }

    public static int multiply(int a, int b){
        return a * b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }

    public static boolean compare(double a, double b){
        return a == b;
    }

    public static boolean compare(String a, String b){
        return a.equals(b);
    }

//    public static boolean compare(int[] a, int[] b){
//        if (a.length != b.length){
//            return false;
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != b[i]){
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean compare(int[] a, int[] b){
        if (a.length != b.length){
            return false;
        }
        int i = 0;

        while (i < a.length){
            if (a[i] != b[i]){
                return false;
            }
            i++;
        }
        return true;
    }

//  добавить еще один метод compare который получает в качестве
//    аргументов два массива из чисел и сравнивает их
//    в данном методе использовать метод equals нельзя


}
