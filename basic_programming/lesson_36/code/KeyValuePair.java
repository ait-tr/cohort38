public class KeyValuePair <K, V> implements Pair<K, V>{
    private K key;
    private V value;
    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey(){
        return this.key;
    }
    @Override
    public V getValue(){
        return this.value;
    }
    @Override
    public void setKey(K key) {
        this.key = key;
    }
    @Override
    public void setValue(V value) {
        this.value = value;
    }
}


// добавить методы setKey и setValue