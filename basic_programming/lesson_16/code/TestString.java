// Метод для определения четности числа:

    public static boolean isEven(int value){
        return value % 2 == 0;
    }



// Метод для поиска максимального значения в массиве:

	public static int findMax(int[] numbers){
	    int max = numbers[0];
	    for (int number: numbers) {
	        max = (number > max ) ? number : max;
	    }
	    return max;
	}


// два варианта метода circleArea, который находит площадь круга

public static double circleArea(double radius){
    return 3.14 * radius * radius;
}

public static double circleArea(double radius){
    return Math.PI * Math.pow(radius, 2);
}

// перевод из цельсия в фаренгейт

public static double celsiusToFahrenheit(double value){
    return value * 9 / 5 + 32;
}

// метод, который возводит число в степень

public static double pow(double base, double exponent){
    return Math.pow(base, exponent);
}


//    Метод для вычисления степени числа:
    public static double pow(double base, double exponent){
        return Math.pow(base, exponent);
    }


//    реализовать метод getHypotenuse который в качестве аргументов получает
//    катеты и возвращает гипотенузу
    public static double getHypotenuse(double cat1, double cat2){
        double catSum = pow(cat1, 2) + pow(cat2, 2);
        return pow(catSum, 0.5);
    }



// метод, который проверяет строку, является ли она палиндромом

    public static void main(String[] args) {
        String string = "level";
        String string1 = "leel";
        String string2 = "word";
        System.out.println(check(string));
        System.out.println(check(string1));
        System.out.println(check(string2));
    }
    public static boolean check(String string){
        for (int i = 0; i < string.length() / 2; i++) {
            int index_1 = i;
            int index_2 = string.length() - 1 - i;

            if (string.charAt(index_1) != string.charAt(index_2)){
                return false;
            }
        }
        return true;
    }



// класс Car

public class Car {
    public String model;

    public Car(String _model){ // конструктор
        model = _model;
    }

    public void drive(){
        System.out.println(model + " Vrum-vrum!!");
    }
}


// класс Main, который создает экземпляр класса Employee

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(
                "Анатолий",
                "Ушанов",
                2300
        );

        Employee employee2 = new Employee(
                "Максим",
                "Грибов",
                4300
        );

        employee1.info();
        employee2.info();
    }
}


// класс Employee

public class Employee {
    public String first_name;
    public String last_name;
    public double salary;

    public Employee(String first_name, String last_name, double salary){
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public void info(){
        System.out.printf(
                "Сотрудник: %s %s с зарплатой %f%n",
                first_name,
                last_name,
                salary
        );
    }
}

