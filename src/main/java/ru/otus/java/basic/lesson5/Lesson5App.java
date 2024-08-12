package ru.otus.java.basic.lesson5;

import java.util.Arrays;

public class Lesson5App {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2};
        int[] arr3 = {1, 3, 5, 2, 4};
        int[] arr4 = {2, 4};
        int[] result = sumArrays(arr1, arr2, arr3, arr4);
        System.out.println(Arrays.toString(result));

        int[] arr = {1, 1, 3, 5};
        int[] arr5 = {2, 7, 4, 5, 7};
        pointSearch(arr);
        pointSearch(arr5);
        pointSearch(result);

        int[] add = {1, 2, 3, 4, 5, 6, 7};
        ascendingMethod();

        int[] agg = {1, 2, 3, 4, 5};


        int[] result1 = turningOver(agg);
        System.out.println(Arrays.toString(agg));
        System.out.println(Arrays.toString(result1));
    }

    public static int[] sumArrays(int[]... arrays) {
        int maxLength = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > maxLength) {
                maxLength = arrays[i].length;
            }
        }

        int[] arr1 = new int[maxLength];

        for (int i = 0; i < arrays.length; i++) {
            int[] arr2 = arrays[i];
            for (int j = 0; j < arr2.length; j++) {
                arr1[j] += arr2[j];
            }
        }

        return arr1;
    }

    public static void pointSearch(int[] arr) {

        boolean quality = false;

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            int point = i;
            for (int j = 0; j <= point; j++) {
                leftSum += arr[j];
            }
            for (int k = point + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            boolean quality1 = leftSum == rightSum;
            if (quality1) {
                quality = true;
            }

        }

        if (quality) {
            System.out.println("Точка есть");

        } else {
            System.out.println("Точки нет");
        }

    }

    public static void ascendingMethod() {
        int[] add = {1, 2, 3, 4, 5, 6, 7};
        boolean allElements = true;
        for (int i = 0; i < add.length - 1; i++) {
            int that = add[i];
            int next = add[i + 1];
            if (that > next) {
                allElements = false;
            }
        }
        if (allElements) {
            System.out.println("Все элементы масива идут в порядке возрастания");
        } else {
            System.out.println("Все элементы масива не идут в порядке возрастания");
        }
    }


    public static int[] turningOver(int[] agg) {

        int[] agg1 = new int[agg.length];
        for (int i = 0; i < agg.length; i++) {
            agg1[agg.length - 1 - i] = agg[i];
            System.out.println("Значение слева " + agg1[agg.length - 1 - i] + " индекс " + (agg.length - 1 - i));
            System.out.println("Значение справа " + agg[i] + " индекс " + (i));

        }
        return agg1;
    }

}
