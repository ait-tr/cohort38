```java
public void bubbleSort(boolean desc){
    for (int i = 0; i < this.list.length; i++) {
        for (int j = 0; j < this.list.length - 1 - i; j++) {
            if (this.list[j] > this.list[j + 1] == desc){
                swap(j, j + 1);
            }
        }
    }
}
```

**Описание:**
- Этот метод реализует сортировку пузырьком (bubble sort) для массива `list`.
- Параметр `desc` указывает порядок сортировки: если `desc` равно `true`, то сортировка будет по убыванию, иначе по возрастанию.

**Подробное объяснение:**
1. **Внешний цикл (`for` по переменной `i`):**
    - Цикл проходит по всем элементам массива `list`.
    - Каждая итерация внешнего цикла фиксирует на своем месте (с конца) один из самых больших (в случае сортировки по убыванию) или самых маленьких (в случае сортировки по возрастанию) элементов.

2. **Внутренний цикл (`for` по переменной `j`):**
    - Внутри каждой итерации внешнего цикла выполняется вложенный цикл, который проходит по элементам массива `list` до предпоследнего элемента.
    - В каждой итерации вложенного цикла сравниваются два соседних элемента: `this.list[j]` и `this.list[j + 1]`.

3. **Условие внутреннего цикла (`if`):**
    - Условие проверяет, нужно ли поменять местами элементы. Если `this.list[j] > this.list[j + 1] == desc` и `desc` равно `true` (сортировка по убыванию), или `this.list[j] > this.list[j + 1] == false` и `desc` равно `false` (сортировка по возрастанию), то выполняется блок кода внутри условия.

4. **Блок кода внутри условия:**
    - Вызывается метод `swap(j, j + 1)`, который меняет местами элементы с индексами `j` и `j + 1`.

5. **Итог:**
    - В результате выполнения внешнего цикла самый большой (или маленький) элемент "всплывает" на свое место в конце массива.
    - Процесс повторяется для оставшихся элементов до тех пор, пока массив не будет полностью отсортирован.

Таким образом, метод `bubbleSort(boolean desc)` сортирует массив методом пузырьковой сортировки, принимая во внимание параметр `desc` для определения порядка сортировки.


```java
public void selectionSort(){
    for (int i = 0; i < this.list.length; i++) {
        int max = this.list[0];
        int maxIndex = 0;
        for (int j = 0; j < this.list.length - i; j++) {
            if (max < this.list[j]){
                max = this.list[j];
                maxIndex = j;
            }
        }
        swap(maxIndex, this.list.length - i - 1);
    }
}
```

**Описание:**
- Этот метод реализует сортировку выбором (selection sort) для массива `list`.

**Подробное объяснение:**
1. **Внешний цикл (`for` по переменной `i`):**
    - Цикл проходит по всем элементам массива `list`.
    - Каждая итерация внешнего цикла фиксирует на своем месте (с конца) один из самых больших элементов.

2. **Инициализация переменных внутри внешнего цикла:**
    - `int max = this.list[0];` - Инициализация переменной `max` значением первого элемента массива. Эта переменная будет хранить текущий максимальный элемент.
    - `int maxIndex = 0;` - Инициализация переменной `maxIndex` индексом первого элемента массива. Эта переменная будет хранить индекс текущего максимального элемента.

3. **Внутренний цикл (`for` по переменной `j`):**
    - Внутри каждой итерации внешнего цикла выполняется вложенный цикл, который проходит по элементам массива `list` до последнего элемента, который еще не был учтен в отсортированной части массива.

4. **Условие внутреннего цикла (`if`):**
    - Условие проверяет, является ли текущий элемент (`this.list[j]`) большим, чем текущий максимальный элемент (`max`).
    - Если условие выполняется, обновляются значения `max` и `maxIndex`.

5. **Блок кода внутри внутреннего цикла:**
    - Если `this.list[j]` больше, чем текущий максимальный элемент `max`, то `max` присваивается значение `this.list[j]`, а `maxIndex` присваивается значение `j`.

6. **Завершение внутреннего цикла:**
    - По завершении вложенного цикла, переменная `max` содержит максимальный элемент в текущей неотсортированной части массива, а `maxIndex` содержит его индекс.

7. **Вызов метода `swap`:**
    - После завершения вложенного цикла вызывается метод `swap(maxIndex, this.list.length - i - 1)`, который меняет местами элемент с максимальным значением и последний элемент в текущей неотсортированной части массива.

8. **Итог:**
    - В результате выполнения внешнего цикла каждая итерация фиксирует на своем месте (с конца) один из самых больших элементов в массиве.
    - Процесс повторяется для оставшихся элементов до тех пор, пока массив не будет полностью отсортирован.

Таким образом, метод `selectionSort()` сортирует массив методом выбора максимального элемента.


```java
public void selectionSort(boolean desc){
    for (int i = 0; i < this.list.length; i++) {
        int target = this.list[0];
        int targetIndex = 0;
        for (int j = 0; j < this.list.length - i; j++) {
            if (target < this.list[j] == desc){
                target = this.list[j];
                targetIndex = j;
            }
        }
        swap(targetIndex, this.list.length - i - 1);
    }
}
```

**Описание:**
- Этот метод реализует сортировку выбором (selection sort) для массива `list`.
- Параметр `desc` указывает порядок сортировки: если `desc` равно `true`, то сортировка будет по убыванию, иначе по возрастанию.

