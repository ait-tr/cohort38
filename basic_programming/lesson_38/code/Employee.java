abstract public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String info() {
        return firstName + " " + lastName;
    }
    abstract public double getSalary();
}


