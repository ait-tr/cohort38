public class Student {
    public String name;
    public int age;
    public int[] grades;
    public Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public Student(String name, int age) {
        this(name, age, new int[]{4, 3, 5, 3});
    }

    private double calculateAvgGrade(){
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.length;
    }

    public void addGrade(int grade){
        int[] newArray = new int[this.grades.length + 1];
        for (int i = 0; i < this.grades.length; i++) {
            newArray[i] = this.grades[i];
        }
        newArray[this.grades.length] = grade;
        this.grades = newArray;
    }

// 1) сформировать новый массив
// 1.1) проверить правильность индекса
// 2) переменстить туда элементы из старого
// 3) сдвинуть соответствующие элементы в право
// 4) поместить новую оценку в правильный индекс

    public void addGrade(int grade, int index){
        // 1) сформировать новый массив
        int[] newArray = new int[this.grades.length + 1];
        // 1.1) проверить правильность индекса
        if (newArray.length - 1 < index){
            System.out.println("Такого индекса нет");
            return;
        }
        // 2) переменстить туда элементы из старого
        for (int i = 0; i < this.grades.length; i++) {
            newArray[i] = this.grades[i];
        }
        // 3) сдвинуть соответствующие элементы в право
        for (int i = this.grades.length - 1; i >= 0 ; i--) {
            if (i >= index){
                newArray[i + 1] = newArray[i];
            }
        }
//        12, 6, 4, 8, 12 ,7, 3
//        12, 6, 4, 8 ,12, 7, 3, _
//        (-12, 3)

        // 4) поместить новую оценку в правильный индекс
        newArray[index] = grade;
        this.grades = newArray;
    }

    public String getAvgGrade() {
        return String.format("%.1f/5", calculateAvgGrade());
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }


    @Override
    public String toString(){
        return String.format("%s (возраст: %d, средняя оценка: %.2f)",
                this.name,
                this.age,
                calculateAvgGrade()
        );
    }


//    перегрузить метод addGrade
//    новый метод должен получать два аргумент (grade и index - в какой индекс подставиться оценка )
//    если индекс выходит за пределы нового массива вывести сообщение "Такого индекса нет"
//    в ином случаеподставить новую оценку по указанному индексу а все что правее сдвинуть в право

}
