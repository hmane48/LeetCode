package PatternPrinting;

public class Solution {

    private static void patternPrinting(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    if (i == j) {
                        System.out.println();
                        System.out.println(matrix[i][j]);
                    } else {
                        System.out.print(matrix[i][j]);
                    }
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        patternPrinting(matrix);
    }
}
