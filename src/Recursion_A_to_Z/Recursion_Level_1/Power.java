package Recursion_A_to_Z.Recursion_Level_1;

public class Power {
    public static void main(String[] args) {
        int ans = power(2, 4);
        System.out.println(ans);

    }

    static int power(int a, int x) {
        if (x == 0) { // a pow(0) = ß1
            return 1;
        }
        return a * power(a, x - 1);

    }
}
