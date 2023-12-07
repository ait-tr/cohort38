package inheritance;


import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Анатолий",
                "Ушанов",
                1300);
        System.out.println(customer.info());
    }
}
