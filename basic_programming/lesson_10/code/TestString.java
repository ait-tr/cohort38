
/*
Условие: Пользователь вводит сумму покупки.
Программа определяет размер скидки в зависимости от суммы:
5% скидка для суммы от 1000 до 5000, 10% для суммы от 5000.

Пример ввода и вывода:
Ввод: 3500
Вывод: "Сумма со скидкой: 3325 руб."
 */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите сумму покупки: ");
        double amount = scanner.nextDouble();

        double discount = 0;

        if (amount >= 1000 && amount < 5000){
            discount = 0.05;
        }else if (amount >= 5000){
            discount = 0.1;
        }

        double discountedAmount = amount - amount * discount;

        System.out.println("Сумма со скидкой: " + discountedAmount);


/*
Условие: Пользователь вводит возраст и время сеанса.
Программа определяет стоимость билета: 200 рублей для взрослых, 150 рублей для детей до 12 лет,
250 рублей после 18.

Пример ввода и вывода:
Ввод: 14, 20
Вывод: "Стоимость билета: 250 руб."
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите возраст: ");
        int age = scanner.nextInt();

        System.out.print("Укажите время сеанса: ");
        int time = scanner.nextInt();
        int ticketPrice;

        if (time > 18){
            ticketPrice = 250;
        }else if (age < 12){
            ticketPrice = 150;
        }else{
            ticketPrice = 200;
        }

        System.out.println(ticketPrice);


/*
Условие: пользователь вводит число, которое соответствует кол-ву минут,
которое прошло с начала суток.
Определите, какое число будет на электронных часах в разделе минут.

Пример ввода и вывода:
Ввод: 150
Вывод: 30
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите минуты: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(hours + ":" + remainingMinutes);


/*
Условие: Напишите программу для простого калькулятора.
Программа должна принимать два числа и оператор (сложение, вычитание, умножение, деление) от пользователя,
затем выполнять соответствующую операцию и выводить результат.

Пример ввода и вывода:
Ввод: 15, 5, '-'
Вывод: 10
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите значение: ");
        double num1 = scanner.nextDouble();

        System.out.print("Укажите значение: ");
        double num2 = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Укажите оператор (+, -, *, /): ");
        String sign = scanner.nextLine();

        double result = 0;

        switch (sign){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("Вы пытаетесь поделить на 0");
                    return;
                }
                break;
        }
        System.out.println("Результат: " + result);


/*
Условие: Пользователь вводит длины трех сторон треугольника.
Программа определяет, является ли треугольник равносторонним,
равнобедренным или обычным.

Если введенные пользователем данные не стороны треугольника вывести об этом сообщение.
Напомню, что сумма двух любых сторон треугальника всегда больше третьей.

Пример ввода и вывода:
Ввод: 3, 4, 5
Вывод: "Треугольник обычный."
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите сторону: ");
        double side1 = scanner.nextDouble();

        System.out.print("Укажите сторону: ");
        double side2 = scanner.nextDouble();

        System.out.print("Укажите сторону: ");
        double side3 = scanner.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            if (side1 == side2 && side2 == side3){
                System.out.println("Треугольник равносторонний");
            }else if (side1 == side2 || side2 == side3 || side1 == side3){
                System.out.println("Треугольник равнобедренный");
            }else {
                System.out.println("Треугольник обычный");
            }
        }else{
            System.out.println("Указаны неверные стороны.");
        }



/*
Вывести цифры от 0 до 9
*/


        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

/*
написать программу, которая запрашивает у пользователя число
и выводит числа от 0 до указанного числа
ввод: 5
вывод:
0
1
2
3
4
5
 */


        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        
        for (int i = 0; i <= end; i++){
            System.out.println(i);
        }
/*
написать программу, которая запрашивает у пользователя два числа:
start - с какого числа выводить значения
end - до какого числа выводить значения

и вывести числа от start до end (включая эти числа)

ввод: 5, 10
вывод:
5
6
7
8
9
10
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите start: ");
        int start = scanner.nextInt();
        
        System.out.print("Укажите end: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++){
            System.out.println(i);
        }


/*
написать программу, которая запрашивает у пользователя три числа:
start - с какого числа выводить значения
end - до какого числа выводить значения
step - шаг при выводе данных

и вывести числа от start до end (включая эти числа)

ввод: 5, 15, 3
вывод:
5
8
11
14
 */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите start: ");
        int start = scanner.nextInt();

        System.out.print("Укажите end: ");
        int end = scanner.nextInt();

        System.out.print("Укажите step: ");
        int step = scanner.nextInt();

        for (int i = start; i <= end; i += step){
            System.out.println(i);
        }


/*
написать программу, которая получает число и выводит таблицу умнажения на это число

- Пример ввода: 3
- Пример вывода:

 3 * 1 = 3
 3 * 2 = 6
 ...
 3 * 10 = 30
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите значение: ");
        int value = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(value + " * " + i + " = " + value * i);
        }

/*
написать программу, которая получает число и выводит значение факториала

- Пример ввода: 4
- Пример вывода: 24
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите значение: ");
        int value = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= value; i++){
//            factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("factorial: " + factorial);


/*
написать программу, которая получает число и выводит значение факториала

- Пример ввода: 4
- Пример вывода: 24
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите значение: ");
        int value = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= value; i++){
//            factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("factorial: " + factorial);
