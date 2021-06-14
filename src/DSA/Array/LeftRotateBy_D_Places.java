package DSA.Array;

public class LeftRotateBy_D_Places {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        leftRotateByD(arr,4);
        for (int a:
                arr) {
            System.out.print(a+ " ");
        }
    }



    public static int[] leftRotateByD(int[] arr, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);

        return arr;
    }

    public static int[] reverse(int[] arr , int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return arr;
    }
}
