1. **Метод - `createFiles` (статический):**
   ```java
   public static void createFiles(ArrayList<String> list) {
       for (String path : list) {
           File file = new File(path);
           try {
               file.createNewFile();
           } catch (IOException e) {
               System.out.println("Файл создать не удалось: " + e.getMessage());
           }
       }
   }
   ```
   - Создает файлы на основе списка путей, переданных в параметре.
   - Для каждого пути создается объект `File`.
   - Вызывается метод `createNewFile()` для создания файла.
   - Обрабатываются исключения при возможных проблемах создания файла.

2. **Конструктор:**
   ```java
   public FileHandler(String path) {
       this.path = path;
       createIfNotExists();
   }
   ```
   - Инициализирует экземпляр `FileHandler` указанным путем.
   - Вызывает метод `createIfNotExists()` для создания файла, если он не существует.

3. **Метод - `read`:**
   ```java
   public String read() {
       try (Scanner scanner = new Scanner(new File(this.path))) {
           String result = "";
           while (scanner.hasNextLine()) {
               String newLine = scanner.nextLine();
               result += newLine + '\n';
           }
           scanner.close();
           return result;
       } catch (FileNotFoundException e) {
           System.out.println("Файл не найден: " + e.getMessage());
       }
       return "";
   }
   ```
   - Считывает содержимое файла и возвращает его в виде строки.
   - Используется `Scanner` для чтения файла по строкам.
   - Обрабатывается исключение, если файл не найден.

4. **Приватный метод - `createIfNotExists`:**
   ```java
   private void createIfNotExists() {
       File file = new File(this.path);
       boolean result = create(this.path);
       if (result) {
           System.out.println("Файл успешно создан.");
       } else {
           System.out.printf("Файл [%s] уже существует.%n", this.path);
       }
   }
   ```
   - Проверяет существование файла и создает его, если он не существует.
   - Использует метод `create`, который возвращает `true` при успешном создании файла.
   - Выводит сообщение о результате.

5. **Приватный метод - `create`:**
   ```java
   private boolean create(String path) {
       File file = new File(path);
       try {
           return file.createNewFile();
       } catch (IOException e) {
           System.out.println(e.getMessage());
           return false;
       }
   }
   ```
   - Пытается создать файл по указанному пути.
   - Возвращает `true`, если файл успешно создан, и `false` в противном случае.
   - Обрабатывает исключение, если возникают проблемы при создании файла.

6. **Приватный метод - `getLength`:**
   ```java
   private String getLength() {
       int coef = 1000;
       File file = new File(this.path);
       long length = file.length();
       if (length < coef) {
           return length + " байт";
       } else if (length < Math.pow(coef, 2)) {
           return String.format("%.2f КБ", (double) length / coef);
       } else if (length < Math.pow(coef, 3)) {
           return String.format("%.2f МБ", (double) length / Math.pow(coef, 2));
       } else if (length < Math.pow(coef, 4)) {
           return String.format("%.2f ГБ", (double) length / Math.pow(coef, 3));
       } else {
           return "ХВАТИТ!!";
       }
   }
   ```
   - Вычисляет размер файла в человекочитаемом формате.
   - Использует условия для определения единиц измерения (байты, КБ, МБ, ГБ).
   - Возвращает строку с размером файла.

7. **Приватный метод - `getLength2`:**
   ```java
   private String getLength2() {
       File file = new File(this.path);
       long length = file.length();

       HashMap<String, Double> sizePrefs = new HashMap<>();
       sizePrefs.put("байт", 1.0);
       sizePrefs.put("КБ", 1000.0);
       sizePrefs.put("МБ", Math.pow(1000, 2));
       sizePrefs.put("ГБ", Math.pow(1000, 3));

       List<String> keyList = sizePrefs
               .keySet()
               .stream()
               .sorted(Comparator.comparing(x -> sizePrefs.get(x)))
               .toList();

       for (String pref : keyList) {
           double resultSize = length / sizePrefs.get(pref);
           if (resultSize < 1000) {
               return String.format("%.2f %s", resultSize, pref);
           }
       }
       return "ХВАТИТ!!";
   }
   ```
   - Вычисляет размер файла, используя более структурированный подход с использованием `HashMap`.
   - Задает предпочтения размеров (байты, КБ, МБ, ГБ) и сортирует их по возрастанию.
   - Возвращает строку с размером файла.

8. **Метод - `rename`:**
   ```java
   public boolean rename(String newName) {
       File newFile = new File(newName);
       File file = new File(this.path);
       if (!newFile.exists()) {
           boolean result = file.renameTo(newFile);
           if (result) {
               this.path = newName;
           }
           return result;
       }
       return false;
   }
   ```
   - Переименовывает файл, связанный с `FileHandler`, в указанное новое имя.
   - Проверяет, существует ли файл с новым именем, и, если нет, пытается переименовать.
   - Обновляет поле `path` экземпляра при успешном переименовании.

9. **Метод - `search`:**
   ```java
   public int search(String substring) {
       try (Scanner scanner = new Scanner(new File(this.path)))

 {
           int rowNum = 1;
           while (scanner.hasNextLine()) {
               String newLine = scanner.nextLine();
               if (newLine.contains(substring)) {
                   return rowNum;
               }
               rowNum++;
           }
           scanner.close();
           return -1;
       } catch (FileNotFoundException e) {
           System.out.println("Файл не найден: " + e.getMessage());
       }
       return -1;
   }
   ```
   - Поиск подстроки в содержимом файла.
   - Возвращает номер строки, если подстрока найдена, и -1 в противном случае.
   - Обрабатывает исключение, если файл не найден.

10. **Метод - `write`:**
    ```java
    public void write(String string) {
        try (FileWriter writer = new FileWriter(this.path, true)) {
            writer.append("\n" + string);
            System.out.println("Добавлена строка: " + string);
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    ```
    - Добавляет строку в конец файла.
    - Использует `FileWriter` для записи в файл.
    - Выводит сообщение о добавленной строке и обрабатывает исключение, если возникают проблемы с записью.

11. **Метод - `writeFromTerminal`:**
    ```java
    public void writeFromTerminal() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Укажите новую строку (END для выхода): ");
            String row = scanner.nextLine();
            if (row.equals("END")) {
                break;
            }
            write(row);
        }
        scanner.close();
    }
    ```
    - Позволяет пользователю вводить новые строки с терминала до тех пор, пока не введено "END".
    - Вызывает метод `write` для добавления введенной строки в файл.

12. **Метод переопределения - `toString`:**
    ```java
    @Override
    public String toString() {
        File file = new File(this.path);
        return String.format(
                "%s (%s) (путь: %s)  %n",
                file.getName(),
                getLength2(),
                file.getAbsolutePath()
        );
    }
    ```
    - Переопределяет метод `toString` для предоставления отформатированной строки, представляющей экземпляр `FileHandler`.
    - Выводит имя файла, его размер (пользуясь `getLength2()`), и абсолютный путь.