/*
Поиск среднего значения в массиве:
*/

        int[] array = {5, 10, 15, 20};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.printf("Среднее значение: %.2f", sum / array.length);



/*
Поиск максимального элемента и его индекса в массиве:
*/
        int[] array = {-5, -10, -1, -20, -14};
        int maxValue = array[0];
        int maxValueIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue){
                maxValue = array[i];
                maxValueIndex = i;
            }
        }

        System.out.printf("Максимальное значение: %d с индексом %d", maxValue, maxValueIndex);

/*
написать программу, которая выводит разницу между максимальным и минимальным значением массива
 */


        int[] array = {5, 10, 1, 20, 14};
        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue){
                maxValue = array[i];
            } else if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.printf("Дельта: %d", maxValue - minValue);


/*
Преобразование всех отрицательных чисел массива в положительные:
*/
        int[] array = {5, 10, -1, 20, -14};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
//                array[i] = -array[i];
                array[i] *= -1;
            }
        }

        System.out.println(Arrays.toString(array));




/*
Поиск предмаксимального элемента и его индекса в массиве:
*/

        int[] array = {5, 7, 3, 10, 9, 12, 10};

        int maxValue = array[0]; 
        int preMaxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue){
                preMaxValue = maxValue;
                maxValue = array[i];
            } else if (array[i] < maxValue && array[i] > preMaxValue) {
                preMaxValue = array[i];
            }
        }
        System.out.printf("Предмаксимальное значение: %d", preMaxValue);


/*
написать программу, которая выводит разницу между максимальным и минимальным значением массива
 {5, 7, 3, 10, 9, 12, 10}
 maxValue = 5; preMaxValue = 5;
 1- maxValue = 5; preMaxValue = 5;
 2- maxValue = 7; preMaxValue = 5;
 3- maxValue = 7; preMaxValue = 5;
 4- maxValue = 10; preMaxValue = 7;
 5- maxValue = 10; preMaxValue = 9;
 6- maxValue = 12; preMaxValue = 10;
 7- maxValue = 12; preMaxValue = 10;
 */


/*
Сумма четных чисел массива
*/
        int[] array = {5, 7, 3, 10, 9, 12, 10};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.printf("Результат: %d", sum);

//        вывести 10 раз все цифры

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



//        написать программу, которая считывает от пользователя целое число
//        и выводит квадрат из звездочек с указанной стороной

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

//        написать программу, которая считывает от пользователя целое число
//        и выводит треугольник из звездочек с указанной стороной

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }



//        написать программу, которая считывает от пользователя целое число
//        и выводит перевернутый треугольник из звездочек с указанной стороной

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j % 2 != 0){
                    System.out.print("   ");
                }else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }

//напишите код, который выводит вертикальные полоски через одну



        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i % 2 != 0){
                    System.out.print("   ");
                }else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }


//напишите код, который создает многомерный массив и выводит значение 0 по индексам



        int[][] numbers = {
            {3, 2},
            {6, 12, 0, 32},
            {5, 34, 72},
            {3, 9, 18}
        };

        System.out.println(numbers[1][2]);

        numbers[1][2] = 62;

//        вывод значений из многомерного массива

        int[][] numbers = {
            {3, 2},
            {6, 12, 0, 32},
            {5, 34, 72},
            {3, 9, 18}
        };


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


//напишите код, находит сумму всех чисел массива numb


        int[][] numb = {
                {23, 4, 56, -4},
                {8, -21, 0},
                {56, 3, 22, 489 ,34},
                {9, 2}
        };

        int sum = 0;
        for (int i = 0; i < numb.length; i++) {
            for (int j = 0; j < numb[i].length; j++) {
                sum += numb[i][j];
            }
        }
        System.out.println(sum);