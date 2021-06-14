package DSA.Array;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,11,5,6,7,8,9,10};
        System.out.println(isSorted(arr));
        System.out.println(isSorted(arr2));
    }
    public static boolean isSorted(int[] arr){
        for (int i =0; i < arr.length-1 ; i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
