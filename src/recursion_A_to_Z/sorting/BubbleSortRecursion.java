package recursion_A_to_Z.sorting;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        bubbleRecursion(arr, 0, arr.length - 1);
        selectionSortRecur(arr, 0, arr.length - 1);
    }


    static void selectionSortRecur(int[] arr, int s, int e) {
        if (e == 0) {
            System.out.println("selectionSortRecur  " + Arrays.toString(arr));
            return;
        }

        int maxIndex = 0;
        for (int i = 1; i <= e; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        swap(arr, maxIndex, e);
        selectionSortRecur(arr, 0, e - 1);
    }

    static void bubbleRecursion(int[] arr, int s, int e) {

        if (e == 0) {
            System.out.println("bubble sort with recursion  " + Arrays.toString(arr));
            return;
        }

        if (s < e) {
            if (arr[s] > arr[s + 1]) {
                swap(arr, s, s + 1);
            }
            bubbleRecursion(arr, s + 1, e);
        } else {
            bubbleRecursion(arr, 0, e - 1);
        }

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}