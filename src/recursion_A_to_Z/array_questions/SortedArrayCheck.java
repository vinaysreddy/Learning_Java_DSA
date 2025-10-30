package recursion_A_to_Z.array_questions;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, -1};
        int s = 0;
        int e = arr.length - 1;
        System.out.println(sorted(arr, s, e));
    }

    static boolean sorted(int[] arr, int s, int e) {
//        if(s==e){
//            return true;
//        }
//
//        if (arr[s]<=arr[s+1] && sorted(arr,s+1,e))
//        {
//            return true;
//        }
//        return false;

        if (s == e) {
            return true;
        }

        return arr[s] <= arr[s + 1] && sorted(arr, s + 1, e);
    }
}
