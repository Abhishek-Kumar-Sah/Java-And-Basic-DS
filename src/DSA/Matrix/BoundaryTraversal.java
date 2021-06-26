package DSA.Matrix;

public class BoundaryTraversal {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int[][] matrix2 = {
                {1,2,3,4,5}
        };

        int[][] matrix3 = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };

        boundaryPrint(matrix1);
        boundaryPrint(matrix2);
        boundaryPrint(matrix3);
    }


    public static void boundaryPrint(int[][] mat) {
        if (mat.length == 1)
            for (int a: mat[0]) {
                System.out.print(a+"  ");
            }


        else if (mat[0].length == 1) {
            for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][0]+"  ");
            }
        }

        else{
            int i =0, j=0;

            while (i < mat[0].length){
                System.out.print(mat[j][i++]+ "  ");
            }

            i--; // To prevent index out of bound
            j++; // To prevent repeated printing of corner element

            while (j < mat.length){
                System.out.print(mat[j++][i]+"  ");
            }

            j--; // To prevent index out of bound
            i--; // To prevent repeated printing of corner element

            while (i >= 0){
                System.out.print(mat[j][i--]+ "  ");
            }

            i++; // To prevent index out of bound
            j--; // To prevent repeated printing of corner element

            while(j > 0){
                System.out.print(mat[j--][i]+ "  ");
            }
        }
        System.out.println();
    }
}
