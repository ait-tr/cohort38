public enum Position {
    MANAGER(10),
    WORKER(15),
    DEVELOPER(20);

    public int tax;
    Position(int tax){
        this.tax = tax;
    }


}
