/**
 * author: azart
 * date: 13-th of Nov 112023
 * company: AIT
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //        boolean b = true;
//
//        double i = 10.123;
//        double x = 10.12;

        //однострочный комментарий
        /*
         * многострочный комментарий
         *
         * author azart
         * Company AIT
         * Mon 13 Nov 2023
         *
         */
        //----------------------------------------------------------------------------------------------------
        //операторы сравнения
        int i = 10;
        int a;
        a = 12;
        int x, y, v;
        x = 11;
        y = 13;
        v = 14;

        System.out.println(i == a);
        System.out.println(i != a);
        System.out.println(i < a);
        System.out.println(i > a);
        System.out.println(i <= a);
        System.out.println(i >= a);

        //----------------------------------------------------------------------------------------------------

        Animal an1 = new Animal("Jack", 10);
        Animal an2 = new Animal("Jack", 10);
        Animal an3 = new Animal("Murka", 3);

        System.out.println(an1 == an2);
        System.out.println(an1 == an3);


        //----------------------------------------------------------------------------------------------------
        //примеры применения boolean выражений
        Scanner scanner = new Scanner(System.in);

//        boolean marriedStatus = scanner.nextBoolean();
        String marriedStatus = scanner.next();

        if ("married".equals(marriedStatus)) {
            System.out.println("He is married");
        } else {
            System.out.println("He is single");
        }

// 2 + 2 = ?
//4; boolean flag = true;
//3; boolean flag = false;
//        while (i < x) {
//            System.out.println("x value: x[" + x + "];");
//        }
//----------------------------------------------------------------------------------------------------
    }
}
