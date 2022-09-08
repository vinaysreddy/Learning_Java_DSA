package Sorting;

import java.util.Arrays;

/* Selection sort : select the largest/smallest number in the array and keep it in its correct position

   Time Complexity : both are same
   -> worst case : o(n^2)
   -> best case -> o(n^2)

   Stability = no

   why Selection sort :
    -> performs well on small lists/arrays

 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last_index);
            swap(arr, maxIndex, last_index);
        }
    }

    static int getMaxIndex(int[] arr, int start, int last_index) {
        int max = start;
        for (int i = start; i <= last_index; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxIndex, int last_index) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last_index];
        arr[last_index] = temp;

    }
}
