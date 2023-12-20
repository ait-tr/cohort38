package test;

public class Test {
    public int[] list;
    public Test(int[] list){
        this.list = list;
    }

    public int get(boolean type){
        int result = this.list[0];
        for (int elem: this.list) {
            if (result < elem == type){
                result = elem;
            }
        }
        return result;
    }

}

// удалить эти два метода

// создать метод get который если получает в качестве аргумента true возвращает максимальное
// а если false, то минимальное