public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }
    public void put(T value){
        this.content = value;
    }
    public T get(){
        return this.content;
    }
}