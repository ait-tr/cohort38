JUnit 5 — это фреймворк для написания тестов на языке программирования Java. Он представляет собой следующую версию после JUnit 4 и включает в себя множество новых функций и улучшений. Вот несколько ключевых особенностей JUnit 5:

1. **Аннотации:** В JUnit 5 использованы аннотации для определения тестов, их зависимостей, конфигурации и других аспектов. Например, аннотация `@Test` используется для обозначения метода как тестового.

    ```java
    import org.junit.jupiter.api.Test;

    public class MyTest {

        @Test
        void myTestMethod() {
            // код теста
        }
    }
    ```

2. **Новые архитектурные компоненты:**
    - `@Test`: Обозначает метод как тестовый.
    - `@BeforeEach`, `@AfterEach`: Позволяют выполнять код перед и после каждого тестового метода соответственно.
    - `@BeforeAll`, `@AfterAll`: Позволяют выполнять код перед всеми тестами и после завершения всех тестов соответственно.

3. **Тестовые условия (Assumptions):** JUnit 5 вводит новый способ управления выполнением тестов с использованием предположений. Это позволяет пропускать тесты, если не выполнены определенные условия.

    ```java
    import static org.junit.jupiter.api.Assumptions.assumeTrue;

    @Test
    void testOnUnix() {
        assumeTrue(System.getProperty("os.name").contains("Linux"));
        // код, который выполняется только на Unix
    }
    ```

4. **Параметризированные тесты:** JUnit 5 поддерживает параметризированные тесты, что позволяет запускать один и тот же тест с разными наборами параметров.

    ```java
    import org.junit.jupiter.params.ParameterizedTest;
    import org.junit.jupiter.params.provider.ValueSource;

    public class MyParameterizedTest {

        @ParameterizedTest
        @ValueSource(strings = {"apple", "banana", "orange"})
        void testWithParameter(String fruit) {
            // код теста с параметром
        }
    }
    ```

5. **Расширения (Extensions):** В JUnit 5 появилась поддержка расширений, которые позволяют настраивать или расширять поведение тестового фреймворка.

6. **Тегирование и фильтрация тестов:** Можно присваивать теги к тестам и затем выбирать, какие тесты запускать, исходя из этих тегов.

    ```java
    @Tag("integration")
    public class MyIntegrationTest {
        // ...
    }
    ```

Это лишь краткое введение в JUnit 5. Он предоставляет множество других возможностей для тестирования, таких как повторяемые тесты, условия выполнения тестов, динамическое генерирование тестов и многое другое.