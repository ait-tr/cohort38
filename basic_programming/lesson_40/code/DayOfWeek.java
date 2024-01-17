public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public DayOfWeek getNextDay(){
        int index = (this.ordinal() + 1) % values().length;
        return values()[index];
    }
    /*
    * values() -  получение всех дней недели в виде массива
    * ordinal() - получение индекса значения в наборе значений
    *
    * */

    /*

    реализовать процесс таким образом, чтобы он возвращал дни недели
    по кругу (после SUNDAY идет MONDAY)
     */
1 -> 1
2 -> 2
3 -> 3
4 -> 4
5 -> 0
6 -> 1
7 -> 2
8 -> 3
9 -> 4
10 -> 0

}
