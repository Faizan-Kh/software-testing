package org.example;

public class ArrayUtils {
    public static int find(int[] arr) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                // Even number
                sumEven += num;
            } else {
                // Odd number
                sumOdd += num;
            }
        }

        return sumOdd - sumEven;
    }

}
