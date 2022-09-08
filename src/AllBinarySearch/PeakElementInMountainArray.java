package AllBinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        int peak = findPeak(arr);
        System.out.println(peak);
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start; //or return end
    }
}
