package org.example.arrays.medium;

public class LC48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
/*

   [[5,  1,  9,  11],
    [2,  4,  8,  10],
    [13, 3,  6,  7],
    [15, 14, 12, 16]]

 */
        for (int i = 0; i < (n+1)/2; i++) {
            for (int j = 0; j < n/2; j++) {
                //bottom left
                int temp = matrix[n-1-j][i];

                //bottom left = bottom right
                matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
                //bottom right = top right
                matrix[n-1-i][n-j-1] = matrix[j][n-1-i];
                //top right = top left
                matrix[j][n-1-i] = matrix[i][j];
                //top left = temp
                matrix[i][j] = temp;
            }
        }

        /*int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }*/

    }
}
