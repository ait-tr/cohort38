public class Box_1 <T extends Fruit>{
    private T value;

    public Box_1(T value) {
        this.value = value;
    }

    public void getDetails(){
        this.value.getDetails();
    }
}
