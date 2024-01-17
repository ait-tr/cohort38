import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Анатолий",
                "Ушанов",
                2300,
                Position.DEVELOPER,
                DayOfWeek.SUNDAY
        );

        System.out.println(employee);
        System.out.println(DayOfWeek.MONDAY.getNextDay());
    }

    public static void task_1(){
        //        System.out.println(letterCount("я люблю кататься на велосипеде"));
        CachingSqrt.sqrt(12);
        CachingSqrt.sqrt(10);
        CachingSqrt.sqrt(4);
        CachingSqrt.sqrt(2);
        System.out.println(CachingSqrt.cache);
    }

    public static HashMap<Character, Integer> letterCount(String message){
        HashMap<Character, Integer> result = new HashMap<>();
        for (char ch : message.toCharArray()){
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        return result;
    }
}

