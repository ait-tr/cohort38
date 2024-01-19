import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHandler {
    private String path;
    public static void createFiels(ArrayList<String> list) {
        for (String path: list) {
            File file = new File(path);
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Файл создать не удалось: " + e.getMessage());
            }
        }
    }
    public FileHandler(String path) {
        this.path = path;
        createIfNotExists();
    }
    public String read() {
        try (Scanner scanner = new Scanner(new File(this.path))){
            String result = "";
            while (scanner.hasNextLine()){
                String newLine = scanner.nextLine();
                result += newLine + '\n';
            }
            scanner.close();
            return result;
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден: " + e.getMessage());
        }
        return "";
    }
    private void createIfNotExists(){
        File file = new File(this.path);
        boolean result = create(this.path);
        if (result){
            System.out.println("Файл успешно создан.");
        }else{
            System.out.printf("Файл [%s] уже существует.%n", this.path);
        }
    }
    private boolean create(String path) {
        File file = new File(path);
        try{
            return file.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    private String getLength(){
        int coef = 1000;
        File file = new File(this.path);
        long length = file.length();
        if (length < coef){
            return length + " bytes";
        }else if (length < Math.pow(coef, 2)){
            return String.format("%.2f KB", (double) length / coef);
        }else if (length < Math.pow(coef, 3)){
            return String.format("%.2f MB", (double) length / Math.pow(coef, 2));
        }else if (length < Math.pow(coef, 4)){
            return String.format("%.2f GB", (double) length / Math.pow(coef, 3));
        }else{
            return "ХВАТИТ!!";
        }
    }
    private String getLength2(){
        File file = new File(this.path);
        long length = file.length();

        HashMap<String, Double> sizePrefs = new HashMap<>();
        sizePrefs.put("bytes", 1.0);
        sizePrefs.put("KB", 1000.0);
        sizePrefs.put("MB", Math.pow(1000, 2));
        sizePrefs.put("GB", Math.pow(1000, 3));

        List<String> keyList = sizePrefs
                .keySet()
                .stream()
                .sorted(Comparator.comparing(x -> sizePrefs.get(x)))
                .toList();

        for (String pref : keyList){
            double resultSize = length / sizePrefs.get(pref);
            if (resultSize < 1000){
                return  String.format("%.2f %s", resultSize, pref);
            }
        }
        return "ХВАТИТ!!";
    }
    public boolean rename(String newName){
        File newFile = new File(newName);
        File file = new File(this.path);
        if (!newFile.exists()){
            boolean result = file.renameTo(newFile);
            if (result){
                this.path = newName;
            }
            return result;
        }
        return false;
    }
    public int search(String substring) {
        try (Scanner scanner = new Scanner(new File(this.path))){
            int rowNum = 1;
            while (scanner.hasNextLine()){
                String newLine = scanner.nextLine();
                if (newLine.contains(substring)){
                    return rowNum;
                }
                rowNum++;
            }
            scanner.close();
            return -1;
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден: " + e.getMessage());
        }
        return -1;
    }
    public void write(String string){
        try (FileWriter writer = new FileWriter(this.path, true)) {
            writer.append("\n" + string);
            System.out.println("Добавлена строка: " + string);
            writer.close();
        }catch (IOException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public void writeFromTerminal(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Укажите новую строку (END для выхода): ");
            String row = scanner.nextLine();
            if (row.equals("END")){
                break;
            }
            write(row);
        }
        scanner.close();
    }
    @Override
    public String toString() {
        File file = new File(this.path);
        return String.format(
                "%s (%s) (path: %s)  %n",
                file.getName(),
                getLength2(),
                file.getAbsolutePath()
        );
    }
}

// создать метод search, который открывает файл и возвращает ArrayList со строками
