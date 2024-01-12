import java.util.Arrays;

public class GenericStack <T> {
    private T[] array = (T[]) new Object[0];

    public void push(T value){
        T[] newArray = (T[]) new Object[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[newArray.length - 1] = value;
        this.array = newArray;
    }

    public T pop(){
        if (this.array.length == 0){
            return null;
        }
        T[] newArray = (T[]) new Object[this.array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = this.array[i];
        }
        T target = this.array[this.array.length - 1];
        this.array = newArray;
        return target;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
