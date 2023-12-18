public class Main {

    public static void main(String[] args) {
        CustomList customList = new CustomList(new int[]{4, 3, 6, 6, 13, 6, 5, 2, 16});
        customList.removeAll2(6);
        System.out.println(customList);
    }
}