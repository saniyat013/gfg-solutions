package com.saniyat.problemSolving.gfgSolutions.arrays.moveAllZerosToEnd;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        pushZerosToEnd(arr);

        System.out.println("Updated Array: " + Arrays.toString(arr));

    }

    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
