package Sorting;

import java.util.Arrays;

/*
  INSERTION SORT :
  -> for every pass left side of the array is getting sorted
  worst case -> array is sorted in opposite -> o(n^2)
  best case -> array is sorted -> 0(n) -> linear complexity

  ** Why Insertion sort **
  -> it is adaptive : steps get reduced if array is sorted
  -> no of swaps is reduced as compare to bubble sort
  -> stable
  -> used for smaller values of n.
  -> works good when array is partially sorted,this is y it takes part in hybrid sorting algorithms.
  -> higher chance for builtin sort methods in languages might use insertion sort mixed with merge sort etc

 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void insertionSort(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }

            }
            
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
