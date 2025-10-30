package recursion_A_to_Z.recursion_Level_1;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 5005;
        int ans = sumofdigits(n);
        System.out.println("sum of digits : "+ans);
        int productOfDigits = product(n);
        System.out.println("product of digits : "+productOfDigits);

    }

    static int sumofdigits(int n) {

        if (n / 10 == 0) {
            return n;
        }
        return (n % 10) + sumofdigits(n / 10);
    }

    static int product(int n) {

        if (n / 10 == 0) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
