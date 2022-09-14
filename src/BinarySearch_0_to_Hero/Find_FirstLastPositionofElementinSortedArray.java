package BinarySearch_0_to_Hero;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Find_FirstLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,4,5,6};
        int target=400;
        int[] answer=first_and_last_pos(nums,target);
        System.out.println(Arrays.toString(answer));
    }

     static int[] first_and_last_pos(int[] nums, int target) {
        int[] ans={-1,-1};
//        int startIndex=search(nums,target,true);
//        int lastIndex=search(nums,target,false);
//        ans[0]=startIndex;
//        ans[1]=lastIndex;

         ans[0]=search(nums,target,true);
         if(ans[0]!=-1) ans[1]=search(nums,target,false);
        return ans;

    }

    static int search(int[] nums, int target, boolean startIndex) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else{
                ans=mid;
                if(startIndex){
                    end=mid-1;
                }
                else start=mid+1;
            }
        }
        return ans;
    }

}
