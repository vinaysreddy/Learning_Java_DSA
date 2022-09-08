package Sorting;

import java.util.Arrays;

/*
Why Bubble sort:
 1)on 1st parse we can see that largest ele in the array came in the end
 2)on 2nd parse we can see that second largest element in the array come to last but one position
 3)and so on........
 4)we can see that on parsing the right part of the array is getting sorted ex: 1,3,2,[4,5]->1,2,[3,4,5]->sorted

 Bubble sort is also known as :
 -> Syncing sort
 -> Exchanging Sort

 Space Complexity: o(1) constant -> no extra space required
 note: these are also called as "in place sorting algorithms"

 Time Complexity:
 -> Best Case : 0(n) -> when array is sorted
 -> Worst Case : 0(n^2)) -> when array is sorted in opposite

****Bubble sorting is a stable sorting algorithm***

Stable Sorting means : ex :  10 is number but [10] is also same number but with different color(property)
 -> arr[]= 10,[20],20,30,[10]  -> after Bubble sort -> 10,[10],[20],20,30 ->Stable
 Observation : in the original array 10 is before [10] and after sorting also 10 is before [10] only,
               which means order is maintained.so this is stable
               if the output is like -> [10],10,[20],20,30 -> order is not maintained,Hence Unstable
 */
public class BubbleSort {
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
