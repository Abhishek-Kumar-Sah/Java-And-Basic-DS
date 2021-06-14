package DSA.Array;

public class LargestElement {

    public static void main(String[] args) {

        int [] arr = {2,3,13,23,53,4,45,32,46,7,86,47,57,67,8,7,96,8,67,8,75,76,4,5,33,3,33,5};
        System.out.println(largestElement(arr));
        System.out.println(arr[largestElement(arr)]);
    }


    public static int largestElement(int[] arr){
        int max =0;
        for (int i =0; i < arr.length ; i++){
            max = arr[i] > arr[max] ? i : max;
        }
        return max;
    }
}
