/*
Сумма чисел от 0 до указанного числа с шагом 2:
*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите число: ");
        int num = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i += 2) {
            sum += i;
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.printf("Сумма чисел: %d", sum);


/*
Произведение чисел от 5 до 20 с шагом 5:
*/

        int result = 1;
        for (int i = 5; i <= 20; i += 5) {
            result *= i;
        }

//        System.out.println("Результат: " + result);
        System.out.printf("Результат %d", result);


/*
Вывод чисел от указанного числа до единицы в обратном порядке:
*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите число: ");
        int num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }

/*
Сумма чисел от 0 до указанного числа, кратных 3 или 5:
*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите число: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= num ; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }

//        System.out.println("Сумма чисел от 0 до " + num + ", кратных 3 или 5: " + sum + '!');
        System.out.printf("Сумма чисел от 0 до %d, кратных 3 или 5: %d!%n", num, sum);

/*
Сумма квадратов чисел от 1 до указанного числа:
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите число: ");
        int num = scanner.nextInt(); // 12

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i * i;
        }
        System.out.printf("Результат: %d", sum);



/*
разбор форматирования
*/


        int num = 12;
        System.out.printf("Значение: %d%n", num);

        double pi = 3.1415;
        System.out.printf("Pi: %f%n%n", pi);

        System.out.printf("Значение: %d%nPi: %f", num, pi);



//        создать массив из строк (4 любые строки)
//        вывести данный массив в терминал


        int[] array = {4, 7, 12, -4, 3};
        System.out.println(Arrays.toString(array));

/*
	объявление массива
	чтение, переопределение и изменение значения в массиве
*/

        int[] array = {4, 7, 12, -4, 3};
        System.out.println(Arrays.toString(array));

        System.out.println(array[2]); // чтение данных

        array[2] = -12; // переопределение ячейки массива
        System.out.println(Arrays.toString(array));

//        array[0] = array[0] * 2; // изменение значения массива
        array[0] *= 2; // изменение значения массива
        System.out.println(Arrays.toString(array));

/*
1) вывести значение -4 по индексу
2) вычесть из значения 7 значение 2
3) увеличить значение 3 в два раза
4) вывести итоговый массив
* */
        int[] array = {4, 7, 12, -4, 3};

        System.out.println(array[3]);
        array[1] -= 2;
        array[4] *= 2;
        System.out.println(Arrays.toString(array));

//        вывести все значения массива по одному в терминал

        int[] array = {4, 7, 12, -4, 3};


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


// вывести элементы массива array в обратном порядке

        int[] array = {4, 7, 12, -4, 3, 19};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

// вывести значения массива в обратном порядке

        int[] array = {4, 7, 12, -4, 3, 19};

        int sum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum += array[i];
        }
        System.out.printf("Результат: %d", sum);



// написать программу, которая считывает число от пользователя и определяет, есть ли это число в
// массиве

// если есть, вывести YES, в ином случае NO

        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите искомое число: ");
        int value = scanner.nextInt();

        int[] array = {4, 7, 12, -4, 3, 19};
        boolean inArray = false;

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                inArray = true;
            }
        }

        if (inArray){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


// написать программу, которая считывает число от пользователя и если это число встречается в массиве, то вывести
// индекс этого числа

// если данное число не встречается в массиве, то вывести -1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите искомое число: ");
        int value = scanner.nextInt();

        int[] array = {4, 7, 12, -4, 3, 19};
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                index = i;
            }
        }

        System.out.println(index);

// написать программу, которая считывает число от пользователя и если это число встречается в массиве, то вывести
// индекс этого числа

// если данное число не встречается в массиве, то вывести -1


        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите искомое число: ");
        int value = scanner.nextInt();

        int[] array = {4, 7, 12, -4, 3, 19};
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                index = i;
            }
        }

        System.out.println(index);

