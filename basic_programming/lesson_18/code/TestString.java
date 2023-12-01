
// создать класс Circle

public class Circle {
    private double radius = -1;
    public Circle(double radius){
        setRadius(radius);
    }
    public double getRadius(){ return radius; }
    public void setRadius(double newRadius){
        if (newRadius >= 0){
            this.radius = newRadius;
        } else{
            System.out.println("Радиус не может быть отрицательным.");
        }
    }
}


// создать класс Car

public class Car {
    private String brand;
    private String model;
    private int currentSpeed;

    public Car(String brand, String model, int currentSpeed){
        this.brand = brand;
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getCurrentSpeed() { return currentSpeed; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setCurrentSpeed(int currentSpeed) { this.currentSpeed = currentSpeed; }
}

// добавить проверку при создании автомобиля на указание свойства model
// значение должно быть в наборе BMW, jeep, Mersedes

public class Car {
    private String brand;
    private String model;
    private int currentSpeed;

    public Car(String brand, String model, int currentSpeed){
        this.brand = brand;
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getCurrentSpeed() { return currentSpeed; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String newModel) {
        String[] models = {"BMW", "jeep", "Mersedes"};
        for (String model: models) {
            if (model.equals(newModel)){
                this.model = newModel;
                return;
            }
        }
        System.out.println("Вы указали неверную модель.");
    }
    public void setCurrentSpeed(int currentSpeed) { this.currentSpeed = currentSpeed; }
}

// добавить проверку при создании автомобиля на указание свойства currentSpeed
// значение должно быть от 0 до 120
// в ином случае в currentSpeed ничего не указывается

public class Car {
    private String brand;
    private String model;
    private int currentSpeed;

    public Car(String brand, String model, int currentSpeed){
        this.brand = brand;
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getCurrentSpeed() { return currentSpeed; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String newModel) {
        String[] models = {"BMW", "jeep", "Mersedes"};
        for (String model: models) {
            if (model.equals(newModel)){
                this.model = newModel;
                return;
            }
        }
        System.out.println("Вы указали неверную модель.");
    }
    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed <= 120){
            this.currentSpeed = currentSpeed;
        }else{
            System.out.println("Вы указали неверную скорость");
        }
    }
}

// метод getModel должен возвращать строку в формате "Model: <название модели>"

public class Car {
    private String brand;
    private String model;
    private int currentSpeed;

    public Car(String brand, String model, int currentSpeed){
        this.brand = brand;
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() { return brand; }
    public String getModel() {
        return "Model: " + model;
//        return String.format("Model: %s", model);
    }

    public int getCurrentSpeed() { return currentSpeed; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String newModel) {
        String[] models = {"BMW", "jeep", "Mersedes"};
        for (String model: models) {
            if (model.equals(newModel)){
                this.model = newModel;
                return;
            }
        }
        System.out.println("Вы указали неверную модель.");
    }
    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed <= 120){
            this.currentSpeed = currentSpeed;
        }else{
            System.out.println("Вы указали неверную скорость");
        }
    }
}


//    реализовать getter который выводит соответствующий тип машины в зависимости от скорости
//    0 - 40 - медлено
//    41 - 80 - быстро
//    81 - 120 - очень быстро

public class Car {
    private String brand;
    private String model;
    private int currentSpeed;

    public Car(String brand, String model, int currentSpeed){
        this.brand = brand;
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() { return brand; }
    public String getModel() {
        return "Model: " + model;
//        return String.format("Model: %s", model);
    }

    public String getCurrentSpeed() {
        if (currentSpeed <= 40){
            return "медленно";
        } else if (currentSpeed <= 80) {
            return "быстро";
        }else {
            return "очень быстро";
        }
    }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String newModel) {
        String[] models = {"BMW", "jeep", "Mersedes"};
        for (String model: models) {
            if (model.equals(newModel)){
                this.model = newModel;
                return;
            }
        }
        System.out.println("Вы указали неверную модель.");
    }
    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed <= 120){
            this.currentSpeed = currentSpeed;
        }else{
            System.out.println("Вы указали неверную скорость");
        }
    }
}

// реализовать класс Product

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {return price;}
    public void setPrice(double price) {
        if (price >= 0){
            this.price = price;
        }else{
            System.out.println("Цена не может быть отрицательной");
        }
    }
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {
        if (quantity >= 0){
            this.quantity = quantity;
        }else{
            System.out.println("Кол-во не может быть отрецательным");
        }
    }
}

    // доработать getter у цены таким образом, чтобы выводилась цена со знаком $
    //     (точность 2 знака после запятой)
    //  15.46$


public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return String.format("%.2f$", price);
    }

    public void setPrice(double price) {
        if (price >= 0){
            this.price = price;
        }else{
            System.out.println("Цена не может быть отрицательной");
        }
    }
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {
        if (quantity >= 0){
            this.quantity = quantity;
        }else{
            System.out.println("Кол-во не может быть отрецательным");
        }
    }
}

// реализовать класс Triangle

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        if (isValid(side1, side2, side3)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    public void setSide1(double side1) {
        if (isValid(side1, this.side2, this.side3)){ this.side1 = side1;}
    }
    public void setSide2(double side2) {
        if (isValid(this.side1, side2, this.side3)){ this.side2 = side2;}
    }
    public void setSide3(double side3) {
        if (isValid(this.side1, this.side2, side3)){ this.side3 = side3;}
    }

    private boolean isValid(double side1, double side2, double side3){
        return side1 + side2 > side3 && side1 + side3 > side2
                && side2 + side3 > side1
                && side1 > 0 && side2 > 0 && side3 > 0;
    }
}

// указать своства
// name
// password
// message

public class User {
    public String name;
    public String password;
    public String message;
    public User(String name, String password, String message){
        this.name = name;
        this.password = password;
        this.message = message;
    }
}


// написать процесс, который возвращает
// строку, состояюую из такого кол-ва
// "*" сколько сиволов в пароле

public class User {
    public String name;
    private String password;
    public String message;
    public User(String name, String password, String message){
        this.name = name;
        this.password = password;
        this.message = message;
    }

    public String getPassword() {
        String result = "";
        for (int i = 0; i < this.password.length(); i++) {
            result += "*";
        }

        return result;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}