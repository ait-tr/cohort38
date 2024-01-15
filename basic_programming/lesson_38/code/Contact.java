public class Contact {
    private String phone;
    private String name;

    public Contact(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public String info(){
        return String.format("%s (%s)", this.name, this.phone);
    }
}
