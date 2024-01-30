## Класс ShopTest

Давайте разберем класс Shop построчно, объясняя каждую строку и приводя примеры.

```java
package org.example;
```
- `package org.example;`: Объявление пакета. Все классы в Java должны находиться в каком-то пакете. В данном случае, класс принадлежит пакету `org.example`.

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
```
- `import ...`: Импорт необходимых классов из библиотек JUnit. JUnit - это библиотека для тестирования в Java.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
```
- `import ...`: Импорт классов из стандартной библиотеки Java для работы с коллекциями.

```java
public class ShopTest {
```
- `public class ShopTest {`: Объявление публичного класса `ShopTest`. Этот класс предназначен для тестирования функциональности класса `Shop`.

```java
    private Shop shop;
```
- `private Shop shop;`: Объявление приватной переменной `shop` типа `Shop`. Это объект класса `Shop`, который будет использоваться в тестах.

```java
    @BeforeEach
    public void setUp(){
        this.shop = new Shop("Shop name");
    }
```
- `@BeforeEach`: Аннотация, указывающая, что метод `setUp` должен быть выполнен перед каждым тестовым методом.
- `this.shop = new Shop("Shop name");`: Создание нового объекта `Shop` с именем "Shop name" перед каждым тестом.

```java
    @Test
    public void getTitle(){
        Assertions.assertEquals("Shop name", this.shop.getTitle());
    }
```
- `@Test`: Аннотация, указывающая, что метод `getTitle` является тестовым методом.
- `Assertions.assertEquals("Shop name", this.shop.getTitle());`: Проверка, что метод `getTitle` возвращает ожидаемое значение "Shop name".

```java
    @Test
    public void getProducts(){
        Product product1 = new Product("Product1", 10, 4);
        Product product2 = new Product("Product2", 20, 6);

        this.shop.add(product1);
        this.shop.add(product2);
        ArrayList<Product> products = this.shop.getProducts();

        Assertions.assertTrue(products.contains(product1));
        Assertions.assertTrue(products.contains(product2));
        Assertions.assertEquals(2, products.size());
    }
```
- `@Test`: Аннотация, указывающая, что метод `getProducts` является тестовым методом.
- Создание двух объектов `Product`.
- Добавление этих продуктов в магазин (`this.shop.add(product1)` и `this.shop.add(product2)`).
- Получение списка продуктов из магазина и проверка, что он содержит добавленные продукты и имеет размер 2.

```java
    @Test
    public void addProduct(){
        Product product = new Product("Product1", 10, 12);
        this.shop.add(product);
        Assertions.assertTrue(this.shop.getProducts().contains(product));
    }
```
- `@Test`: Аннотация, указывающая, что метод `addProduct` является тестовым методом.
- Создание объекта `Product`.
- Добавление продукта в магазин.
- Проверка, что продукт действительно был добавлен в список продуктов магазина.

```java
    @ParameterizedTest
    @CsvSource({"1_2_4_2,9", "1_1_1_1,4"})
    public void productsCount(String counts, int result){
        Arrays.stream(counts.split("_"))
                .mapToInt(x -> Integer.parseInt(x))
                .forEach(x -> this.shop.add(new Product("title", 123, x)));

        Assertions.assertEquals(result, this.shop.productsCount());
    }
```
- `@ParameterizedTest`: Аннотация, указывающая, что метод `productsCount` является параметризованным тестовым методом.
- `@CsvSource`: Аннотация, предоставляющая набор данных для параметризации теста.
- В данном случае, тест параметризован двумя наборами данных, представленными в формате CSV.
- В методе используется `Arrays.stream` для преобразования строки в массив чисел, затем `mapToInt` для преобразования строковых представлений чисел в целочисленные значения.
- Для каждого числа вызывается `this.shop.add(new Product("title", 123, x))`, добавляя продукты в магазин с разными количествами.
- После этого производится проверка, что общее количество продуктов в магазине соответствует ожидаемому результату.

## Класс ProductTest

Давайте разберем класс ProductTest построчно и объясним каждую строку, используя примеры.

```java
package org.example;
```
- `package org.example;`: Объявление пакета. Все классы в Java должны находиться в каком-то пакете. В данном случае, класс принадлежит пакету `org.example`.

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
```
- `import ...`: Импорт необходимых классов из библиотек JUnit. JUnit - это библиотека для тестирования в Java.

```java
public class ProductTest {
```
- `public class ProductTest {`: Объявление публичного класса `ProductTest`. Этот класс предназначен для тестирования функциональности класса `Product`.

```java
    @Test
    public void productCreationPositive(){
        String title = "велосипед";
        double price = 2300;
        int count = 10;
        Product product = new Product(title, price, count);
        Assertions.assertEquals(title, product.getTitle());
        Assertions.assertEquals(price, product.getPrice());
        Assertions.assertEquals(count, product.getCount());
    }
```
- `@Test`: Аннотация, указывающая, что метод `productCreationPositive` является тестовым методом.
- Создание объекта `Product` с положительными значениями для заголовка, цены и количества.
- Проверка, что методы получения заголовка, цены и количества возвращают ожидаемые значения.

```java
    @Test
    public void notPositivePrice(){
        String title = "велосипед";
        double price = -2300;
        int count = 10;
        Assertions.assertThrows(RuntimeException.class, () -> {
            new Product(title, price, count);
        });
    }
```
- `@Test`: Аннотация, указывающая, что метод `notPositivePrice` является тестовым методом.
- Попытка создать объект `Product` с отрицательной ценой.
- Использование `Assertions.assertThrows` для проверки, что ожидается исключение типа `RuntimeException` при попытке создать продукт с отрицательной ценой.

```java
    @Test
    public void notPositiveCount(){
        String title = "велосипед";
        double price = 2300;
        int count = -10;
        Assertions.assertThrows(RuntimeException.class, () -> {
            new Product(title, price, count);
        });
    }
```
- `@Test`: Аннотация, указывающая, что метод `notPositiveCount` является тестовым методом.
- Попытка создать объект `Product` с отрицательным количеством.
- Использование `Assertions.assertThrows` для проверки, что ожидается исключение типа `RuntimeException` при попытке создать продукт с отрицательным количеством.

```java
    @Test
    public void setProductPricePositive(){
        String title = "велосипед";
        double price = 2300;
        double newPrice = 2500;
        int count = 10;
        Product product = new Product(title, price, count);
        product.setPrice(newPrice);
        Assertions.assertEquals(newPrice, product.getPrice());
    }
```
- `@Test`: Аннотация, указывающая, что метод `setProductPricePositive` является тестовым методом.
- Создание объекта `Product` с начальной ценой.
- Изменение цены продукта с помощью метода `setPrice`.
- Проверка, что новая цена соответствует ожидаемой.

```java
    @ParameterizedTest
    @ValueSource(doubles = {-1000, -1, 0})
    public void setProductPriceNegative(double newPrice){
        String title = "велосипед";
        double price = 2300;
        int count = 10;
        Product product = new Product(title, price, count);
        product.setPrice(newPrice);
        Assertions.assertEquals(price, product.getPrice());
    }
```
- `@ParameterizedTest`: Аннотация, указывающая, что метод `setProductPriceNegative` является параметризованным тестовым методом.
- `@ValueSource(doubles = {-1000, -1, 0})`: Аннотация, предоставляющая набор данных для параметризации теста.
- Тестирование метода `setPrice` с отрицательными и нулевыми значениями новой цены.
- Проверка, что цена продукта не изменилась при установке недопустимых значений.