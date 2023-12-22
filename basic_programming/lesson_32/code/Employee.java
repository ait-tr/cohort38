public class Employee {
    public String firstName;
    public String lastName;
    public double salary;
    public Employee[] subemployees;

    public Employee(String firstName, String lastName, double salary, Employee[] subemployees){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.subemployees = subemployees;
    }

    public Employee(String firstName, String lastName, double salary){
        this(firstName, lastName, salary, new Employee[0]);
    }
}

