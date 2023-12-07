## Наследование
Наследование - это одна из основных концепций объектно-ориентированного программирования (ООП), которая позволяет создавать новый класс на основе уже существующего, чтобы использовать его свойства и методы, а также расширять или изменять их при необходимости. В Java наследование реализуется с использованием ключевого слова `extends`.

Рассмотрим пример наследования на языке Java. Предположим, у нас есть базовый класс `Vehicle`, представляющий общие характеристики транспортных средств:

```java
// Базовый класс
class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
```

Теперь давайте создадим производный класс `Car`, который наследует свойства и методы от базового класса `Vehicle`:

```java
// Производный класс
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Вызов конструктора базового класса
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }
}
```