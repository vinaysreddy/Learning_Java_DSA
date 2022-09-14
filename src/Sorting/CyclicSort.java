package Sorting;

import java.util.Arrays;

/*
  given range 1 to N or given continous array use cyclic sort
  very imp. pattern
 */

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void cyclicSort(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

     static void swap(int[] arr, int s, int e) {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
/*
https://leetcode.com/problems/missing-number/
 */