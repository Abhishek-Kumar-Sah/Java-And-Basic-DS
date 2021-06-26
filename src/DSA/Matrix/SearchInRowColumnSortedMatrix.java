package DSA.Matrix;

public class SearchInRowColumnSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,49}
        };

        searchInRowColumnSortedMatrix(matrix,33);
    }


    public static void searchInRowColumnSortedMatrix(int[][] mat , int number){
        int i = 0, j = mat[0].length-1;

        if (number > mat[mat.length-1][mat[mat.length-1].length-1] || number < mat[0][0]) {
            System.out.print("Number " + number + " was not found");
            return;
        }
        while (i < mat.length && j >= 0){

            if (mat[i][j] == number) {
                System.out.print((i+1) + " , " + (j+1));
                return;
            }
            else if (mat[i][j] > number)
                j--;

            else
                i++;
        }
        System.out.print("Number " + number + " was not found");
    }
}
