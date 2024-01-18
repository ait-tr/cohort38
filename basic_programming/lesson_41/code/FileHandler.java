import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
    private String path;

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
        try{
            boolean result = file.createNewFile();
            if (result){
                System.out.println("Файл успешно создан.");
            }else{
                System.out.printf("Файл [%s] уже существует.%n", this.path);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        File file = new File(this.path);
        return String.format(
                "%s (%d bytes) (path: %s)  %n",
                file.getName(),
                file.length(),
                file.getAbsolutePath()
        );
    }
}
