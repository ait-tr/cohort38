package static_overload;

public class Calculation {
    public static double add(double val1, double val2){
        return val1 + val2;
    }

    public static double sub(double val1, double val2){
        return val1 - val2;
    }

    public static double mult(double val1, double val2){
        return val1 * val2;
    }

    public static double div(double val1, double val2){
        return val2 == 0 ? Double.NaN : (val1 / val2);

    }
}

// добавить методы
//sub - вычитание
//mult - умножение
//div - деление (если второй аргумент отрицательный, вывести -1)
