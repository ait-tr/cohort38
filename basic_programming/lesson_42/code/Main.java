import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler users = new FileHandler("src/new_users_3.txt");
//        System.out.println(users.search("там"));
        users.write("Это новая строка из кода");
        users.writeFromTerminal();

    }

    public static void task_1(){
        System.out.println(Color.GREEN.getRGBCode());
        System.out.println(Coin.NICKEL.getValue());

        // создать ArrayList с набором монет и найти общую
        // сумму центов этого набора
        ArrayList<Coin> coins = new ArrayList<>();
        coins.add(Coin.NICKEL);
        coins.add(Coin.PENNY);
        coins.add(Coin.DIME);
        coins.add(Coin.NICKEL);
        coins.add(Coin.PENNY);
        coins.add(Coin.DIME);
//        int result = 0;
//        for (Coin coin: coins){
//            result += coin.getValue();
//        }
//        System.out.println(result);
        int result = coins
                .stream()
                .mapToInt(x -> x.getValue())
                .reduce(0, (acc, item) -> acc + item);
        System.out.println(result);
    }

    public static void task_2(){
        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(1, 4, 2, 5, 3, 4, 3, 4, 3, 4, 7)
        );
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);
    }
}