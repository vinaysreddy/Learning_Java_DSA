package Recursion_A_to_Z.Recursion_Level_1;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n=5;
        int ans = fact(n);
        System.out.println(ans);
    }

    private static int fact(int n) {
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
