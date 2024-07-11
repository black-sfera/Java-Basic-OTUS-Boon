package ru.otus.java.basic.lesson3;

public class Lesson3App {
    public static void main(String[] args) {
        greetings();
        checkSing(50,20,-15);
        checkSing(-30,10,20);
        checkSing(15,5,-40);
        selectColor(5);
        selectColor(10);
        selectColor(15);
        selectColor(25);
        compareNumbers(20,10);
        compareNumbers(15,20);
        compareNumbers(20,20);
        addOrSubtractAndPrint(10,5,true);
        addOrSubtractAndPrint(30,50,false);
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
//        System.out.println("Hello\nWorld\nfrom\nJava"); так тоже работает.
    }
    public static void checkSing(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor(int data){
        if (data <= 10){
            System.out.println("Красный");
        } else if (data >= 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b){
        if (a >= b){
            System.out.println("a >= b");

    } else {

        System.out.println("a < b");

            }
        }
        public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
            int sum = initValue + delta;
        if (increment == true || false) {

            System.out.println(sum);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
        }
}
