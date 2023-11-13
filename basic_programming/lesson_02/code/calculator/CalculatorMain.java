package calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Actions actions = new Actions();

        double a = 5;
        double b = 7;

        actions.add();

        System.out.println(actions.add(a, b));
        System.out.println("");
        System.out.println(actions.minus(a, b));
        System.out.print(actions.multiple(a, b));
        System.out.print(actions.division(a, b));
    }
}
