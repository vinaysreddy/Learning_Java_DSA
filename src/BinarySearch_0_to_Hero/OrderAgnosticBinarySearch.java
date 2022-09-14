package BinarySearch_0_to_Hero;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 0, 0, 0};//desc order
        int target = 3;

        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
