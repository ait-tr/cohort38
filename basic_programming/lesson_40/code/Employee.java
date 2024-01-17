public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    public Position position;
    public DayOfWeek dayOff;

    public Employee(String firstName, String lastName, double salary, Position position, DayOfWeek dayOff) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
        this.dayOff = dayOff;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                ", day off=" + dayOff +
                '}';
    }
}
