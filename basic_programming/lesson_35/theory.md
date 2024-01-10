# Интерфейсы Iterable и Iterator

В языке программирования Java интерфейсы `Iterable` и `Iterator` используются для поддержки итераций по коллекциям объектов. Давайте разберемся с каждым из них.

1. **Интерфейс `Iterable`**:

   `Iterable` является интерфейсом, который обеспечивает возможность итерации по элементам коллекции. Он определен следующим образом:

   ```java
   public interface Iterable<T> {
       Iterator<T> iterator();
   }
   ```

   Классы, реализующие `Iterable`, должны предоставить реализацию метода `iterator()`, который возвращает объект типа `Iterator`.

2. **Интерфейс `Iterator`**:

   `Iterator` предоставляет методы для последовательного доступа и обхода элементов коллекции. Он содержит следующие методы:

   ```java
   public interface Iterator<T> {
       boolean hasNext();    // Возвращает true, если есть следующий элемент
       T next();             // Возвращает следующий элемент
       void remove();        // Удаляет текущий элемент (необязательная операция)
   }
   ```

   Обычно, при использовании `Iterator`, сначала вызывается `hasNext()`, чтобы проверить наличие следующего элемента, а затем вызывается `next()` для получения самого элемента. Метод `remove()` используется для удаления текущего элемента, однако не все реализации `Iterator` поддерживают эту операцию.

Пример использования `Iterable` и `Iterator` в Java:

```java
import java.util.Iterator;

public class MyIterableCollection<T> implements Iterable<T> {
    private T[] elements;

    public MyIterableCollection(T[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.length;
        }

        @Override
        public T next() {
            return elements[index++];
        }

        @Override
        public void remove() {
            // Реализация метода remove (необязательная)
        }
    }

    public static void main(String[] args) {
        MyIterableCollection<String> collection = new MyIterableCollection<>(new String[]{"A", "B", "C"});

        for (String element : collection) {
            System.out.println(element);
        }
    }
}
```

Этот пример демонстрирует создание простой коллекции, реализующей интерфейс `Iterable`, и ее использование в цикле for-each для итерации по элементам.

# Разбор примера из класса

Данный код представляет пример простой реализации своего собственного списка (`CustomList`) и итератора (`CustomIterator`) для массива целых чисел. Давайте рассмотрим его более детально:

1. **Объявление класса `CustomList`**:

   ```java
   public class CustomList implements Iterable {
       private int[] array;

       public CustomList(int[] array) {
           this.array = array;
       }
   ```
   - `CustomList` - это класс, реализующий интерфейс `Iterable`. Это означает, что объекты этого класса могут быть использованы в циклах for-each.
   - У класса есть приватное поле `array`, представляющее массив целых чисел, который будет итерироваться.

2. **Реализация метода `iterator`**:

   ```java
   @Override
   public Iterator iterator() {
       Iterator result = new CustomIterator(this.array);
       return result;
   }
   ```
   - Метод `iterator()` переопределен из интерфейса `Iterable`. Этот метод создает новый объект типа `CustomIterator` и передает ему массив `this.array`. Затем метод возвращает этот объект типа `Iterator`.

3. **Класс `CustomIterator`**:

   ```java
   import java.util.Iterator;

   public class CustomIterator implements Iterator {
       private int[] array;
       private int index = 0;

       public CustomIterator(int[] array) {
           this.array = array;
       }

       @Override
       public boolean hasNext() {
           return index < array.length;
       }

       @Override
       public Object next() {
           return array[index++];
       }
   }
   ```
   - `CustomIterator` - это вложенный класс, реализующий интерфейс `Iterator`. Этот класс отвечает за итерацию по элементам массива.
   - У класса есть приватные поля: `array`, представляющее массив для итерации, и `index`, указывающее на текущий индекс элемента в массиве.
   - Метод `hasNext()` возвращает `true`, если есть следующий элемент в массиве.
   - Метод `next()` возвращает текущий элемент массива и увеличивает `index` для указания на следующий элемент.

4. **Пример использования**:

   ```java
   public static void main(String[] args) {
       int[] myArray = {1, 2, 3, 4, 5};
       CustomList customList = new CustomList(myArray);

       for (Object element : customList) {
           System.out.println(element);
       }
   }
   ```
   - Создается экземпляр `CustomList` с массивом `{1, 2, 3, 4, 5}`.
   - Затем этот объект `customList` используется в цикле for-each для итерации по элементам массива и вывода их на консоль.