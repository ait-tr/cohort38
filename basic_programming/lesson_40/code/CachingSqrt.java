import java.util.HashMap;

public class CachingSqrt {

    public static HashMap<Double, Double> cache = new HashMap<>();


    public static double sqrt(double value){
        double result = Math.pow(value, 2);
        cache.put(value, result);
        return result;
    }

    public static double cacheSqrt(double value){
        if (cache.containsKey(value)){
            return cache.get(value);
        }else{
            return sqrt(value);
        }
    }
}
