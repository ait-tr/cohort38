
Чтение данных из файла в Java можно осуществить с использованием класса `File` в сочетании с классами для чтения данных, такими как `FileReader` и `BufferedReader`. Вот простой конспект по этой теме:

1. **Импорт необходимых пакетов:**
   ```java
   import java.io.File;
   import java.io.FileReader;
   import java.io.BufferedReader;
   import java.io.IOException;
   ```

2. **Создание объекта `File`:**
   ```java
   File file = new File("путь_к_вашему_файлу.txt");
   ```

3. **Проверка существования файла:**
   ```java
   if (file.exists()) {
       // Файл существует
   } else {
       // Файл не существует
   }
   ```

4. **Чтение данных с использованием `FileReader` и `BufferedReader`:**
   ```java
   try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {

       String line;
       while ((line = bufferedReader.readLine()) != null) {
           // Обработка каждой строки данных
           System.out.println(line);
       }

   } catch (IOException e) {
       // Обработка исключений, таких как IOException
       e.printStackTrace();
   }
   ```

   Здесь мы используем блок `try-with-resources` для автоматического закрытия ресурсов (`FileReader` и `BufferedReader`) после их использования.

5. **Обработка исключений:**
   В блоке `try-catch` обрабатываем возможные исключения, которые могут возникнуть при чтении файла, например, `IOException`.

6. **Закрытие потоков:**
   В блоке `try-with-resources` потоки автоматически закрываются при выходе из блока, поэтому не нужно явно вызывать метод `close()`.

Это основной шаблон для чтения данных из файла в Java. Убедитесь, что указываете правильный путь к файлу и обрабатываете данные в соответствии с вашими потребностями.

## Набор основных методов для работы с файлами


1. boolean createNewFile(): создает новый файл по пути, который передан в конструктор. В случае удачного создания возвращает true, иначе false

   ```java
   File newFile = new File("C:\\Example\\newFile.txt");
   try {
       boolean created = newFile.createNewFile();
       System.out.println("File created: " + created);
   } catch (IOException e) {
       e.printStackTrace();
   }
   ```

2. boolean delete(): удаляет каталог или файл по пути, который передан в конструктор. При удачном удалении возвращает true.
   ```java
   File fileToDelete = new File("C:\\Example\\fileToDelete.txt");
   boolean deleted = fileToDelete.delete();
   System.out.println("File deleted: " + deleted);
   ```

3. boolean exists(): проверяет, существует ли по указанному в конструкторе пути файл или каталог. И если файл или каталог существует, то возвращает true, иначе возвращает false
   ```java
   File fileToCheck = new File("C:\\Example\\existingFile.txt");
   boolean exists = fileToCheck.exists();
   System.out.println("File exists: " + exists);
   ```

4. String getAbsolutePath(): возвращает абсолютный путь для пути, переданного в конструктор объекта

   ```java
   File file = new File("relativePath\\example.txt");
   String absolutePath = file.getAbsolutePath();
   System.out.println("Absolute Path: " + absolutePath);
   ```

5. String getName(): возвращает краткое имя файла или каталога
   ```java
   File file = new File("C:\\Example\\example.txt");
   String fileName = file.getName();
   System.out.println("File Name: " + fileName);
   ```

6. String getParent(): возвращает имя родительского каталога
   ```java
   File file = new File("C:\\Example\\example.txt");
   String parentDirectory = file.getParent();
   System.out.println("Parent Directory: " + parentDirectory);
   ```

7. boolean isDirectory(): возвращает значение true, если по указанному пути располагается каталог
   ```java
   File directory = new File("C:\\Example\\Directory");
   boolean isDir = directory.isDirectory();
   System.out.println("Is Directory: " + isDir);
   ```


8. boolean isFile(): возвращает значение true, если по указанному пути находится файл
   ```java
   File file = new File("C:\\Example\\example.txt");
   boolean isFile = file.isFile();
   System.out.println("Is File: " + isFile);
   ```

9. boolean isHidden(): возвращает значение true, если каталог или файл являются скрытыми
   ```java
   File hiddenFile = new File("C:\\Example\\.hiddenFile");
   boolean isHidden = hiddenFile.isHidden();
   System.out.println("Is Hidden: " + isHidden);
   ```


10. long length(): возвращает размер файла в байтах
    ```java
    File file = new File("C:\\Example\\example.txt");
    long fileSize = file.length();
    System.out.println("File Size: " + fileSize + " bytes");
    ```

11. long lastModified(): возвращает время последнего изменения файла или каталога. Значение представляет количество миллисекунд, прошедших с начала эпохи Unix
    ```java
    File file = new File("C:\\Example\\example.txt");
    long lastModifiedTime = file.lastModified();
    System.out.println("Last Modified: " + lastModifiedTime);
    ```

12. String[] list(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    ```java
    File directory = new File("C:\\Example");
    String[] fileList = directory.list();
    for (String fileName : fileList) {
        System.out.println(fileName);
    }
    ```


13. File[] listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    ```java
    File directory = new File("C:\\Example");
    File[] files = directory.listFiles();
    for (File file : files) {
        System.out.println(file.getName());
    }
    ```

14. boolean mkdir(): создает новый каталог и при удачном создании возвращает значение true
    ```java
    File newDirectory = new File("C:\\Example\\NewDirectory");
    boolean created = newDirectory.mkdir();
    System.out.println("Directory created: " + created);
    ```


15. boolean renameTo(File dest): переименовывает файл или каталог
    ```java
    File oldFile = new File("C:\\Example\\oldFile.txt");
    File newFile = new File("C:\\Example\\newFile.txt");
    boolean renamed = oldFile.renameTo(newFile);
    System.out.println("File renamed: " + renamed);
    ```