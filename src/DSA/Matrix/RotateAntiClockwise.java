package DSA.Matrix;

public class RotateAntiClockwise {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotateAntiClockwiseBy90(matrix,3);

        for (int i =0; i < matrix.length ; i++){
            for (int j =0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }

    }

    // To rotate a matrix anti-clockwise by 90 , just take transpose of matrix &
    // reverse the order of elements in each column.
    public static void rotateAntiClockwiseBy90(int[][] mat, int noOfRotations) {

        noOfRotations = noOfRotations % 4;

        while (noOfRotations-- > 0) {

            //Take transpose
            transpose(mat);

            //Reverse the order of elements in each column.
            for (int i = 0; i < mat[0].length; i++) {
                int low = 0, high = mat.length - 1;

                while (low < high) {
                    int temp = mat[low][i];
                    mat[low][i] = mat[high][i];
                    mat[high][i] = temp;
                    low++;
                    high--;
                }
            }
        }
    }

    private static void transpose(int[][] mat){

        for (int i =0 ; i < mat.length ; i++){
            for (int j = i+1; j < mat[i].length; j++){
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
