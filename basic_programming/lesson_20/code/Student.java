package static_overload;

public class Student {
    private static int idCounter = 0;
    public String name;
    public int id;
    public Student(String name){
        this.name = name;
        this.id = getNewId();
    }

    private int getNewId(){
        Student.idCounter++;
        return Student.idCounter;
    }
}

// реализовать приватный метод getId
// который увеличивает статическое свойство idCounter
// и возвращает новое значение

// используйте getId в конструкторе для формирования
// индетификатора студента
