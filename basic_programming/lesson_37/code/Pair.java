public class Pair <F, S> {
    private F firstValue;
    private S secondValue;
    public Pair(F firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    public F getFirst(){
        return this.firstValue;
    }
    public S getSecond() {
        return secondValue;
    }
}
