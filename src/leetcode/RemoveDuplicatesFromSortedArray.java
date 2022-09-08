package leetcode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 500};
        int ans = removeDuplicates(arr);
        System.out.println(ans);

    }

    static int removeDuplicates(int[] nums) {
        int left = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left += 1;
            }
        }
        return left;
    }
}
