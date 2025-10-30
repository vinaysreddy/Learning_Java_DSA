package recursion_A_to_Z.recursion_Level_1;

public class SumofFirstNnaturalNums {
    public static void main(String[] args) {
        int n=100;
        int ans = sum(n);
        System.out.println(ans);
    }

     static int sum(int n) {
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}

