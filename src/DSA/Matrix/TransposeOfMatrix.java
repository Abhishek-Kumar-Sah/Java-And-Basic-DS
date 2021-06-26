package DSA.Matrix;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        transpose(matrix);

        for (int i =0; i < matrix.length ; i++){
            for (int j =0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }

    }

    public static void transpose(int[][] mat){

        for (int i =0; i < mat.length ; i++){
            for (int j =i+1; j < mat[i].length ; j++){
                swap(mat,i,j);
            }
        }
    }

    private static void swap(int[][] mat, int i , int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
