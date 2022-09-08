package leetcode;

//
public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts={
                {-2,-8,-7},
                {-7,-1,-3},
                {20,30} //max
        };

        int max = maximumWealth(accounts);
        System.out.println(max);
    }

    static int maximumWealth(int[][] accounts) {
        //int max=Integer.MIN_VALUE;
        int max=0;
        for (int[] row : accounts) {
            int sum=0;
            for(int col: row){
                sum+=col;
            }
          max= Math.max(max,sum);
        }
        return max;
    }


}
