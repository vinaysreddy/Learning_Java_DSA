package recursion_A_to_Z.recursion_Level_1;

public class ReverseAnArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start=0;
        int end=arr.length - 1;
        reverse(arr, start, end);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverse(int[] arr, int left, int right) {
        // Base case
        if (left >= right) {
            return;
        }

        // Swap elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recurse on inner part
        reverse(arr, left + 1, right - 1);
    }
}
