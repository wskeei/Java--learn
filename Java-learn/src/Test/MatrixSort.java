package Test;

import java.util.Arrays;

public class MatrixSort {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 1, 5, 2, 8, 4},
                {6, 4, 9, 7, 3, 2},
                {7, 8, 2, 9, 5, 6}
        };

        System.out.println("原始矩阵：");
        System.out.println(Arrays.deepToString(matrix));

        //printMatrix(matrix);

        // 对每一行进行降序排序
        sortRowsDescending(matrix);

        System.out.println("排序后的矩阵：");
        System.out.println(Arrays.deepToString(matrix));
    }

    // 冒泡排序对每一行进行降序排序
    private static void sortRowsDescending(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = 0; k < matrix[i].length - 1 - j; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        // 交换元素位置
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
    }



}
