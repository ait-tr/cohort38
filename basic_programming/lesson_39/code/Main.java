import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        HashMap<String, String> dict = new HashMap<>();
//        dict.put("word", "слово");
//        dict.put("bike", "велосипед");
//        dict.put("ride", "водить");
//        dict.put("table", "таблица");
//
//        System.out.println(dict);
//
//        System.out.println(dict.get("ride"));
//
//        System.out.println(dict.values());
//        System.out.println(dict.keySet());

        Translator translator = new Translator();
        translator.addWord("word", "слово");
        translator.addWord("bike", "велосипед");
        translator.getWords();
/*
` Создать класс Translator
у этого класса есть приватное свойство с HashMap
метод addWord (получает два аргумента)
метод getTranslate (получает слово и возвращает перевод)

 */


    }

    public static void task_1(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(22);
        numbers.add(32);
        numbers.add(42);
        numbers.add(52);
        numbers.add(62);
        int result = numbers
                .stream()
                .reduce( 0, (acc, item) -> (int) (acc + Math.pow(item, 2)));
        System.out.println(result);
    }

    public static void task_2(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Анатолий");
        strings.add("Ольга");
        strings.add("Вячеслав");
        strings.add("Антон");
        strings.add("Иван");

        strings.stream()
               .filter(x -> x.length() > 5)
               .forEach(System.out::println);
    }

    public static void task_3(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(22);
        numbers.add(32);
        numbers.add(42);
        numbers.add(52);
        numbers.add(62);
        int result = numbers
                .stream()
                .reduce(0, (acc, item) -> acc > item? acc : item);
        System.out.println(result);
    }

    public static void task_4(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Анатолий");
        strings.add("Ольга");
        strings.add("Вячеслав");
        strings.add("Антон");
        strings.add("Иван");

        Optional<String> result = strings.stream()
               .reduce((acc, item) -> acc.length() > item.length()? acc : item);
        System.out.println(result.get());

    }

    public static void task_5(){
//        создать массив из 5 продуктов и]
//        найти сумму стоимостей всех продуктов, кол-во которых больше 0
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("велосипед", 12, 2300));
        products.add(new Product("ролики", 7, 700));
        products.add(new Product("самокат", 5, 1200));
        products.add(new Product("лыжи", 0, 1800));
        products.add(new Product("коньки", 10, 850));
        products.add(new Product("сноуборд", 0, 1500));

        int result = products
                .stream()
                .filter(x -> x.getCount() > 0)
                .mapToInt(x -> x.getPrice())
                .reduce(0, (acc, item) -> acc + item);


//        Stream<Product> stream_1 = products.stream();
//        Stream<Product> stream_2 = stream_1.filter(x -> x.getCount() > 0);
//        Stream<Integer> stream_3 = (Stream<Integer>) stream_2.mapToInt(x -> x.getPrice());
//        Integer result = stream_3.reduce(0, (acc, item) -> acc + item);

        System.out.println(result);
    }
/*
acc = Анатолий, item = Ольга
acc = Анатолий, item = Вячеслав
acc = Вячеслав, item = Антон
*/



}