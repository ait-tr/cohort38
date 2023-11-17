// Пользователь вводит целое число. Программа определяет, является ли число четным.
   
     Scanner scanner = new Scanner(System.in);
     System.out.print("Введите целое число: ");
     int number = scanner.nextInt();

     if (number % 2 == 0) {
         System.out.println("Число " + number + " четное.");
     } else {
         System.out.println("Число " + number + " нечетное.");
     }


// написать программу, считывает возраст и имя пользователя и выводит

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Set name: ");
        int name = scanner.nextLine();
        System.out.print("Set age: ");
        int age = scanner.nextInt();

		System.out.println(name);
		System.out.println(age);


// написать программу, которая определяет, является ли пользователь совершеннолетним

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set age: ");
        int age = scanner.nextInt();


		if (age < 18){
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}




// написать программу, которая определяет возрастной диапазон пользователя

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set age: ");
        int number1 = scanner.nextInt();

        if (age >= 0 && age <= 140 ){
			if (age <= 6){
				System.out.println("малыш");
			}else if (age <= 12){
				System.out.println("ребенок");
			}else if (age <= 18){
				System.out.println("подросток");
			}else {
				System.out.println("взрослый");
			}

        }else{
			System.out.println("Ошибка ввода.");
        }


//		написать программу, которая получает два числа и выводит наибольшее

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set number: ");
        int number1 = scanner.nextInt();
        System.out.print("Set number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println(number1);
        }else{
            System.out.println(number2);
        }

//        написать программу, которая считывает стороны треугольника (целые числа)
//        если треугольник равносторонний, то вывести "YES" в ином случае "NO"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set value: ");
        int value1 = scanner.nextInt();
        System.out.print("Set value: ");
        int value2 = scanner.nextInt();
        System.out.print("Set value: ");
        int value3 = scanner.nextInt();

        if (value1 == value2 && value2 == value3){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


//        написать программу, которая считывает стороны треугольника (целые числа)
//        если треугольник равносторонний, то вывести "равносторонний"
//        если равнобедренный, то вывести "равнобедренный"
//        в ином случае "обычный"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set value: ");
        int value1 = scanner.nextInt();
        System.out.print("Set value: ");
        int value2 = scanner.nextInt();
        System.out.print("Set value: ");
        int value3 = scanner.nextInt();

        if (value1 == value2 && value2 == value3){
            System.out.println("равносторонний");
        }else if (value1 == value2 || value1 == value3 || value2 == value3){
            System.out.println("равнобедренный");
        }else{
            System.out.println("обычный");
        }
