//        Сумма целых чисел в заданном диапазоне

    public static void main(String[] args) {
        sumInRange(2, 5);
    }
    
    public static void sumInRange(int val1, int val2) {
        int start;
        int end;
        int result = 0;
        if (val1 > val2){
            start = val2;
            end = val1;
        }else {
            start = val1;
            end = val2;
        }

        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.printf("Результат %d%n", result);

    }


//        Сумма целых чисел в заданном диапазоне

    public static void main(String[] args) {
        sumInRange(2, 5);
    }

    public static void sumInRange(int val1, int val2) {
        int start = (val1 > val2)? val2: val1;
        int end = (val1 > val2)? val1: val2;
        int result = 0;

        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.printf("Результат %d%n", result);
    }


//        Среднее значение элементов в массиве:

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 7, 5, 3};
        avgRange(array);
    }


    public static void avgRange(int[] numbers) {
        double sum = 0 ;
        for (int number : numbers){
            sum += number;
        }

        double avgValue = sum / numbers.length;
        System.out.printf("Результат: %.2f%n", avgValue);
    }


//        Индекс заданного элемента в массиве:

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 7, 5, 3};
        findIndex(array, 7);
        findIndex(array, -12);
    }

    public static void findIndex(int[] array, int target) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                index = i;
            }
        }

        if (index == -1){
            System.out.println("Значение в массиве не найдено");
        }else{
            System.out.printf("Значение находится под индексом %d%n", index);
        }
    }

// написать код, который проверяет, у какого числа индекс больше (1, 3)

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 7, 5, 3};
        int indexOf_1 =  findIndex(array, 1); // 2
        int indexOf_3 =  findIndex(array, 3); // 5

        if (indexOf_1 > indexOf_3){
            System.out.println(1);
        }else {
            System.out.println(3);
        }

    }
    

    public static int findIndex(int[] array, int target) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                index = i;
            }
        }

        return index;
    }


// Проверка, является ли число четным:

    public static void main(String[] args) {
        check(13);
        check(12);

    }

    public static void check(int number) {
        if (number % 2 == 0){
            System.out.println("четное");
        }else{
            System.out.println("нечетное");
        }
    }

// Проверка, является ли число четным:
//доработать метод check таким образом, чтобы он возвращал true, если четное и
//false если нечетное

    public static void main(String[] args) {
        boolean result1 = check(13);
        boolean result2 = check(12);
        System.out.println(result1);
        System.out.println(result2);

    }
    
    public static boolean check(int number) {
        return number % 2 == 0;
    }


//    Подсчет количества цифр в числе:

    public static void main(String[] args) {
        int number = 234565432;
        digitsCount(number);
        digitsCount1(number);
    }

    public static void digitsCount(int number) {
        int count = 0;
        while (number != 0 ){
            number /= 10;
            count++;
        }
        System.out.printf("Результат: %d%n", count);
    }

    public static void digitsCount1(int number) {
        String string = String.valueOf(number);
        int length = string.length();
        System.out.printf("Результат: %d%n", length);
    }


//    Подсчет количества цифр в числе:
// доработать метод digitsCount таким образом, чтобы он возвращал длину числа
// (кол-во цифр)

    public static void main(String[] args) {
        int number = 234565432;
        int count = digitsCount(number);
        
        System.out.println(count);
    }

    public static int digitsCount(int number) {
        int count = 0;
        while (number != 0 ){
            number /= 10;
            count++;
        }
        return count;
    }

//   Сумма цифр в числе:

    public static void main(String[] args) {
        int number = 234565432;
        int count = digitsSum(number);

        System.out.println(count);
    }

    public static int digitsSum(int number) {
        int sum = 0;
        while (number != 0 ){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


//        если val_1 отрицательный, преобразовать его в положительный (-5 -> 5)

    public static void main(String[] args) {
        int result = mult(-12, 5);
        System.out.printf("Результат: %d%n", result);
    }

    public static int mult(int val_1, int val_2){
        val_1 = (val_1 < 0) ? -val_1 : val_1;
        val_2 = (val_2 < 0) ? -val_2 : val_2;

        return val_1 * val_2;
    }


// написать процесс, который находит сумму четных чисел

    public static void main(String[] args) {
        int result = sumEvenNumbers(1, 10);
        System.out.println(result);
    }

    public static int sumEvenNumbers(int value_1, int value_2){

        int start = (value_1 > value_2) ? value_2 : value_1;
        int end = (value_1 > value_2) ? value_1 : value_2;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += (i % 2 == 0) ? i : 0;
        }
        return sum;
    }


//
//    Напишите метод для подсчета количества вхождений
//    элемента в массиве, равного заданному значению.
//  метод должен вывести результат в терминал


    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 3, 1, 6};
        countValue(array, 1);
    }

    public static void countValue(int[] numbers, int target){
        int count = 0;
        for (int number : numbers) {
            if (number == target){
                count++;
            }
        }
        System.out.printf("Результат: %d%n", count);
    }


//
//    Напишите метод для подсчета количества вхождений
//    элемента в массиве, равного заданному значению.
//  метод должен вывести результат в терминал
// если в качестве искомого числа введено отрицательное выведите сообщение об этом.


    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 3, 1, 6};
        countValue(array, 1);
        countValue(array, -1);
    }

    public static void countValue(int[] numbers, int target){
        if (target < 0){
            System.out.println("Вы указали отрицательное число.");
            return; // досрочный выход из метода
        }
        int count = 0;
        for (int number : numbers) {
            if (number == target){
                count++;
            }
        }
        System.out.printf("Результат: %d%n", count);
    }

//    Напишите метод для удвоения каждого элемента в массиве целых чисел.
//    метод преобразовывает массив и возвращает его

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 3, 1, 6};
        int[] result = sqArray(array);
        System.out.println(Arrays.toString(result));

    }

    public static int[] sqArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

