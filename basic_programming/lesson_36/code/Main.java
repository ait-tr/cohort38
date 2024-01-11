public class Main {
    public static void main(String[] args) {
//        Box<String> box = new Box<>("message");
//        Box<Integer> box_1 = new Box<>(12);
//        System.out.println(box.get());
//        box.put("new message");
//        System.out.println(box.get());

//        Out<String> test_1 = new Out<>("message");
//        System.out.println(test_1.compareTo("message"));
//
//        Out<Integer> test_2 = new Out<>(12);
//        System.out.println(test_2.compareTo(12));
//
//        Out<Boolean> test_3 = new Out<>(true);
//        System.out.println(test_3.compareTo(false));
        Pair<String, Integer> pair1 = new KeyValuePair<>("key_1", 12);
        Pair<Boolean, Double> pair2 = new KeyValuePair<>(true, 2.4);

        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());
    }
}
/*
создать класс Out который содержит свойство value
метод print, который его выводит
метод compareTo, который получает в качестве
аргумента значение того же типа и возвращает
true, если они одинаковые и false в ином случае
 */