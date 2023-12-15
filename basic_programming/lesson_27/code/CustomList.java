import java.util.Arrays;

public class CustomList {
    private int[] list;

    public CustomList(int[] array){
        this.list = array;
    }
    public CustomList(){
        this.list = new int[0];
    }

    @Override
    public String toString(){
        return Arrays.toString(this.list);
    }


    public int indexOf(int number){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == number){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int numb){
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == numb){
                return i;
            }
        }
        return  -1;
    }

    public int get(int index, int number){
        if (index >= 0 && index < this.list.length){
            return this.list[index];
        }else{
            return number;
        }
    }

    public int get(int index){
        return get(index, 0);
    }

    public void add(int numb){
        int[] newList = new int[this.list.length + 1];

        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }

        newList[newList.length - 1] = numb;
        this.list = newList;
    }

}