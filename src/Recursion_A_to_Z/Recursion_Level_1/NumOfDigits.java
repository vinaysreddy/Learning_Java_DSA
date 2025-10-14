package Recursion_A_to_Z.Recursion_Level_1;

public class NumOfDigits {
    public static void main(String[] args) {
        int n=12345;
        int ans=countDigits(n);
        System.out.println(ans);
    }

    private static int countDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }

        return 1 + countDigits(n / 10);
    }
    }

