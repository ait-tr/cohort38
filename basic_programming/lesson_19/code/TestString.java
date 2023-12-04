// домашнее задание

public class User {
    public String name;
    private String password;
    private String message;
    public User(String name, String password, String message){
        this.name = name;
        this.password = password;
        this.message = message;
    }

    public String getPassword() {
        return getHiddenPassword();
    }

    private String getHiddenPassword(){
        String result = "*";
        for (int i = 0; i < this.password.length(); i++) {
            result += "*";
        }
        return result;
    }

    private boolean check(String login, String password){
        return this.name.equals(login) && this.password.equals(password);
    }

    public String getMessage(String login, String password){
        if (check(login, password)){
            return this.message;
        }else{
            return "permission denied";
        }
    }

    public void setPassword(String login, String password, String newPassword){
        if (check(login, password)){
            this.password = newPassword;
        }else{
            System.out.println("permission denied");;
        }
    }

    public void setName(String newName){
        if (newName.length() >= 4 && newName.length() <= 8){
            this.name = newName;
        }else{
            System.out.println("Вы указали неверный логин");
        }
    }

    public String getInfo(){
        return String.format("%s (%s)", this.name, getHiddenPassword());
    }
}

// статическое свойство count, которое хранит кол-во сотрудников

public class Employee {
    public static int count;
    public String name;
    public Employee (String name){
        this.name = name;
        Employee.count++;
    }
}


// используя статические свойства
// указать максимально дозволенную длинну
// имени и проверять ее при измениении
// имени.

public class Employee {
    public static int count;
    public static int maxNameLength = 8;
    public String name;

    public Employee (String name){
        this.name = name;
        Employee.count++;
    }

    public void setName(String newName){
        if (newName.length() <= Employee.maxNameLength){
            this.name = newName;
        }else{
            System.out.println("Вы указали слишком длинное имя");
        }
    }
}


// добавить статическое свойство minNameLength
// в котором указана минимальная длинна имени
// добавить эту проверку

public class Employee {
    public static int count;
    public static int maxNameLength = 8;
    public static int minNameLength = 3;
    public String name;
    public Employee (String name){
        this.name = name;
        Employee.count++;
    }

    public void setName(String newName){
        if (newName.length() >= Employee.minNameLength
            && newName.length() <= Employee.maxNameLength){
            this.name = newName;
        }else{
            System.out.println("Вы указали имя с неверной длинной");
        }
    }
}

//    создать метод checkNameLength
//    который получает новое имя и возвращает
//    true если длинна норм
//    false если длинна не норм

public class Employee {
    public static int count;
    public static int maxNameLength = 8;
    public static int minNameLength = 3;
    public String name;
    public Employee (String name){
        this.name = name;
        Employee.count++;
    }



    private boolean checkNameLength(String newName){
        return newName.length() >= Employee.minNameLength
            && newName.length() <= Employee.maxNameLength;
    }
    public void setName(String newName){
        if (checkNameLength(newName)){
            this.name = newName;
        }else{
            System.out.println("Вы указали имя с неверной длинной");
        }
    }
}

// класс Car

public class Car {
    public String model;
    public int speed;
    public Car(String model, int speed){
        this.model = model;
        this.speed = speed;
    }
}

// доработать проверку модели и проверять вхождение новой модели
// в данный массив

public class Car {
    public String model;
    public int speed;
    public static String[] validModels = {"BMW", "Mercedes", "Opel", "Volkswagen"};

    public Car(String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    public void setModel(String newModel){

        for (String model: Car.validModels){
            if (model.equals(newModel)){
                this.model = newModel;
                return;
            }
        }
        System.out.println("Что-то не так");
    }
}

