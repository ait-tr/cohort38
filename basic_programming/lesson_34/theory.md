# Конспект по интерфейсам в Java

## 1. Определение интерфейсов

В Java интерфейс представляет собой абстрактный тип данных, который содержит только абстрактные методы и константы. Интерфейсы используются для определения контрактов, которые классы обязаны реализовать.

```java
interface MyInterface {
    // Абстрактный метод
    void myMethod();
}
```

## 2. Реализация интерфейса

Классы могут реализовывать один или несколько интерфейсов с использованием ключевого слова `implements`. Обязательно реализовывать все абстрактные методы, определенные в интерфейсе.

```java
class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }
}
```

## 3. Множественная реализация интерфейсов

Классы в Java могут реализовывать несколько интерфейсов. В этом случае они должны предоставить реализацию всех методов, объявленных в каждом интерфейсе.

```java
interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Implementation of methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Implementation of methodB");
    }
}
```

## 4. Интерфейсы и абстрактные классы

Интерфейсы и абстрактные классы могут использоваться вместе для достижения максимальной гибкости в проектировании. Абстрактный класс может предоставлять базовую реализацию методов, а интерфейс добавлять дополнительные возможности.

```java
abstract class MyAbstractClass {
    // Абстрактный метод
    abstract void myAbstractMethod();

    // Обычный метод с реализацией
    void commonMethod() {
        System.out.println("Common method in abstract class");
    }
}

interface MyInterface {
    void myMethod();
}

class MyClass extends MyAbstractClass implements MyInterface {
    @Override
    void myAbstractMethod() {
        System.out.println("Implementation of myAbstractMethod");
    }

    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }
}
```