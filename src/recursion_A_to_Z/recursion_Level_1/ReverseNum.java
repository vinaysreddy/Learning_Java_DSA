package recursion_A_to_Z.recursion_Level_1;

public class ReverseNum {
    static int sum = 0;

    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }

    public static void main(String[] args) {
        reverse1(123);
        System.out.println(sum);//
        System.out.println(reverse2(7654));

    }

    static int reverse2(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n / 10 == 0) {
            return n;
        }
        return (n % 10) * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

}
