public class CustomStringList {
    private String[] list;

    public CustomStringList(String[] init){
        this.list = init;
    }

    public boolean check(String string){
        for (String elem: this.list) {
            if (elem.equals(string)){
                return true;
            }
        }
        return false;
    }

    public boolean check(String[] strings){
        for (String string: strings) {
            if (!check(string)){
                return false;
            }
        }
        return true;
    }

    public String longestWord(){
        String result = this.list[0];

        for (String string: this.list) {
            if (string.length() > result.length()){
                result = string;
            }
        }
        return result;
    }

    public void add(String value){
        String[] newList = new String[this.list.length + 1];

        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }

        newList[newList.length - 1] = value;

        this.list = newList;
    }

    public void addIfNotExists(String value){
        if (check(value)){
            System.out.printf("Строка %s в массиве уже есть%n", value);
        }else{
            add(value);
        }
    }
}
