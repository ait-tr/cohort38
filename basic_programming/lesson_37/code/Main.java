import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        TeamLead<Worker> teamLead = new TeamLead<>(new Worker());
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        number.add(12);
        number.add(22);
        number.add(32);
        number.add(22);
        number.add(55);
        number.add(22);
        number.add(10);

        for (int elem: number) {
            if (!result.contains(elem)){
                result.add(elem);
            }
        }
        System.out.println(result);
        // написать цикл, который формирует массив, у которого нет дублей
        // на основе numbers
    }
}

