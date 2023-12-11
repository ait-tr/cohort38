package inheritance_2;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String info(){
        return this.firstName + " " + this.lastName;
    }

    public void greeting(){
        System.out.printf("Здравствуйте, %s %s%n", this.firstName, this.lastName);
    }
    // написать метод Greeting который приветствует пользователя
    // выводя строку "Здравствуйте, <имя и фамилия>"
}
