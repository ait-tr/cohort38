import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    // добавить в класс     Student переопределенный метод toString
    // который выводит данные пользователя в формате "Анатолий (возраст: 31, средняя оценка: 4.50)"

    // сделать плое avgGrade приватным и создать getter и setter

    // getter возвращает оценку в виде строки 4.5/5
    // setter проверяет, что полученное значение больше 0 и не больше 5
    Student student = new Student("Анатолий", 31, new int[]{1, 2, 3, 4, 5, 6, 7});
    student.addGrade(-1, 3);
    for (int elem: student.grades) {
        System.out.println(elem);
    }

    }
    private static void task_1(){
        //        написать цикл, который выводит числа от 10 до -10

        for (int i = 10; i >= -10; i--) {
            if (i % 2 == 0 && i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
        // доработать даннцы цикл тамим образом, чтобы выводились только те числа
        // которые не делятся на 3 и на 2 одновременно
    }
    private static void task_2(){
        int[] array = {1, 5, -3, 7, -3, -5};
        double sum = 0;
        int count = 0;
        for (int elem : array) {
            if (elem > 0){
                sum += elem;
                count++;
            }
        }
        System.out.println(sum / count);
        // написать цикл, который считает и выводит сумму чисел массива

        // написать цикл, который считает среднеарифметическое значение
        // среди положительных чисел

        // написать цикл, который преобразовывает все отрицательные числа
        // в положительные (-5 -> 5)
    }

    private static void task_3(){
        int[] array = {1, 5, -3, 7, -3, -5};

        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] > 0 ? array[i] : -array[i];
            if (array[i] < 0){
                array[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(array));
        // написать цикл, который преобразовывает все отрицательные числа
        // в положительные (-5 -> 5)
    }
}