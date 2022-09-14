package BinarySearch_0_to_Hero;

//Ceiling means smallest number >=target
public class CeilingOfGivenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 12, 34};
        int target = 23;
        int ans = findCeil(arr, target);
        System.out.println(ans);
    }

    static int findCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target>arr[arr.length-1]) return -1;
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target >arr[mid]) {
                start = mid + 1;
            }

        }
       return arr[start];
    }
}
