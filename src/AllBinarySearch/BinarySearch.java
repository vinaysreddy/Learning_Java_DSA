package AllBinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,12,45,757,888};
        int target=78;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    //return search index
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            //find middle element
            //int mid=(start+end)/2; might be possible that start + end will excced the int value in java and leads to error
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
/*
   Problems:
  -> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
  -> leetcode.com/problems/find-smallest-letter-greater-than-target/
  -> https://leetcode.com/problems/peak-index-in-a-mountain-array/
  -> https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
  -> leetcode.com/problems/find-in-mountain-array/
  -> https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

