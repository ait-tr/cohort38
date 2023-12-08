Переопределение методов в подклассе, изменение их реализации так, чтобы она соответствовала нуждам подкласса. Это часто применяется в наследовании, где дочерний класс может предоставить свою собственную реализацию метода, который унаследован от родительского класса.

Пример переписывания метода `toString()` в Java:

```java
// Родительский класс
class Animal {
    private String name;

    // Конструктор
    public Animal(String name) {
        this.name = name;
    }

    // Метод для получения имени
    public String getName() {
        return name;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}

// Дочерний класс
class Dog extends Animal {
    private String breed;

    // Конструктор
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Переопределение метода toString() в дочернем классе
    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', breed='" + breed + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты
        Animal genericAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Buddy", "Labrador");

        // Используем переопределенный метод toString()
        System.out.println(genericAnimal.toString()); // Вывод: Animal{name='Generic Animal'}
        System.out.println(myDog.toString()); // Вывод: Dog{name='Buddy', breed='Labrador'}
    }
}
```

В этом примере `toString()` переопределен в обоих классах: в классе `Animal` и в его дочернем классе `Dog`. В методе `toString()` каждого класса формируется строка, представляющая объект в удобном для чтения формате. Когда вы вызываете `System.out.println()` для объекта, Java автоматически вызывает его метод `toString()`, поэтому переопределение `toString()` позволяет вам определить, как будет выглядеть строковое представление вашего объекта.