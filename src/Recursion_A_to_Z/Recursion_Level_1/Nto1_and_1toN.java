package Recursion_A_to_Z.Recursion_Level_1;

public class Nto1_and_1toN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Nto1");
        Nto1(n);
        System.out.println("OnetoN");
        OnetoN(n);
        System.out.println("both");
        both(n);
    }

    static void Nto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Nto1(n - 1);
    }

    static void OnetoN(int n) {
        if (n == 0) {
            return;
        }
        OnetoN(n - 1); // print when emptying the stack
        System.out.println(n);

    }

    static void both(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        OnetoN(n - 1);
        System.out.println(n);

    }
}
