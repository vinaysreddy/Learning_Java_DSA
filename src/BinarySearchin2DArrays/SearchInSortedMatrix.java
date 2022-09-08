package BinarySearchin2DArrays;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {11, 12, 13}, {14, 15, 16}};
        int target = 15;
        System.out.println(Arrays.toString(findEfficient(arr, target)));
        //if((3&1)==1 ) System.out.println("odd");
    }

    static int[] findEfficient(int[][] matrix, int target) {
        int r = 0, col = matrix.length - 1;
        while (r < matrix.length && col >= 0) {
            if (matrix[r][col] == target) return new int[]{r + 1, col + 1};
            if (matrix[r][col] < target) {
                r++;
            } else col--;

        }
        return new int[]{-1, -1};
    }

}
