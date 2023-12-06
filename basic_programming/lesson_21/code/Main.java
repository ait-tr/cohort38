package overload;

public class Main {
    public static void main(String[] args) {
        User user2 = new User("Анатолий", 34);

        user2.setName("Максим");

        System.out.println(user2.getName());
        System.out.println(user2.age);

        user2.setName();

        System.out.println(user2.getName());
        System.out.println(user2.age);
    }
}



