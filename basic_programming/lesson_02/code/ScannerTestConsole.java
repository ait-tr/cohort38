import java.util.Scanner;

public class ScannerTestConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("start input");
//        int integerVar = scanner.nextInt();
//        long longVar = scanner.nextLong();
//        float realVar = scanner.nextFloat();
        double doubleVar = scanner.nextDouble();


        String string = scanner.next();

        System.out.println("_______________________________________");
        System.out.println("start output");
//        System.out.println(integerVar);
//        System.out.println(longVar);
//        System.out.println(realVar);
        System.out.println(doubleVar);
        System.out.println(string);
        System.out.println("_________________________________________");
    }
}
