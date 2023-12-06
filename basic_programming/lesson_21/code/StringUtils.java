package overload;

public class StringUtils {

    public static boolean isPalindrom(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static int count(String str, char target){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target){
                count++;
            }
        }
        return count;
    }
}
