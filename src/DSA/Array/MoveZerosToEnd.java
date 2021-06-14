package DSA.Array;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1,2,0,0,9,8,0,67,0,9,8,7,6,0,0,7,89,8,0,6,0,6,0};
        for (int a:
             moveZerosToEnd(arr)) {
            System.out.print(a +" ");

        }
    }


    public static int[] moveZerosToEnd(int[] arr){
        int count =0;
        for (int i =0 ; i < arr.length ; i++){
            if (arr[i] != 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return arr;
    }
}
