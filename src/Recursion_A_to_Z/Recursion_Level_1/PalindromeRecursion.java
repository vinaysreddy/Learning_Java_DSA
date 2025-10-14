package Recursion_A_to_Z.Recursion_Level_1;

public class PalindromeRecursion {
    public static void main(String[] args) {
        String str = "racecar";

        boolean ans = palindrome(str, 0, str.length() - 1);
        System.out.println(ans);

    }

    private static boolean palindrome(String str, int start, int end) {

        if (start > end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return palindrome(str, start + 1, end - 1);


    }
}
