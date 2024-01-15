public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary - (salary * 0.1); // Удерживаем 10% налога
    }
}
