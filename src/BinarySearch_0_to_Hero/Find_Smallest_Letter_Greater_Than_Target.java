package BinarySearch_0_to_Hero;


//leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters = {'a', 'g', 'v'};
        char target = 'f';
        char answer = ceilInChar(letters, target);
        System.out.println(answer);
    }

    private static char ceilInChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) end = mid - 1;
            else start = mid + 1;

        }
        return letters[start % letters.length];


    }
}
