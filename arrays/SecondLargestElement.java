package com.saniyat.problemSolving.gfgSolutions.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println("Second Largest Element: " + getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        int max = -1;
        int secondMax = -1;

        for (int value : arr) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value < max && value > secondMax) {
                secondMax = value;
            }
        }

        return secondMax;
    }
}
