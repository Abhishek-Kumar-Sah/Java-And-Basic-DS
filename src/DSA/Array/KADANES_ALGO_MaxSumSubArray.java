package DSA.Array;

public class KADANES_ALGO_MaxSumSubArray {

    public static void main(String[] args) {
        int[] arr1 = {-5,1,-2,3,-1,2,-2};
        System.out.println(maxSum(arr1));
    }
    public static int maxSum(int[] arr){
        int res = arr[0] , maxSumTillPreviousElement = arr[0];

        for (int i = 1 ; i< arr.length ; i++){
            maxSumTillPreviousElement = Math.max(maxSumTillPreviousElement + arr[i],arr[i]);
            res = Math.max(maxSumTillPreviousElement,res);
        }
        return res;
    }
}
