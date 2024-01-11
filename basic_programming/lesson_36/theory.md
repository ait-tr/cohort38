# Конспект по генерикам в Java

## Введение в генерики

### 1.1 Определение
Генерики в Java представляют собой механизм обобщенного программирования, который позволяет создавать классы, интерфейсы и методы с параметризованными типами данных.

### 1.2 Преимущества использования
- **Безопасность типов:** Генерики обеспечивают безопасность типов на этапе компиляции, предотвращая ошибки во время выполнения.
- **Повышение переиспользования кода:** Позволяют создавать универсальные и гибкие структуры данных и алгоритмы.

## Обобщенные классы и интерфейсы

### 2.1 Обобщенные классы
```java
public class Box<T> {
    private T content;

    public void put(T item) {
        this.content = item;
    }

    public T get() {
        return content;
    }
}
```

Вот пример использования класса `Box`:

```java
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр Box для хранения строк
        Box<String> stringBox = new Box<>();

        // Помещаем строку в коробку
        stringBox.put("Hello, Generics!");

        // Получаем содержимое коробки
        String greeting = stringBox.get();
        System.out.println("Message: " + greeting);

        // Создаем экземпляр Box для хранения целых чисел
        Box<Integer> integerBox = new Box<>();

        // Помещаем число в коробку
        integerBox.put(42);

        // Получаем содержимое коробки
        int answer = integerBox.get();
        System.out.println("Answer: " + answer);
    }
}
```

В этом примере мы создаем две коробки (`Box`): одну для хранения строк, а другую - для хранения целых чисел. Обратите внимание, что мы использовали параметризованный тип `T` при создании экземпляров `Box`, который затем заменяется реальными типами данных (`String` и `Integer`) при создании экземпляров класса.

Затем мы помещаем значения в каждую коробку с помощью метода `put` и извлекаем их с использованием метода `get`. Коробка для строк хранит строку, а коробка для целых чисел хранит целое число. Это показывает, как обобщенный класс `Box` может быть использован для хранения и работы с различными типами данных без необходимости повторного написания кода.


### 2.2 Обобщенные интерфейсы
```java
public interface Pair<K, V> {
    K getKey();
    V getValue();
}
```

Вот пример использования интерфейса `Pair`:

```java
public class KeyValuePair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Создаем объект KeyValuePair с типами String и Integer
        KeyValuePair<String, Integer> pair1 = new KeyValuePair<>("One", 1);

        // Получаем ключ и значение
        String key1 = pair1.getKey();
        Integer value1 = pair1.getValue();

        // Выводим ключ и значение
        System.out.println("Key: " + key1 + ", Value: " + value1);

        // Создаем объект KeyValuePair с типами Integer и Double
        KeyValuePair<Integer, Double> pair2 = new KeyValuePair<>(2, 3.14);

        // Получаем ключ и значение
        Integer key2 = pair2.getKey();
        Double value2 = pair2.getValue();

        // Выводим ключ и значение
        System.out.println("Key: " + key2 + ", Value: " + value2);
    }
}
```