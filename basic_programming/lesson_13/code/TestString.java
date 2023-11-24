/*
Вывод периметра квадрата
*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите сторону квадрата: ");
        int value = scanner.nextInt();

        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                if (i == 0 || i == value - 1 || j == value - 1 || j == 0){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


/*
Вывод периметра треугольника
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите сторону треугольника: ");
        int value = scanner.nextInt();

        for (int i = 1; i < value; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 1 || i == value - 1 || j == 0 || j == i - 1){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }


/*
Таблица умножения
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите сторону треугольника: ");
        int value = scanner.nextInt();

        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            if (i != value){
                System.out.println("XXXXXXXXXXXXXXXX");
            }

        }


/*
Сумма максимальных чисел
*/

        int[][] array = {
                {3, -4, 1},
                {6, 3},
                {9, 3, 5, 4}
        };

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int maxValue = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]){
                    maxValue = array[i][j];
                }
            }
            sum += maxValue;
        }
        System.out.printf("Сумма максимальных значений: %d", sum);


/*
Максимальное число самого длинного массива
*/
        int[][] array = {
                {3, -4, 1},
                {6, 30},
                {9, 3, 5, 4},
                {1, 5}
        };

        // 1) найти самый длинный массив

        int indexOfLongestArray = 0; // индекс самого длинного массива
        for (int i = 0; i < array.length; i++) {
            if (array[indexOfLongestArray].length < array[i].length){
                indexOfLongestArray = i;
            }
        }

        // 2) В самом длинном массиве найти максимальное число

        int[] maxArray = array[indexOfLongestArray];

        int maxValue = maxArray[0];

        for (int i = 0; i < maxArray.length; i++) {
            if (maxValue < maxArray[i]){
                maxValue = maxArray[i];
            }
        }

        System.out.println(maxValue);




/*
написать процесс, который находит сумму чисел массива numbers
*/
        int[] numbers = {1, 4, 3, 6, 7, 4};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("=================");

        for (int number : numbers) {
            System.out.println(number);
        }


/*
написать процесс, который находит сумму чисел массива numbers
*/
        int[] numbers = {1, 4, 3, 6, 7, 4};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);


/*
цикл while
*/

        int[] numbers = {1, 4, 3, 6, 7, 4};
        
        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i]);
            i++; // НЕ ЗАБЫТЬ!!!
        }

/*
написать программу, которая получает числа через терминал и рассчитывает общую
сумму этих чисел

когда пользователь вводит 0 процесс остановить и вывести сумму.
*/
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Укажите число: ");
            int value = scanner.nextInt();
            if (value == 0){
                break;
            }
            sum += value;
        }
        System.out.printf("Сумма равна: %d", sum);


//        написать цикл while, который выводит цифры от 0 до 9
    
        int i = 0;
        
        while (i < 10){
            System.out.println(i);
            i++;
        }
        

//        написать цикл while, который выводит цифры от 9 до 0

        int i = 9;

        while (i >= 0){
            System.out.println(i);
            i--;
        }


//        написать цикл do-while

        int i = 12;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);



/*

написать цикл do-while который считывает числа через терминал и
находт их сумму. При вводе 0 оставновить процесс и вывести результат.

*/

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int value;
        do {
            System.out.print("Укажите число: ");
            value = scanner.nextInt();
            sum += value;
        } while (value != 0);

        System.out.println(sum);

/*
написать цикл, который находит сумму четных чисел
*/


        int[] array = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int number: array) {
            if (number % 2 == 0){
                sum += number;
            }
        }
        System.out.println(sum);



/*
найти сумму чисел используя только циклы forEach
*/

        int[][] array = {
                {1, 5, 3, 5},
                {2, 4, 1},
                {4, 6, 3, 5, 3, 1}
        };

        int sum = 0;
        for (int[] innerArray: array) {
            for (int number: innerArray) {
                sum += number;
            }
        }
        System.out.println(sum);




//    найти сумму чисел используя только циклы forEach

        int[][] array = {
                {1, 5, 3, 5},
                {2, 4, 1},
                {4, 6, 3, 5, 3, 1},
                {12, 5, 3, 2}
        };

        int sum = 0;

        for (int[] innerArray: array) {
            System.out.printf("Массив: %s%n", Arrays.toString(innerArray));
            for (int number: innerArray) {
                System.out.printf("Значение: %d%n", number);
            }
        }