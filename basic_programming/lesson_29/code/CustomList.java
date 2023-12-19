import org.w3c.dom.ls.LSOutput;

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
        copyArray(this.list, newList);
        newList[newList.length - 1] = numb;
        this.list = newList;
    }

    public int getMax(){
        int result = this.list[0];
        for (int elem: this.list) {
            if (elem > result){
                result = elem;
            }
        }
        return result;
    }

    public int pop(){
        int[] newArray = new int[this.list.length - 1];
        int lastElem = this.list[this.list.length - 1];
        copyArray(this.list, newArray);
        this.list = newArray;
        return lastElem;
    }

    private void copyArray(int[] init, int[] result){
        int minLength = (init.length > result.length) ? result.length : init.length;

        for (int i = 0; i < minLength; i++) {
            result[i] = init[i];
        }
    }

    public void remove(int value){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }


    public void remove2(int value){
        int index = indexOf(value);
        if (index != -1){
            shiftByIndex(index);
            pop();
        }
    }

    public void removeRight(int value){
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }

    public void removeAll(int value){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
            }
        }
    }

    public void removeAll2(int value){
        int i = 0;
        while (i < this.list.length){
            if (this.list[i] == value){
                shiftByIndex(i);
                pop();
            }else{
                i++;
            }
        }
    }

    private void shiftByIndex(int index){
        for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i+1];
        }
    }

    public void removeByIndex(int index){
        if (index < 0 || index >= this.list.length){
            System.out.println("Вы указали неверный индекс");
        } else {
            shiftByIndex(index);
            pop();
        }
    }

    public void removeAllByIndex(int index){
        if (index >= 0 && index < this.list.length){
            int target = this.list[index];
            removeAll2(target);
        } else {
            System.out.println("Вы указали неверный индекс");
        }
    }

    public void reverse(){
        int i = 0;
        while (i < this.list.length - 1 - i){
            int tmp = this.list[i];
            this.list[i] = this.list[this.list.length - 1 - i];
            this.list[this.list.length - 1 - i] = tmp;
            i++;
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - 1 - i; j++) {
                if (this.list[j] > this.list[j + 1]){
                    int tmp = this.list[j];
                    this.list[j] = this.list[j + 1];
                    this.list[j + 1] = tmp;
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < this.list.length; i++) {
            int max = this.list[0];
            int maxIndex = 0;
            for (int j = 0; j < this.list.length - i; j++) {
                if (max < this.list[j]){
                    max = this.list[j];
                    maxIndex = j;
                }
                System.out.printf("%d ", this.list[j]);
            }
            System.out.printf("max: %d (%d)%n", max, maxIndex);
        }
    }
}

// помимо максимального значения выводить еще и индекс этого максимального значения