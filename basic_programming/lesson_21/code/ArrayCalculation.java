package overload;

public class ArrayCalculation {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static double sum(){
        int sum = 0;
        for (int num : ArrayCalculation.numbers){
            sum += num;
        }
        return sum;
    }

    public static double avg(){
        return sum() / ArrayCalculation.numbers.length;
    }

    public static double max(){
        double result = ArrayCalculation.numbers[0];
        for (int num : ArrayCalculation.numbers){
            if (num > result){
                result = num;
            }
        }
        return result;
    }

    public static double min(){
        double result = ArrayCalculation.numbers[0];
        for (int num : ArrayCalculation.numbers){
            if (num < result){
                result = num;
            }
        }
        return result;
    }

}
