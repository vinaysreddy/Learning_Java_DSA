package demo;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
//        bubbleSort(arr);
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));

//        bubbleRecursion(arr, 0, arr.length - 1);
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            }
        }
        System.out.printf(max + "  mnax");

    }

    private static void bubbleRecursion(int[] arr, int s, int e) {

        if (e == 0) {
            System.out.printf("bubble sort with recursion  " + Arrays.toString(arr));
            return;
        }

        if (s < e) {
            if (arr[s] > arr[s + 1]) {
                swap(arr[s], arr[s + 1]);
            }
            bubbleRecursion(arr, s + 1, e);
        } else {
            bubbleRecursion(arr, s, e - 1);
        }

    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
