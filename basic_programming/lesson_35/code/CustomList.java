import java.util.Iterator;

public class CustomList implements Iterable{
    private int[] array;
    public CustomList(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator iterator() {
        Iterator result = new CustomIterator(this.array);
        return result;
    }

}
