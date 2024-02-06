import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1/26/2024
 * consultation_sidikov_02
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        // считать текст и разбить его на слова
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); // считали текст
        String[] words = text.split(" "); // получили массив слов

        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (int i = 0; i < words.length; i++) { // пробегаем весь массив слов
            // words[i] - текущее слово в массиве
            // проверяем, нет ли этого слова еще в Map-e
            if (!wordsCount.containsKey(words[i])) {
                // если этого слова еще там нет, то кладем его со значением 1
                wordsCount.put(words[i], 1);
            } else {
                // а если слово уже есть?
                // нужно добавить к его значению в Map-е +1
                // получаем старое значение, которое уже было
                int count = wordsCount.get(words[i]);
                // увеличили старое количество на 1
                count++;
                // положили заново в Map-у
                wordsCount.put(words[i], count);
            }
        }

        // нужно посчитать, какому ключу соответствует самое большое значение

        // можно просто перебрать все пары
        int max = 0; // сколько раз встретилось слово
        String word = ""; // что именно это было за слово

        // организуем цикл, который пробегает все пары
        for (Map.Entry<String, Integer> pair : wordsCount.entrySet()) {
            if (pair.getValue() > max) { // если у текущей пары значение больше, чем максимум
                max = pair.getValue(); // это новый максимум
                word = pair.getKey(); // запоминаем это слово
            }
        }

        System.out.println("Чаще других встретилось <" + word + "> , а именно - " + max + " раз");

    }
}
