
    /*
    Нахождение максимального элемента в массиве с использованием цикла `forEach`
    */
        int[] array = {5, 8, 2, 10, 3};
        int maxElem = array[0];

        for (int num : array) {
            if (num > maxElem){
                maxElem = num;
            }
        }

        System.out.println(maxElem);


    /*
    Проверка наличия числа в двумерном массиве с использованием цикла `forEach`
    */
        int[][] array = {
                {1, 4, 2, 6, 3},
                {6, 3, 5, 2},
                {12, 4, 23, 6, 4}
        };

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean inArray = false;

        for (int[] innerArray: array) {
            for (int value: innerArray) {
                    if (value == number){
                        inArray = true;
                    }
            }
        }

        if (inArray){
            System.out.println("Число найдено");
        }else {
            System.out.println("Число отсутствует");
        }

    /*
    Замена заданного элемента в массиве с использованием цикла `while`
    */
        int[] array = {1, 4, 2, 6, 3};
        int target = 6;
        int newValue = -6;

        int i = 0;

        while (i < array.length){
            if (array[i] == target){
                array[i] = newValue;
            }
            i++;
        }

        System.out.printf("Новый массив: %s", Arrays.toString(array));

    /*
    Нахождение максимального числа из введенных через терминал
    */

          Scanner scanner = new Scanner(System.in);
// вариант 1          
//        int maxValue = scanner.nextInt();
//
//        while (true){
//            int value = scanner.nextInt();
//            if (value == -1){
//                break;
//            }
//
//            if (value > maxValue){
//                maxValue = value;
//            }
//        }
//        System.out.printf("Результат: %d", maxValue);
       
// вариант 2
        int input;
        int maxValue = 0;
        do{
            System.out.print("Укажите число: ");
            input = scanner.nextInt();
            if (input != -1 && input > maxValue){
                maxValue = input;
            }

        }while (input != -1);
        System.out.printf("Результат: %d", maxValue);


    /*
    Нахождение суммы четных и нечетных чисел из введенных через терминал
    */
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;

        int input;

        do {
            System.out.print("Укажите число: ");
            input = scanner.nextInt();
            if (input != -1){
                if (input % 2 == 0){
                    sumEven += input;
                }else{
                    sumOdd += input;
                }
            }
        } while (input != -1);
        System.out.printf("Четные числа: %d%nНечетные числа: %d", sumEven, sumOdd);

//    описать метод, который выводит в терминал Hello World.

    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
    }

    public static void helloWorld(){
        System.out.println("Hello World");
    }


// Создать метод, который считывает через терминал имя пользователя и приветствует его




    public static void main(String[] args) {
        greeting();
    }

    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как вас зовут: ");
        String name = scanner.nextLine();
        System.out.printf("Добрый день, %s", name);
    }

//    доработать метод greeting таким образом, чтобы он получал в качестве аргумента
//    имя пользователя

//    параметр - то, что принимает метод
//    аргумент - конкретное значение, которые мы передаем в метод

    public static void main(String[] args) {
        greeting("Гайк");
        greeting("Анатолий");
    }


    public static void greeting(String username){
        System.out.printf("Добрый день, %s%n", username);
    }

// создать метод square который в качестве аргумента получает целое число
// и выводит квадрат этого числа в терминал

    public static void main(String[] args) {
        square(10);
        square(4);
        square(8);
    }

    public static void square(int value){
        int sq = value * value;
        System.out.printf("Результат: %d%n", sq);
    }

//    создать метод, который получает два числа и выводит в терминал сумму этих чисел

    public static void main(String[] args) {
        square(10);
        square(4);
        square(8);
        sum(12, 5);
        sum(13, 6);
    }



    public static void sum(int value1, int value2){
        int result = value1 + value2;
        System.out.printf("Результат: %d%n", result);
    }


//    создать метод maxFromArray который получает в качестве аргумента массив из чисел
//    и выводит в терминал максимальное число из массива


    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 12, 9};
        maxFromArray(numbers);
    }

    public static void maxFromArray(int[] array){
        int maxValue = array[0];

        for (int elem : array) {
            if (maxValue < elem){
                maxValue = elem;
            }
        }

        System.out.println(maxValue);
    }


//    есть два массива из чисел
//    вывести тот, у которого наибольшее максимальное значение.

    public static void main(String[] args) {
        int[] numbers1 = {1, 4, 7, 12, 9};
        int[] numbers2 = {4, 15, 8, 19, 3};
        int maxValue1 = maxFromArray(numbers1);
        int maxValue2 = maxFromArray(numbers2);

        if (maxValue1 > maxValue2){
            System.out.println(Arrays.toString(numbers1));
        }else{
            System.out.println(Arrays.toString(numbers2));
        }
    }

    public static int maxFromArray(int[] array){
        int maxValue = array[0];

        for (int elem : array) {
            if (maxValue < elem){
                maxValue = elem;
            }
        }

        return maxValue;
    }

// создать метод compare которая получает два аргумента
// и возвращает:
// 1 - если первый аргумент больше второго
// -1 - если второй аргумент больше первого
// 0 - если они равны

    public static void main(String[] args) {
        int compareResult1 = compare(12, 4);
        int compareResult2 = compare(12, 14);
        int compareResult3 = compare(22, 22);

        System.out.println(compareResult1);
        System.out.println(compareResult2);
        System.out.println(compareResult3);
    }

    public static int compare(int value1 , int value2){
        int result;
        if (value1 > value2){
            result = 1;
        } else if (value1 < value2) {
            result = -1;
        }else{
            result = 0;
        }
        return result;
    }


//    создать метод sum который получает два целых числа
//    и возвращает сумму этих чисел

    public static void main(String[] args) {
        int result = sum(12, 5);
        System.out.println(result);
    }

    public static int sum(int value1, int value2){
        return value1 + value2;
    }