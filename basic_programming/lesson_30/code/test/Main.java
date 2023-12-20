package test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(new int[]{12, 5, 3, 6, 8, 4, 2, 4});
        System.out.println(test.get(true));
        System.out.println(test.get(false));
    }
}
