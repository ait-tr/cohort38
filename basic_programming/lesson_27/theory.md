## Разбор кода с занятия

Данный код представляет собой простую реализацию своего собственного класса списка для хранения целочисленных значений. Давайте разберем код по частям:

1. **Конструкторы:**
    ```java
    public CustomList(int[] array){
        this.list = array;
    }
    ```
    Этот конструктор принимает массив целых чисел и инициализирует поле `list` этим массивом.

    ```java
    public CustomList(){
        this.list = new int[0];
    }
    ```
    Этот конструктор создает пустой список, инициализируя поле `list` массивом нулевой длины.

2. **Метод `toString`:**
    ```java
    @Override
    public String toString(){
        return Arrays.toString(this.list);
    }
    ```
    Этот метод переопределяет метод `toString` класса `Object` и возвращает строковое представление списка с использованием метода `Arrays.toString`.

3. **Метод `indexOf`:**
    ```java
    public int indexOf(int number){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == number){
                return i;
            }
        }
        return -1;
    }
    ```
    Этот метод возвращает индекс первого вхождения числа `number` в список. Если число не найдено, возвращается -1.

4. **Метод `lastIndexOf`:**
    ```java
    public int lastIndexOf(int numb){
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == numb){
                return i;
            }
        }
        return  -1;
    }
    ```
    Этот метод возвращает индекс последнего вхождения числа `numb` в список. Если число не найдено, возвращается -1.

5. **Методы `get`:**
    ```java
    public int get(int index, int number){
        if (index >= 0 && index < this.list.length){
            return this.list[index];
        }else{
            return number;
        }
    }
    ```
    Этот метод возвращает элемент списка по индексу `index`. Если индекс находится в пределах списка, возвращается соответствующий элемент, иначе возвращается значение по умолчанию `number`.

    ```java
    public int get(int index){
        return get(index, 0);
    }
    ```
    Этот метод вызывает предыдущий метод `get` с `number` равным 0.

6. **Метод `add`:**
    ```java
    public void add(int numb){
        int[] newList = new int[this.list.length + 1];

        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }

        newList[newList.length - 1] = numb;
        this.list = newList;
    }
    ```
    Этот метод добавляет новый элемент `numb` в конец списка. Он создает новый массив `newList` большей длины, копирует все элементы из текущего списка в новый массив, а затем добавляет новый элемент в конец списка, обновляя поле `list`.