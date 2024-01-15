import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

//        for (Integer number: numbers) {
//            handler(number);
//        }


//        numbers.stream()
//               .forEach(x -> System.out.println(Math.pow(x, 2)));

//        numbers.stream()
//               .filter(x -> x % 2 == 0)
//               .forEach(System.out::println);

//        numbers.stream()
//               .map(x -> Math.pow(x, 2))
//               .forEach(System.out::println);
//        int result = numbers.stream()
//                .reduce(0, (acc, elem) -> {
//                    System.out.printf("acc: %d elem: %d%n", acc, elem);
//                    return acc + elem;
//                });
//        System.out.println(result);
        task_2();
    }

    public static void task_3(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new PartTimeEmployee("John", "Doe", 15.0, 20.0));
        employees.add(new PartTimeEmployee("Jane", "Smith", 20.0, 15.0));
        employees.add(new FullTimeEmployee("Mike", "Johnson", 50000.0));
        employees.add(new FullTimeEmployee("Emily", "Brown", 60000.0));
        employees.add(new PartTimeEmployee("Alex", "Davis", 18.0, 25.0));

        double totalSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Общая зарплата всех сотрудников: " + totalSalary);
    }

    public static void task_2(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Анатолий", 31, 4.5));
        students.add(new Student("Антон", 25, 4.7));
        students.add(new Student("Степан", 35, 4.2));
        students.add(new Student("Ирина", 27, 3.6));
        students.add(new Student("Иван", 21, 2.8));
        students.add(new Student("Ольга", 45, 4.4));

//
//        students.stream()
//                .filter(x -> x.grade() < 4.5)
//                .forEach(System.out::println);
//
//
        Optional<Student> student = students.stream()
                .reduce((acc, elem) -> acc.grade() > elem.grade()? acc : elem);
//        System.out.println(student.get());

        // напишите процесс, который выводит данные о студентах, у которых
        // оценка ниже 4.5

//        Student result = students.get(0);
//        for (Student student: students) {
//            if (result.grade() < student.grade()){
//                result = student;
//            }
//        }
//
//        System.out.println(result);
    }
    public static void task_1(){
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("234567", "Анатолий"));
        contacts.add(new Contact("765433", "Степан"));
        contacts.add(new Contact("745627", "Игорь"));
        contacts.add(new Contact("874643", "Ольга"));
        contacts.add(new Contact("624576", "Елена"));

        for (Contact contact: contacts) {
            System.out.println(contact.info());
        }
    }
}