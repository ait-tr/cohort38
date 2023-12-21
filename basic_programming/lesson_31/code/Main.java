public class Main {

    public static void main(String[] args) {
        CustomList customList = new CustomList(new int[]{4, -3, 15, -6, 13, 26, -5, 2});
        System.out.println(customList);
        customList.insertionSort();
        System.out.println(customList);

    }
}