package leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/#:~:text=Find%20Numbers%20with%20Even%20Number%20of%20Digits%20%2D%20LeetCode&text=Given%20an%20array%20nums%20of,(even%20number%20of%20digits).
public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {2, 34, 54, 6, 9999, 90, 87, 888888, 1, 23};
        int count = findNumbers(nums);
        System.out.println(count);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int element : nums) {
            int nDigits = digits(element);
            if (even(nDigits)) count += 1;
        }
        return count;
    }

    static int digits(int element) {
        return (int) Math.log10(element) + 1;
    }

    private static boolean even(int element) {
        if ((element & 1) == 0) return true;
        return false;
    }
}
