package test;

public class Test {

    public static int pow(int base, int exp){
        if (exp == 1){
            return base;
        }
        System.out.println(base);
        return base * pow(base, exp - 1);
    }
}
/*
pow(2, 4) -> 16
return 2 * pow(2, 3) -> 16
    return 2 * pow(2, 2) -> 8
        return 2 * pow(2, 1) -> 4
            return 2
 */



