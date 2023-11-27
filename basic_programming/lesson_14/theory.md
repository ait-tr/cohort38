**Работа статических методов в Java: Подробный конспект**

---

### **1. Зачем нужны методы в Java?**

Методы в Java предоставляют механизм для организации кода внутри классов. Они выполняют конкретные действия и позволяют разделить большие задачи на более мелкие, что делает код более читаемым и управляемым. Методы также обеспечивают возможность повторного использования кода.

---

### **2. Методы без параметров и return**

#### **2.1. Методы без параметров:**
```java
public class Example {
    // Метод без параметров
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        printHello(); // Вызов метода без параметров
    }
}
```
**Пояснение:**
- `printHello` - это статический метод, не принимающий параметры.
- В методе `main` он вызывается с использованием `printHello();`, что приводит к выводу "Hello, World!".

#### **2.2. Методы без параметров и с return:**
```java
public class Calculator {
    // Метод с параметрами и возвращаемым значением
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = addNumbers(5, 7); // Вызов метода с параметрами и возвратом значения
        System.out.println("Sum: " + result);
    }
}
```
**Пояснение:**
- `addNumbers` - метод, принимающий два параметра и возвращающий их сумму.
- В методе `main` он вызывается с параметрами `5` и `7`, результат сохраняется в переменной `result` и выводится на экран.

---

### **3. Методы с параметрами**

Методы могут принимать параметры для обработки конкретных данных.

```java
public class Example {
    // Метод с параметром
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        printMessage("This is a custom message."); // Вызов метода с параметром
    }
}
```
**Пояснение:**
- `printMessage` - метод, принимающий строковый параметр `message` и выводящий его на экран.
- В методе `main` он вызывается с параметром "This is a custom message."

---

### **4. Return в методах**

#### **4.1. Возвращаемое значение:**
```java
public class Calculator {
    // Метод с возвращаемым значением
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int result = multiply(3, 4);
        System.out.println("Product: " + result);
    }
}
```
**Пояснение:**
- `multiply` - метод, принимающий два параметра и возвращающий их произведение.
- В методе `main` он вызывается с параметрами `3` и `4`, результат сохраняется в переменной `result` и выводится на экран.

#### **4.2. Возвращение void:**
```java
public class Example {
    // Метод с возвращаемым значением void
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        displayInfo("John", 25);
    }
}
```
**Пояснение:**
- `displayInfo` - метод, принимающий два параметра и не возвращающий значения (тип `void`).
- В методе `main` он вызывается с параметрами "John" и `25`, что приводит к выводу информации на экран.

---

Использование статических методов в Java позволяет эффективно организовывать код, делая его более структурированным и легким для понимания.