**Подробное объяснение:**
1. **Внешний цикл (`for` по переменной `i`):**
    - Цикл проходит по всем элементам массива `list`.
    - Каждая итерация внешнего цикла фиксирует на своем месте (с конца) один из самых больших (в случае сортировки по убыванию) или самых маленьких (в случае сортировки по возрастанию) элементов.

2. **Инициализация переменных внутри внешнего цикла:**
    - `int target = this.list[0];` - Инициализация переменной `target` значением первого элемента массива. Эта переменная будет хранить текущий элемент, который нужно сравнивать с другими.
    - `int targetIndex = 0;` - Инициализация переменной `targetIndex` индексом первого элемента массива. Эта переменная будет хранить индекс текущего элемента.

3. **Внутренний цикл (`for` по переменной `j`):**
    - Внутри каждой итерации внешнего цикла выполняется вложенный цикл, который проходит по элементам массива `list` до последнего элемента, который еще не был учтен в отсортированной части массива.

4. **Условие внутреннего цикла (`if`):**
    - Условие проверяет, нужно ли обновить значения `target` и `targetIndex`. Если `this.list[j]` меньше (`desc == false`) или больше (`desc == true`) чем текущий `target`, то выполняется блок кода внутри условия.

5. **Блок кода внутри внутреннего цикла:**
    - Если условие выполняется, обновляются значения `target` и `targetIndex`.

6. **Завершение внутреннего цикла:**
    - По завершении вложенного цикла, переменная `target` содержит текущий (минимальный или максимальный) элемент в текущей неотсортированной части массива, а `targetIndex` содержит его индекс.

7. **Вызов метода `swap`:**
    - После завершения вложенного цикла вызывается метод `swap(targetIndex, this.list.length - i - 1)`, который меняет местами элемент с текущим минимальным или максимальным значением и последний элемент в текущей неотсортированной части массива.

8. **Итог:**
    - В результате выполнения внешнего цикла каждая итерация фиксирует на своем месте (с конца) один из самых больших (или маленьких) элементов в массиве.
    - Процесс повторяется для оставшихся элементов до тех пор, пока массив не будет полностью отсортирован.

Таким образом, метод `selectionSort(boolean desc)` сортирует массив методом выбора минимального или максимального элемента, в зависимости от параметра `desc`.

Метод `swap(int index1, int index2)` реализует обмен местами двух элементов в массиве `list` по их индексам. Давайте подробно разберем этот метод:

```java
private void swap(int index1, int index2){
    int tmp = this.list[index1];
    this.list[index1] = this.list[index2];
    this.list[index2] = tmp;
}
```

**Описание:**
- Этот метод является частным (private) и используется внутри класса `CustomList` для обмена местами элементов массива.

**Подробное объяснение:**
1. **Входные параметры:**
    - `int index1` и `int index2` - Это индексы двух элементов, которые нужно поменять местами в массиве `list`.

2. **Создание временной переменной:**
    - `int tmp = this.list[index1];` - Создается временная переменная `tmp`, которая сохраняет значение элемента массива, находящегося по индексу `index1`.

3. **Перемещение значения из `index2` в `index1`:**
    - `this.list[index1] = this.list[index2];` - Значение элемента по индексу `index2` присваивается элементу по индексу `index1`. Теперь значение элемента, находившегося по индексу `index2`, переместилось в ячейку `index1`.

4. **Перемещение значения из временной переменной в `index2`:**
    - `this.list[index2] = tmp;` - Значение временной переменной `tmp` (значение, которое изначально было в `index1`) присваивается элементу по индексу `index2`. Теперь значение элемента, изначально находившегося по индексу `index1`, переместилось в ячейку `index2`.

5. **Итог:**
    - В результате выполнения этого метода элементы по индексам `index1` и `index2` поменялись местами в массиве `list`.

Этот метод применяется в алгоритмах сортировки (например, в методах `bubbleSort` и `selectionSort`), где требуется обмен местами элементов для достижения правильного порядка.


```java
public void changeSign(boolean type){
    for (int i = 0; i < this.list.length; i++) {
        if (this.list[i] < 0 == type){
            this.list[i] *= -1;
        }
    }
}
```

**Описание:**
- Этот метод меняет знаки элементов массива `list` в зависимости от значения параметра `type`.

**Подробное объяснение:**
1. **Входной параметр:**
    - `boolean type` - Этот параметр определяет, какие элементы массива будут изменены. Если `type` равно `true`, то знак будут меняться только у отрицательных элементов; если `type` равно `false`, то знак будут меняться у положительных элементов.

2. **Цикл по элементам массива:**
    - `for (int i = 0; i < this.list.length; i++)` - Цикл проходит по всем элементам массива `list`.

3. **Условие внутри цикла (`if`):**
    - `if (this.list[i] < 0 == type)` - Условие проверяет, соответствует ли знак текущего элемента условия, заданному параметром `type`. Если `type` равно `true` и текущий элемент отрицателен, или если `type` равно `false` и текущий элемент положителен, то выполняется блок кода внутри условия.

4. **Блок кода внутри условия:**
    - `this.list[i] *= -1;` - Если условие выполняется, то знак текущего элемента меняется на противоположный. Это достигается умножением элемента на -1.

5. **Итог:**
    - В результате выполнения этого метода меняются знаки определенных элементов массива в соответствии с условием, заданным параметром `type`.

Например, если `type` равно `true`, то метод изменит знаки всех отрицательных элементов в массиве `list`, оставив положительные элементы без изменений. Если `type` равно `false`, то метод изменит знаки всех положительных элементов в массиве `list`, оставив отрицательные элементы без изменений.