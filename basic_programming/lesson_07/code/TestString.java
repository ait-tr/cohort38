package string;

import java.util.Scanner;

public class TestString {
//---------------------------------------------------------------------------------------
    // перевод строки в массив символов
    // перевод массива символов в строку
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        String str = scanner.nextLine();
//        String word = "Hello Amigo!";
//        System.out.println(word);
//        System.out.println(str);
//        // создание строки
//        char[] letters = word.toCharArray();
//
//        char[] wordArray = {'h', 'e', 'l', 'l', 'o', ' ', 'A', 'l', 'e', 'x'};
//
//        String newWord = new String(wordArray);
        // создание строки из массива символов

//        System.out.println(letters.length);
//        System.out.println(word.length());
        // .length() - метод строки, чтобы взять длинну строки
//        System.out.println("--------------------");
//        System.out.print(letters[0]);
//        System.out.print(letters[1]);
//        System.out.print(letters[2]);
//        System.out.print(letters[3]);
//        System.out.print(letters[4]);
//        System.out.print(letters[5]);
//        System.out.print(letters[6]);
//        System.out.print(letters[7]);
//        System.out.print(letters[8]);
//        System.out.print(letters[9]);
//        System.out.print(letters[10]);
//        System.out.print(letters[11]);
//        System.out.println();
//        System.out.println(word);

//        System.out.println(wordArray.length);
//        System.out.println(newWord.length());
//        // .length() - метод строки, чтобы взять длинну строки
//        System.out.println("--------------------");
//        System.out.print(wordArray[0]);
//        System.out.print(wordArray[1]);
//        System.out.print(wordArray[2]);
//        System.out.print(wordArray[3]);
//        System.out.print(wordArray[4]);
//        System.out.print(wordArray[5]);
//        System.out.print(wordArray[6]);
//        System.out.print(wordArray[7]);
//        System.out.print(wordArray[8]);
//        System.out.print(wordArray[9]);
//        System.out.println();
//        System.out.println(newWord);
//
//    }
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
// получение символа из строки по индексу
//public static void main(String[] args) {
//    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    Scanner scanner = new Scanner(System.in);
//    char letter = alphabet.charAt(25);
//    // charAt() получение символа из строки по индексу. где число в скобках явлеэться индексом символа
////    char letter = scanner.nextLine().charAt(2);
//
//    System.out.println(letter);
//}
// ---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
    //перевод разных приметивных типов данных в строку
//    public static void main(String[] args) {
//        String a = String.valueOf(1);
//        String b = String.valueOf(12.0D);
//        String c = String.valueOf(123.4F);
//        String d = String.valueOf(123456L);
//        String s = String.valueOf(true);
//        String f = String.valueOf(false);
//// перевод строки "d" содержащую в себе приметивный тип long в массив символов
//        char [] array = d.toCharArray();
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(s);
//        System.out.println(f);
//    }
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
    // разделение строки на масив строк по конкретному символу
//    public static void main(String[] args) {
//        String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth;";
//        String students = "Andrej, Viktoria, Denis, Viktoria, Ekaterina, Michail";
//
//        String [] studentsArray = students.split(", ");
//        // работа split  по ", " показана на примере ниже
//        String [] array = {"Andrej,", "Viktoria", "Denis", "Viktoria", "Ekaterina", "Michail"};
//
//        String[] peopleArray = people.split("; ");
//
//        System.out.println(peopleArray[0]);
//        System.out.println(peopleArray[1]);
//        System.out.println(peopleArray[2]);
//        System.out.println(peopleArray[3]);
//
//        System.out.println("-------------Students-----------");
//        System.out.println(studentsArray[0]);
//        System.out.println(studentsArray[1]);
//        System.out.println(studentsArray[2]);
//        System.out.println(studentsArray[3]);
//        System.out.println(studentsArray[4]);
//        System.out.println(studentsArray[5]);
//        System.out.println("-------------Students-----------");
//    }
//---------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------
    //вывод индекса символа по символу
//    public static void main(String[] args) {
//        String alphabet = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
//
//        System.out.println(alphabet.indexOf('A'));
//        System.out.println(alphabet.indexOf('K'));
//        System.out.println(alphabet.indexOf('Z'));
////        System.out.println(alphabet.indexOf('a'));//-1
////        System.out.println(alphabet.indexOf('b'));//-1
//        System.out.println(alphabet.lastIndexOf('Z'));
//    }
//---------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------
    //нахождение субстрок (подстрок) в строке
    public static void main(String[] args) {
        String word = "Alex you are my friend!";

        //проверяет начинаеться ли строка с сочетания символов
        boolean e = word.startsWith("Ale");//true
        boolean e1 = word.startsWith("Iva");//false

        // содержит ли в себе строка сочетание символов
        boolean b = word.contains(" my");//true
        boolean b1 = word.contains("ers");//false

        //заканчиваеться ли строка сочетанием символов
        boolean c1 = word.endsWith("aaa");//false

        System.out.println(e);
        System.out.println(e1);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(c1);

//        System.out.println(word.length());

//        System.out.println(word.toLowerCase());
//        System.out.println(word.toUpperCase());
    }
//---------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------
    // конкантенация строк
//    public static void main(String[] args) {
//        String name = "Alex";
//        String space = " ";
//        String surname = "Artuhov";
//        String dot = ".";
//
//        String all = name + space + surname + dot;
//
//        System.out.println(all);
//        System.out.println(name + space + surname + dot);
//
//        System.out.println("My name: [" + name + "]");
//        System.out.println("My surname: [" + surname + "]");
//    }
// ---------------------------------------------------------------------------------------
}
