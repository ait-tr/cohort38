### Ограничения с использованием extends

```java
public class Box<T extends Number> {
    // ...
}

```

Этот код представляет собой обобщенный (generic) класс с параметром типа `<T>`. В данном случае используется ограничение (bounded type parameter) для параметра типа `T`. Ограничение `extends Number` указывает, что параметр типа `T` должен быть подтипом класса `Number` или самим классом `Number`.

Когда вы определяете класс `Box` с таким ограничением, это означает, что вы можете создать экземпляры класса `Box` только с типом, который является подтипом `Number`. Это позволяет использовать числовые типы данных в качестве параметра типа для `Box`, такие как `Integer`, `Double`, `Float` и т.д.

Пример использования класса `Box`:

```java
public class Main {
    public static void main(String[] args) {
        // Создание объекта Box с типом Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.set(42); // установка значения

        // Создание объекта Box с типом Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14); // установка значения

        // Нельзя создать объект Box с типом String, так как String не является подтипом Number
        // Box<String> stringBox = new Box<>(); // Ошибка компиляции
    }
}

class Box<T extends Number> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

```

В этом примере `Box` может содержать только значения числовых типов данных, благодаря ограничению `<T extends Number>`.

**Пример использования**

```java
interface Fruit {
    void getDetails();
}

class Apple implements Fruit {
    @Override
    public void getDetails() {
        System.out.println("This is an Apple");
    }
}

class Orange implements Fruit {
    @Override
    public void getDetails() {
        System.out.println("This is an Orange");
    }
}
```

```java
class Box<T extends Fruit> {
    private T fruit;

    public Box(T fruit) {
        this.fruit = fruit;
    }

    public void displayDetails() {
        fruit.getDetails();
    }
}
```

### Работа с ArrayList

`ArrayList` - это класс в языке программирования Java, который предоставляет динамический массив, способный изменять свой размер по мере необходимости. Это означает, что вы можете легко добавлять или удалять элементы из массива без необходимости явного управления его размером.

Вот несколько основных операций, которые вы можете выполнять с `ArrayList`:

1. **Создание `ArrayList` и добавление элементов:**

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание ArrayList
        ArrayList<String> myList = new ArrayList<>();

        // Добавление элементов
        myList.add("Элемент 1");
        myList.add("Элемент 2");
        myList.add("Элемент 3");

        // Вывод элементов
        System.out.println(myList); // Вывод: [Элемент 1, Элемент 2, Элемент 3]
    }
}
```

2. **Доступ к элементам:**

```java
String element = myList.get(1); // Получение элемента по индексу
System.out.println(element);   // Вывод: Элемент 2
```

3. **Изменение элемента:**

```java
myList.set(1, "Новый элемент 2"); // Изменение элемента по индексу
System.out.println(myList);       // Вывод: [Элемент 1, Новый элемент 2, Элемент 3]
```

4. **Удаление элемента:**

```java
myList.remove("Новый элемент 2"); // Удаление по значению
System.out.println(myList);       // Вывод: [Элемент 1, Элемент 3]
```

5. **Получение размера списка:**

```java
int size = myList.size();
System.out.println("Размер списка: " + size); // Вывод: Размер списка: 2
```

6. **Проверка наличия элемента в списке:**

```java
boolean containsElement = myList.contains("Элемент 1");
System.out.println("Содержит элемент 1? " + containsElement); // Вывод: Содержит элемент 1? true
```

7. **Итерация по списку:**

```java
for (String item : myList) {
    System.out.println(item);
}
```

Это базовые операции с `ArrayList`. Этот класс предоставляет множество других методов для более сложных сценариев использования. Однако, стоит помнить, что при большом количестве операций вставки и удаления в середине списка `ArrayList` может не быть самой эффективной структурой данных из-за необходимости сдвига элементов. В таких случаях рассмотрение использования `LinkedList` может быть более эффективным выбором.