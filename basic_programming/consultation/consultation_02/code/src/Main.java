import java.util.HashMap;
import java.util.Map;

/**
 * 1/26/2024
 * consultation_sidikov_02
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        // создали мапу, где ключ - это строка, а значение - это число
        HashMap<String, Integer> ages = new HashMap<>();

        // put
        ages.put("Denis",     26);
        ages.put("Ruslan",    50);
        ages.put("Виктория",  27);
        ages.put("Lina",      44);
        ages.put("Andrej",    40);
        ages.put("Ekaterina", 38);
        ages.put("Alexandra", 26);
        ages.put("Klym",      34);
        ages.put("Yuri",      38);
        ages.put("Arseni",    37);
        ages.put("Marsel",    29);
        ages.put("Marsel",    30);

        // containsKey
        System.out.println("containsKey()");
        System.out.println(ages.containsKey("Lina")); // true
        System.out.println(ages.containsKey("Marsel")); // true
        System.out.println(ages.containsKey("Maxim")); // false

        // containsValue
        System.out.println("containsValue()");
        System.out.println(ages.containsValue(17)); // false
        System.out.println(ages.containsValue(38)); // true

        // get
        System.out.println("get()");
        System.out.println(ages.get("Marsel")); // 30
        System.out.println(ages.get("Denis")); //26
        System.out.println(ages.get("Maxim")); // null
    }
}
