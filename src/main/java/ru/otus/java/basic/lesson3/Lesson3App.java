package ru.otus.java.basic.lesson3;

import java.util.Scanner;

public class Lesson3App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int task = scanner.nextInt();
        System.out.println("Вы ввели число: " + task);
        if (task == 1){
           greetings();
        } else if (task == 2) {
            int a = (int)(Math.random() *10);
            int b = (int)(Math.random() *10);
            int c = (int)(Math.random() *10);
            checkSing(a,b,c);
        } else if(task == 3) {
            int a = (int)(Math.random() *100);
            selectColor(a);
        } else if(task ==4) {
            int a = (int)(Math.random() *100);
            int b = (int)(Math.random() *10);
            compareNumbers(a,b);
        } else if(task == 5) {
            int a = (int)(Math.random() *100);
            int b = (int)(Math.random() *100);
            int c = (int)(Math.random() *10);
            addOrSubtractAndPrint(a,b,c>5);
        }else {
            System.out.println("Выбрана неизвестная операция");
        }
        System.out.println("Конец программы");

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
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
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
        if (increment) {
            int sum = initValue + delta;
            System.out.println(sum);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
        }
}
