package DSA.Matrix;

public class SnakePatternTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        snakePrint(matrix);

    }


    public static void snakePrint(int[][] mat) {
        for (int i = 0; i < mat.length ; i++){

            if ((i & 1) == 0){
                for (int j = 0 ; j < mat[i].length; j++){
                    System.out.print(mat[i][j]+"  ");
                }
            }else{
                for (int j = mat[i].length-1; j >= 0 ; j--){
                    System.out.print(mat[i][j]+ "  ");
                }
            }
        }
    }
}
