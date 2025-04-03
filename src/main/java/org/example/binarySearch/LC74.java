package org.example.binarySearch;

public class LC74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 13));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int L = 0, R = rows * cols - 1;
        int mid;


        while (L <= R) {

            mid = (L + R) / 2;

            int midRow = mid / cols;
            int midCol = mid % cols;

            int midVal = matrix[midRow][midCol];

            if (target < midVal) {
                R = mid - 1;
            } else if (target > midVal) {
                L = mid + 1;
            } else return true;
        }
        
        return false;
    }







}
