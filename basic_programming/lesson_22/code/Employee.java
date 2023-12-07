package inheritance;

public class Employee {
    public String name;
    public double salary;
    public String department;

    public Employee(String name, double salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
//    name, department, salary: 0
    public Employee(String name, String department){
        this(name, 0, department);
    }

    public Employee(String name){
        this(name, "Unknown");
    }
}
