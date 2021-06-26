package DSA.Matrix;

import java.util.Arrays;

public class MedianOfRowWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,49},
                {1,2,3,4}
        };
        int[][] matrix2 = {
                {5,10,20,30,40},
                {1,2,3,4,6},
                {11,13,15,17,19}
        };

        System.out.println(median(matrix1));
        System.out.println(median(matrix2));
    }

    public static int median(int[][] mat){

        int row = mat.length, column = mat[0].length, min = mat[0][0], max = mat[0][column-1];
        for (int i =1; i< row ; i++){
            min = Math.min(min, mat[i][0]);
            max = Math.max(max, mat[i][column-1]);
        }

        int medianPosition = (row * column +1) / 2;

        while (min < max){
            int mid = (min + max)/2;
            int positionOfMid =0;
            for (int i =0 ; i < row ; i++){
                int pos = Arrays.binarySearch(mat[i],mid);

                if(pos < 0)
                    pos = Math.abs(pos + 1);

                else
                {
                    while(pos < mat[i].length && mat[i][pos] == mid)
                        pos += 1;
                }

                positionOfMid += pos;
            }

            if (positionOfMid < medianPosition)
                min = mid+1;
            else if (positionOfMid > medianPosition)
                max = mid-1;
            else
                max = mid;
        }

        return min; // OR max...both will be same
    }
}
