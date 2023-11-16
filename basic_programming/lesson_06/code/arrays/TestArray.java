package arrays;

import java.util.Scanner;

public class TestArray {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 5;
//        int c = 6;
//        int d = 7;
//
////        System.out.println(a);
////        System.out.println(b);
////        System.out.println(c);
////        System.out.println(d);
//
//
//        int[] arr1 = new int[5];
//
//        arr1[0] = 9;
//        arr1[1] = 10;
//        arr1[2] = 11;
//
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);
//        System.out.println(arr1[3]);
//        System.out.println(arr1[4]);
//
////        Scanner scanner = new Scanner(System.in);
//
////        arr1[0] = scanner.nextInt();
////        arr1[1] = scanner.nextInt();
////        arr1[2] = scanner.nextInt();
////        arr1[3] = scanner.nextInt();
////        arr1[4] = scanner.nextInt();
////
////        arr1[0] = (char) 56;
////        arr1[1] = 'A';
////        arr1[2] = '4';
////        arr1[3] = '/';
////        arr1[4] = ':';
//
////        System.out.println("-------------------------------");
////        System.out.println(arr1[0]);
////        arr1[0] = 23;
////        System.out.println("-------------------------------");
////        System.out.println(arr1[0]);
////        System.out.println(arr1[1]);
////        System.out.println(arr1[2]);
////        System.out.println(arr1[3]);
////        System.out.println(arr1[4]);
//
//
////        System.out.println("-------------------------------");
////        System.out.println(arr1.length);
//    }


    //public static void main(String[] args) {
//    int[] array1;
//
//    Scanner scanner = new Scanner(System.in);
//    int razmer = scanner.nextInt();
//
//    array1 = new int[razmer];
//
//    System.out.println(array1[0]);
//    System.out.println(array1[1]);
//    System.out.println(array1[2]);
//    System.out.println(array1[3]);
//    System.out.println(array1[4]);
//
//
//}
    public static void main(String[] args) {

//        int[] array1 = {12, 45, 11, 1, 9};

//        System.out.println(array1[2]);


        Scanner scanner = new Scanner(System.in);
        char a, b, c, d, e, f, g, h, k, l;
        a = scanner.nextLine().charAt(0);
        b = scanner.nextLine().charAt(0);
        c = scanner.nextLine().charAt(0);
        d = scanner.nextLine().charAt(0);
        e = scanner.nextLine().charAt(0);
        f = scanner.nextLine().charAt(0);
        g = scanner.nextLine().charAt(0);
        h = scanner.nextLine().charAt(0);
        k = scanner.nextLine().charAt(0);
        l = scanner.nextLine().charAt(0);

        char[] arr1 = {a, b, c, d, e, f, g, h, k, l};
        int leng = arr1.length;

        System.out.print(arr1[0]);
        System.out.print(arr1[1]);
        System.out.print(arr1[2]);
        System.out.print(arr1[3]);
        System.out.print(arr1[4]);
        System.out.print(arr1[5]);
        System.out.print(arr1[6]);
        System.out.print(arr1[7]);
        System.out.print(arr1[8]);
        System.out.print(arr1[9]);
    }
}
