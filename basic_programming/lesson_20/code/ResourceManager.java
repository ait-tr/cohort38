package static_overload;

public class ResourceManager {

    private static boolean access;

    public static void changeAccess(){
        ResourceManager.access = !ResourceManager.access;
    }

    private String message;
    public ResourceManager(String message){
        this.message = message;
    }

    public String getMessage(){
        if (ResourceManager.access){
            return this.message;
        }else{
            return "Permission denied";
        }
//        return  ResourceManager.access ? this.message : "Permission denied";
    }
}


