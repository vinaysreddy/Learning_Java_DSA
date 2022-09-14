package leetcode;
//https://leetcode.com/problems/missing-number/
// Amazon imp

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3};
        int ans=missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}


/* another simple solution
 int n=nums.length;
 int total=(n)*(n+1)/2;
 int sum=0;
 for(int i=0;i<n;i++) sum+=nums[i];
 return total-sum;
 */
