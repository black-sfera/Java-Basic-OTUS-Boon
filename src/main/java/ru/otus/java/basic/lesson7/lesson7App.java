package ru.otus.java.basic.lesson7;

import java.util.Arrays;

public class lesson7App {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {0, 4, 2}};
        int result = sumOfPositiveElements(array);
        System.out.println("Сумма элементов массива " + result);


        drawing(4);


    }

    public static int sumOfPositiveElements(int[][] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] > 0) {
                    sum += input[i][j];
                    System.out.println(Arrays.deepToString(input));
                }
            }
        }
        return sum;
    }

    public static void drawing(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * " + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    

}