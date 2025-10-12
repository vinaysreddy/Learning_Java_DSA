package Recursion_Intro;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 50, 60, 70};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;

        int ans = search(arr, target, start, end);
        System.out.println(ans);

    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return 0;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            // this means im solving left side part once with the given arguments
            return search(arr, target, mid + 1, end);
        } else {
            // this means im solving right side part once with the given arguments
            return search(arr, target, start, mid - 1);
        }
    }
}
