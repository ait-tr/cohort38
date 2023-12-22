import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ольша", "Петрова", 1200);
        Employee employee2 = new Employee("Анатолий", "Ушанов", 1500);
        Employee employee3 = new Employee("Мария", "Романова", 1300);

        Employee employee4 = new Employee("Максим", "Грибов", 2300, new Employee[]{employee3});
        Employee employee5 = new Employee("Петр", "Иванов", 5300,
                new Employee[]{employee1, employee2, employee4}
        );

        Recursion.printEmployees(employee5, "");
    }
}