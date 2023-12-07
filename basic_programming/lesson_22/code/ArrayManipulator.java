package inheritance;

public class ArrayManipulator {

    public static int sum(int[] array){
        int total = 0;
        for (int elem : array){
            total += elem;
        }
        return total;
    }

    public static double sum(double[] array){
        double total = 0;
        for (double elem : array){
            total += elem;
        }
        return total;
    }
}
