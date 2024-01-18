public enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    private final int red;
    private final int green;
    private final int blue;

    Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public String getRGBCode(){
        return String.format("rgb(%d, %d, %d)", red, green, blue);
    }
}
