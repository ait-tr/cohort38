/*
создать класс Out который содержит свойство value
метод print, который его выводит
метод compareTo, который получает в качестве
аргумента значение того же типа и возвращает
true, если они одинаковые и false в ином случае
 */
public class Out <N>{
    private N value;
    public Out(N value) {
        this.value = value;
    }
    public void print(){
        System.out.println(this.value);
    }
    public boolean compareTo(N compareValue){
        return this.value == compareValue;
    }
}
