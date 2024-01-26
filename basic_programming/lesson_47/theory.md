## Конспект по работе с классами `LocalDate`, `LocalTime` и `LocalDateTime` в Java:

### 1. LocalDate
- `LocalDate` представляет собой дату без времени в формате год-месяц-день.
- Создание объекта `LocalDate`:
  ```java
  LocalDate currentDate = LocalDate.now();
  LocalDate specificDate = LocalDate.of(2022, 1, 27);
  ```

- Основные методы:
  ```java
  int year = currentDate.getYear();
  Month month = currentDate.getMonth();
  int day = currentDate.getDayOfMonth();
  ```

- Манипуляции с датами:
  ```java
  LocalDate futureDate = currentDate.plusDays(7);
  LocalDate pastDate = currentDate.minusMonths(2);
  ```

### 2. LocalTime
- `LocalTime` представляет собой время без даты в формате часы-минуты-секунды.
- Создание объекта `LocalTime`:
  ```java
  LocalTime currentTime = LocalTime.now();
  LocalTime specificTime = LocalTime.of(12, 30, 45);
  ```

- Основные методы:
  ```java
  int hour = currentTime.getHour();
  int minute = currentTime.getMinute();
  int second = currentTime.getSecond();
  ```

- Манипуляции с временем:
  ```java
  LocalTime futureTime = currentTime.plusHours(3);
  LocalTime pastTime = currentTime.minusMinutes(15);
  ```

### 3. LocalDateTime
- `LocalDateTime` объединяет дату и время в один объект.
- Создание объекта `LocalDateTime`:
  ```java
  LocalDateTime currentDateTime = LocalDateTime.now();
  LocalDateTime specificDateTime = LocalDateTime.of(2022, 1, 27, 12, 30, 45);
  ```

- Основные методы:
  ```java
  LocalDate date = currentDateTime.toLocalDate();
  LocalTime time = currentDateTime.toLocalTime();
  ```

- Манипуляции с датой и временем:
  ```java
  LocalDateTime futureDateTime = currentDateTime.plusWeeks(2);
  LocalDateTime pastDateTime = currentDateTime.minusMonths(1);
  ```

### Общие замечания:
- Все классы находятся в пакете `java.time`.
- Объекты этих классов являются неизменяемыми, поэтому любые манипуляции возвращают новые объекты.
- Для форматирования и парсинга дат и времени используйте `DateTimeFormatter`.

Пример использования `DateTimeFormatter`:
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = currentDateTime.format(formatter);
LocalDateTime parsedDateTime = LocalDateTime.parse("2022-01-27 12:30:45", formatter);
```

## Работа с ветками:

### 1. Работа с ветками (Branches):
- Ветка (Branch) представляет собой отдельную линию разработки в репозитории.
- Команды для работы с ветками:
  - Создание новой ветки:
    ```bash
    git branch <branch_name>
    ```

  - Переключение на другую ветку:
    ```bash
    git checkout <branch_name>
    ```

  - Создание и переключение на новую ветку (в одной команде):
    ```bash
    git checkout -b <new_branch_name>
    ```

  - Просмотр списка веток:
    ```bash
    git branch
    ```

### 2. Слияние веток (Merge):
- Команда `git merge` позволяет объединить изменения из одной ветки в другую.
- Процедура слияния:
  1. Переключение на целевую ветку (`git checkout target_branch`).
  2. Запуск команды слияния (`git merge source_branch`).
  3. Разрешение возможных конфликтов.

- Пример слияния:
  ```bash
  git checkout main  # Переключение на ветку main
  git merge feature_branch  # Слияние изменений из feature_branch в main
  ```

### 3. Разрешение конфликтов:
- Конфликт возникает, когда Git не может автоматически слить изменения из-за различий в одном и том же месте кода.
- Процесс разрешения конфликта:
  1. Git помечает файлы с конфликтами.
  2. Ручное редактирование файла для разрешения конфликта.
  3. Пометка конфликта как разрешенного (`git add <conflicted_file>`).
  4. Завершение процесса слияния (`git merge --continue`).

- Пример разрешения конфликта:
  ```bash
  # В процессе слияния возник конфликт в файле example.txt
  # Ручное редактирование файла для разрешения конфликта
  git add example.txt  # Пометка файла как разрешенного
  git merge --continue  # Завершение слияния после разрешения конфликта
  ```

### Общие замечания:
- Важно поддерживать актуальность веток и регулярно обновлять их из основной ветки (частые `git pull`).
- Работа в отдельных ветках позволяет избежать конфликтов при одновременной работе нескольких разработчиков.
- Использование инструментов для визуализации и анализа истории репозитория (например, `git log`, `gitk`, и т.д.) помогает легче управлять ветками и слияниями.