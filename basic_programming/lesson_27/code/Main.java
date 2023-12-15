public class Main {

    public static void main(String[] args) {
        CustomList customList = new CustomList(new int[]{4, 3, 6, 13, 6, 5, 2, 16});
        customList.add(-3);
        customList.add(-3);
        customList.add(-3);
        customList.add(-3);

        System.out.println(customList);
    }
}