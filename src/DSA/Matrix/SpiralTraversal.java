package DSA.Matrix;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int[][] matrix2 = {
                {1,2,3,4,5},
        };

        int[][] matrix3 = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };

        spiralPrint(matrix1);
        spiralPrint(matrix2);
        spiralPrint(matrix3);
    }



    public static void spiralPrint(int[][] mat) {
        int top = 0, right = mat[0].length - 1, bottom = mat.length - 1, left = 0;


            while (top <= bottom && right >= left) {

                for (int i = left; i <= right; i++) {
                    System.out.print(mat[top][i] + "  ");
                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    System.out.print(mat[i][right] + "  ");
                }
                right--;

                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(mat[bottom][i] + "  ");
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(mat[i][left] + "  ");
                    }
                    left++;
                }
            }
        System.out.println();
    }
}
