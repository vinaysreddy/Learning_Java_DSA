package recursion_A_to_Z.array_questions;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 3, -1, 4, 4, 4, 4};
        int s = 0;
        int target = -8;
//        System.out.println(search(arr, s, target));
//        System.out.println(findAllIndex(arr, s, 100));
        System.out.println(findAllIndex2(arr, s, 4));

    }


    static boolean search(int[] arr, int s, int target) {
//        if(s>arr.length-1){
//            return false;
//        }
//        if(arr[s]==target) return true;
//        return search(arr,s+1,target);

        if (s == arr.length) {
            return false;
        }
        return arr[s] == target || search(arr, s + 1, target);

    }


    static ArrayList<Integer> findAllIndex(int[] arr, int s, int target) {

        if (s == arr.length) {
            return list;
        }


        if (arr[s] == target) {
            list.add(s);
        }

        return findAllIndex(arr, s + 1, target);

    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int s, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (s == arr.length) {
            return list;
        }

        if (arr[s] == target) {
            list.add(s);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, s + 1, target);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}
