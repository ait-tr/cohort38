package static_overload;

public class Main {
    public static void main(String[] args) {
        ResourceManager test = new ResourceManager("secret");
        ResourceManager.changeAccess();
        System.out.println(test.getMessage());
        ResourceManager.changeAccess();
        System.out.println(test.getMessage());
        ResourceManager.changeAccess();
        System.out.println(test.getMessage());
        ResourceManager.changeAccess();
        System.out.println(test.getMessage());
    }
}

