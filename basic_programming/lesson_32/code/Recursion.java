import java.util.Arrays;

public class Recursion {

    public static int calculateSum(int n){
        if (n == 0){
            return n;
        }
        return n + calculateSum(n - 1);
    }

    public static int multiply(int a, int b){
        if (a == 1){
            return b;
        }
        return b + multiply(a - 1, b);
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return  n * factorial(n - 1);
    }

    public static void print_0_n(int n){
        if (n >= 1){
            print_0_n(n - 1);
            System.out.println(n);
        }
    }

    public static void print_n_0(int n) {
        if (n != 0) {
            System.out.println(n);
            print_n_0(n - 1);
        }
    }

    public static void printArray(Object[] array, String prefix){
        for (int i = 0; i < array.length; i++) {
            String newPrefix = String.format("%s-> %d ", prefix, i);

            if (array[i] instanceof Object[]){
                printArray((Object[]) array[i], newPrefix);
            }else{
                System.out.printf("[%s] %d %n", newPrefix, (int) array[i]);
            }
        }
    }

    public static void printEmployees(Employee employee, String prefix){
        String newPrefix = String.format(
                "%s -> %s %s",
                prefix,
                employee.firstName,
                employee.lastName
        );
        System.out.println(newPrefix);
        for (Employee sub: employee.subemployees) {
            printEmployees(sub, newPrefix);
        }
    }
}
