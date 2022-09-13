package demo;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 4, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        //run the steps n-1 times
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            //for each step max item will come at end of respective index
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                //compare: do swap
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j);
                    swap = true;
                }
            }
            //if u didnot swap for particular value of i,it means arr is sorted hence stop the program
            if (!swap) {
                break;
            }

        }
    }

    static void swap(int[] arr, int j) {
        /*
        --swap with temp--
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        */

        //swap without temp
        arr[j] = arr[j] + arr[j - 1];
        arr[j - 1] = arr[j] - arr[j - 1];
        arr[j] = arr[j] - arr[j - 1];
    }
}
