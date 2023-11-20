/*
    Пользователь вводит логин и пароль. 
    Программа определяет, верны ли введенные учетные данные.
   Пример ввода и вывода:
   Ввод: "user", "password"
   Вывод: "Доступ разрешен"
*/
        String rightLogin = "login";
        String rightPwd = "password";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Login: ");
        String getLogin = scanner.nextLine();
        System.out.print("Password: ");
        String getPwd = scanner.nextLine();

        if (rightLogin.equals(getLogin) && rightPwd.equals(getPwd)){
            System.out.println("Доступ разрешен");
        }else {
            System.out.println("Доступ запрещен");
        }

/*
Написать программу, которая принимает день недели и выводит номер
 */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Day of the week: ");
        String day = scanner.nextLine();

        if (day.equals("Понедельник")){
            System.out.println(1);
        }else if (day.equals("Вторник")){
            System.out.println(2);
        }else if (day.equals("Среда")){
            System.out.println(3);
        }

/*
Написать программу, которая принимает день недели и выводит номер.
Написать через switch case
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Day of the week: ");
        String day = scanner.nextLine();

        switch (day){
            case "Понедельник":
                System.out.println(1);
                break;
            case "Вторник":
                System.out.println(2);
                break;
            case "Среда":
                System.out.println(3);
                break;
        }