// Main 

package accessModifiers;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Анатолий", "Ушанов", 30, 3400, "worker");
        employee1.setSalary(5400);
        employee1.setType("manager");
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getType());
    }
}


// Employee

package accessModifiers;

// создать конструктор Employee который получает:
//first_name
//last_name
//age (int)
//salary (double)
//и присваивает значения свойствам
public class Employee {
    public String first_name;
    public String last_name;
    private String type;
    public int age;
    private double salary;

    public Employee(String first_name, String last_name, int age, double salary, String type){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
        this.type = type; // manager/worker/developer
    }

    public void bDay(){
        age++;
    }

    public void setSalary(double newSalary){
        if (newSalary >= 0){
            salary = newSalary;
        }else {
            System.out.println("Зарплата не может быть  отрицательной");
        }
    }

    public void setType(String type) {
        String[] validTypes = {"manager", "worker", "developer"};

        for (String validType : validTypes) {
            if (validType.equals(type)){
                this.type = type;
                return;
            }
        }
        System.out.println("Вы указали неправильный тип");
    }

    public String getType() { return type; }

    public double getSalary(){
        return salary;
    }

    // создать метод  setType который принимает в качестве аргумента тип сотрудника
//    если этот тип входит в множество (manager/worker/developer)
//    то мы меняем свойство, в ином случае не меняем.

}
