package DSA.Array;

//An interesting array problem to find the length of the
// longest subarray that has alternating even odd elements.

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,6,7,6,5,4,3,2,1,4,3,8,6};

        System.out.println(longestEvenOddSubarray(arr1));
    }


// Solved using Kadane's Algo.
    public static int longestEvenOddSubarray(int[] arr){
        int res =0, current = 1;
        for (int i =0 ; i < arr.length-1 ; i++){

            if ((arr[i] % 2 == 0 && arr[i+1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i+1] % 2 == 0)){
                current += 1;
                res = Math.max(res,current);
            }
            else
                current =1;
        }
        return res;
    }
}
