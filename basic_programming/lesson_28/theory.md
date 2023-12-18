## Разбор кода с занятия

Класс `CustomList` представляет простую реализацию списка на основе массива целых чисел в языке программирования Java. Давайте подробно рассмотрим каждый метод:

1. **Конструкторы:**
    ```java
    public CustomList(int[] array){
        this.list = array;
    }
    public CustomList(){
        this.list = new int[0];
    }
    ```
   - `CustomList(int[] array)`: Конструктор, принимающий массив и инициализирующий поле `list` переданным массивом.
   - `CustomList()`: Конструктор по умолчанию, инициализирующий пустой массив.

2. **toString():**
    ```java
    @Override
    public String toString(){
        return Arrays.toString(this.list);
    }
    ```
   - Переопределенный метод `toString`, возвращающий строковое представление массива `list` с использованием `Arrays.toString()`.

3. **indexOf(int number):**
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
   - Метод `indexOf`, возвращающий индекс первого вхождения указанного числа в массив. Если число не найдено, возвращает -1.

4. **lastIndexOf(int numb):**
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
   - Метод `lastIndexOf`, возвращающий индекс последнего вхождения указанного числа в массив. Если число не найдено, возвращает -1.

5. **get(int index, int number):**
    ```java
    public int get(int index, int number){
        if (index >= 0 && index < this.list.length){
            return this.list[index];
        }else{
            return number;
        }
    }
    ```
   - Метод `get`, возвращающий элемент по указанному индексу. Если индекс выходит за границы, возвращает указанное по умолчанию число.

6. **get(int index):**
    ```java
    public int get(int index){
        return get(index, 0);
    }
    ```
   - Перегруженный метод `get`, вызывающий предыдущий метод `get` с числом по умолчанию, равным 0.

7. **add(int numb):**
    ```java
    public void add(int numb){
        int[] newList = new int[this.list.length + 1];
        copyArray(this.list, newList);
        newList[newList.length - 1] = numb;
        this.list = newList;
    }
    ```
   - Метод `add`, добавляющий новый элемент в конец массива. Создается новый массив увеличенного размера, копируются старые элементы, и новый элемент добавляется в конец.

8. **getMax():**
    ```java
    public int getMax(){
        int result = this.list[0];
        for (int elem: this.list) {
            if (elem > result){
                result = elem;
            }
        }
        return result;
    }
    ```
   - Метод `getMax`, возвращающий максимальный элемент в массиве. Перебирает все элементы массива и обновляет максимальное значение, если текущий элемент больше.

9. **pop():**
    ```java
    public int pop(){
        int[] newArray = new int[this.list.length - 1];
        int lastElem = this.list[this.list.length - 1];
        copyArray(this.list, newArray);
        this.list = newArray;
        return lastElem;
    }
    ```
   - Метод `pop`, удаляющий последний элемент из массива. Создается новый массив меньшего размера, копируются все элементы, и возвращается удаленный элемент.

10. **copyArray(int[] init, int[] result):**
    ```java
    private void copyArray(int[] init, int[] result){
        int minLength = (init.length > result.length) ? result.length : init.length;

        for (int i = 0; i < minLength; i++) {
            result[i] = init[i];
        }
    }
    ```
    - Вспомогательный метод `copyArray`, копирующий элементы из одного массива в другой. Используется для создания нового массива с измененным размером.

11. **remove(int value):**
    ```java
    public void remove(int value){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }
    ```
   - Метод `remove`, удаляющий первое вхождение указанного значения из массива. Использует метод `shiftByIndex` для сдвига элементов и `pop` для удаления последнего элемента.

12. **remove2(int value):**
    ```java
    public void remove2(int value){
        int index = indexOf(value);
        if (index != -1){
            shiftByIndex(index);
            pop();
        }
    }
    ```
   - Метод `remove2`, удаляющий первое вхождение указанного значения из массива, используя метод `indexOf` для поиска индекса.

13. **removeRight(int value):**
    ```java
    public void removeRight(int value){
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }
    ```
   - Метод `removeRight`, удаляющий последнее вхождение указанного значения из массива.

14. **removeAll(int value):**
    ```java
    public void removeAll(int value){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
            }
        }
    }
    ```
   - Метод `removeAll`, удаляющий все вхождения указанного значения из массива.

15

. **removeAll2(int value):**
    ```java
    public void removeAll2(int value){
        int i = 0;
        while (i < this.list.length){
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
            }else{
                i++;
            }
        }
    }
    ```
   - Метод `removeAll2`, удаляющий все вхождения указанного значения из массива, используя цикл `while` и методы `shiftByIndex` и `pop`.

16. **shiftByIndex(int index):**
    ```java
    private void shiftByIndex(int index){
        for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i+1];
        }
    }
    ```
   - Вспомогательный метод `shiftByIndex`, сдвигающий элементы массива влево начиная с указанного индекса.

17. **removeAll(int value):**
    ```java
    public void removeAll(int value){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
            }
        }
    }
    ```
   - Метод `removeAll`, удаляющий все вхождения указанного значения из массива.

Этот код предоставляет пример простой реализации списка с различными операциями добавления, поиска и удаления элементов.