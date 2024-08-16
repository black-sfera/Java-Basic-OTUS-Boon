package ru.otus.java.basic.lesson7;

import java.util.Arrays;

public class lesson7App {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {0, 4, 2}};
        int result = sumOfPositiveElements(array);
        System.out.println("Сумма элементов массива " + result);

        drawing(4);
        int[][] arr2 = new int[5][5];
        fill2DArray(arr2, 5);
        print2DArray(arr2);

        diagonalZeros(arr2);
        print2DArray(arr2);

        int result2 = findMax(array);
        System.out.println("Максимальный элемент массива " + result2);

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

    public static void fill2DArray(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
            }
        }
    }

    public static void print2DArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void diagonalZeros(int[][] input) {
        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[i].length; j++){
                if (i == j) {
                    input[i][j] = 0;
                }
                if (j == input.length - 1 - i) {
                    input[i][j] = 0;
                }
            }
        }
    }
    public static int findMax(int[][] array) {
        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (maxElement < array[i][j]) {
                maxElement = array[i][j];
            }
        }
        }
        return maxElement;
    }
}