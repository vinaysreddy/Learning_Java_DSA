package recursion_A_to_Z.sorting;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        selectionSortRecur(arr, 0, arr.length - 1);
    }

    private static void selectionSortRecur(int[] arr, int s, int e) {
        if (e == 0) {
            System.out.println("selectionSortusing recursion " + Arrays.toString(arr));
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

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
