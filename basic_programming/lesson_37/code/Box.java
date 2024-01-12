public class Box <T extends Number> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get(){
        return this.value;
    }
    public void set(T value){
        this.value = value;
    }
}
