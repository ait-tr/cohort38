public class Main {
    public static void main(String[] args) {
//      у нас есть значение возраста пользователя
//        в зависимости от возраста вывести
//        возрастную категорию
//        0-6 младенец
//        7-12 ребенок
//        13-17 подросток
//        18- взрослый

        int age = 13;

        if (age > 0 && age < 140){
            if (age <= 6){
                System.out.println("младенец");
            }else if (age <= 12){
                System.out.println("ребенок");
            }else if (age <= 17){
                System.out.println("подросток");
            }else{
                System.out.println("взрослый");
            }
        }else{
            System.out.println("возраст введен неверно");
        }
    }
}


public class Main {
    public static void main(String[] args) {

// написать программу в которой объявлена переменная
// хранящая кол-во часов (текущее время)
// в зависимости от времени необходимо вывести
// соответствующую строку
//0 - 10 - утро
//11 - 17 - день
//18 - 20 - вечер
//21 - 23 - ночь


        int hour = 12;
        if (hour >= 0 && hour <= 23){
            if (hour <= 10){
                System.out.println("утро");
            }else if(hour <= 17){
                System.out.println("день");
            }else if(hour <= 20){
                System.out.println("вечер");
            }else{
                System.out.println("Ночь");
            }
        }else{
            System.out.println("Неверно указаны часы");
        }
    }
}

// написать программу в которой объявлена переменная
// хранящая кол-во часов (текущее время)
// в зависимости от времени необходимо вывести
// соответствующую строку
//4 - 10 - утро
//11 - 17 - день
//18 - 20 - вечер
//21 - 3 - ночь

public class Main {
    public static void main(String[] args) {

        int hour = 19;

            if (hour <= 3 || hour >= 21){
                System.out.println("Ночь");
            } else if (hour >= 17) {
                System.out.println("вечер");
            }else if (hour >= 10) {
                System.out.println("день");
            }else{
                System.out.println("утро");
            }
        }else{
            System.out.println("Неверно указаны часы");
        }
    }
}


// написать программу, которая считывает число через терминал
//        и выводит в терминал "Yes" если оно четное и
//        "No" если нечетное

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите число: ");
        int value = scanner.nextInt();

        if (value % 2 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}


// создание массива        
int num = 12;
int[] array = {1, 4, 3, 5};
String[] array1 = {"String1", "String2", "String3"};
boolean[] array3 = {true, true, false, false};

// читать значение по индексу
System.out.println(array[1]); // 4

// переопределять значение 
array[1] = -4; 

// определить длинну массива 
System.out.println(array1.length);


//        написать цикл, который выводит все числа в терминал

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

//        написать цикл, который изменяет все отрицательные числа
//        на положительные

//        после работы цикла вывести измененный цикл в терминал
//        результат: {1, 4, 3, 5, 7}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, -4, 3, -5, 7};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                array[i] = -array[i];
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

//
//1) отсутствие скобок
//    - переменные
//    - свойства
//2) круглые скобки
//    - метод
//    - if/for/while/do-while ...
//3) квадратные скобки
//    - обращение к элементу массива по индексу
//4) фигурные скобки
//    - указание значений у массива
//    - if/for/while/do-while ...



// написать цикл который возводит в квадрат все
// четные числа и полученное значение
// присваивает обратно в ячейку массива

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 5, 6};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] = array[i] * array[i];
            }
        }

        System.out.println(Arrays.toString(array));

        // результат {1, 16, 3, 5, 36};

    }
}




public class Student {
    public String name;
    public double grade;

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    /*
    1) определить, что метод возвращает
    2) определить набор параметров и их типы
    3) описать сам метод
     */

    // создать метод, который возвращает
    // строку с описанием студента

    public String info(){
        String result = String.format(
                "Имя: %s Оценка: %.2f%n",
                this.name,
                this.grade
        );
        return result;
    }

}

//    добавить метод changeGrade,
//    который получает в качестве аргумента новую оценку
//    и меняет текущую оценку студента на новую
//    в метод changeGrade добавить проверку
//    если новая больше или равна 0
//    и меньше либо равна 5 то присвоить свойству grade
//    в ином случае вывести в терминал сообщение
//    "Вы ввели неверную оценку "

public class Student {
    public String name;
    public double grade;

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public void changeGrade(double newGrade){
        if (newGrade >= 0 && newGrade <= 5){
            this.grade = newGrade;
        }else{
            System.out.println("Вы ввели неверную оценку ");
        }

    }

    public String info(){
        String result = String.format(
                "Имя: %s Оценка: %.2f%n",
                this.name,
                this.grade
        );
        return result;
    }
}