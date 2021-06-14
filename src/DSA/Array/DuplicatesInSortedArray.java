package DSA.Array;

public class DuplicatesInSortedArray {


    public static void main(String[] args) {

        int [] arr = {0,1,2,2,3,3,3,3,4,4,5,6,7,7,7,8,9,9,9,9,9,10};
        for (int a:
                removeDuplicates(arr)) {
            System.out.print(a+" ");
        };

    }



    public static int[] removeDuplicates(int[] arr){
        int j = 1;
       for (int i= 1; i < arr.length ; i++){
           if (arr[i] != arr[j-1]){
               arr[j] = arr[i];
               j++;
           }
       }
       return arr;
    }
}
