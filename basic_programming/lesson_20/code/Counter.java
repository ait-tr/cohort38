package static_overload;

public class Counter {
    public static int count = 0;

    public void incr(){
        Counter.count++;
    }
}
