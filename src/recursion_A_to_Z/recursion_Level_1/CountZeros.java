package recursion_A_to_Z.recursion_Level_1;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(answer(10020000));
    }

    static int answer(int n) {
        int count = 0;
        return helper(n, count);

    }

    // how to return a value to above function calls
    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int REM = (n % 10);

        if (REM == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);

    }
}
