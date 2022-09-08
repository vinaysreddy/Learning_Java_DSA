package AllBinarySearch;

//Ceiling means smallest number >=target

public class floorOfGivenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 12, 34};
        int target = -3;
        int ans = findFloor(arr, target);
        System.out.println(ans);
    }
    static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target<arr[0]) return -1;

            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target >arr[mid]) {
                start = mid + 1;
            }

        }
        return arr[end];
    }
}
