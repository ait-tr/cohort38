public class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.salary){
            return 1;
        } else if (this.salary < o.salary) {
            return -1;
        }else{
            return 0;
        }
    }
}
