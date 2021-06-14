package DSA.Array;

import java.util.ArrayList;

public class PrefixSum {

    public static void main(String[] args) {

        int[] arr1 = {2,8,3,9,6,5,4};
        System.out.println(getSum(arr1,0,2));
        System.out.println(getSum(arr1,1,3));
        System.out.println(getSum(arr1,2,6));


        int[] arr2 = {3,4,8,-9,20,6};
        int[] arr3 = {4,2,-2};
        int[] arr4 = {4,2,2};
        System.out.println(isEquilibriumPointPresent(arr2));
        System.out.println(isEquilibriumPointPresent(arr3));
        System.out.println(isEquilibriumPointPresent(arr4));


        int[] arr5 = {1,2,5,15};
        int[] arr6 = {5,8,7,18};
        System.out.println(maxOccured(arr5,arr6));
    }

    //Function to find out prefix sum array of the given array. (Pre-Processing)
    public static int[] prefixSumArray(int[] arr){
        int[] prefixSum = new int[arr.length];
        int sum =0;
        for (int i =0 ; i< arr.length ; i++){
            sum += arr[i];
            prefixSum[i] = sum;
        }
        return prefixSum;
    }


    //To get sum of elements of desired subarray.Both limits included fromIndex & toIndex
    public static int getSum(int[] arr, int fromIndex, int toIndex){
        int[] prefixSum = prefixSumArray(arr); //Pre-Processing

        if (fromIndex == 0)
            return prefixSum[toIndex];
        else
            return prefixSum[toIndex] - prefixSum[fromIndex -1];
    }


    //To find if there's an element exists such that sum of
    //elements previous of it is equal to sum of elements after it.
    public static boolean isEquilibriumPointPresent(int[] arr){
        int totalSum = 0;
        for (int a:
             arr) {
            totalSum += a;
        }

        int sum =0;
        for (int i =0 ; i< arr.length ; i++){

            if (sum == totalSum - (sum + arr[i])) {
                System.out.print(i+" ");
                return true;
            }
            sum += arr[i];
        }
        return false;
    }

    //Given n integer ranges, the task is to find the maximum occurring integer in these ranges.
    //If more than one such integer exits, find the smallest one. The ranges are given as
    //two arrays L[] and R[].  L[i] consists of starting point of range and R[i]
    //consists of corresponding end point of the range.
    public static int maxOccured(int[] L, int[] R){
        if (L.length != R.length) {
            System.out.println("Length of both L & R should be same");
            return 0;
        }
        int[] arr = new int[1000];
        for (int i =0; i < L.length ; i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
        }
        int sum =0 ,maxFreq =0 , res =0;
        for (int i =0 ; i < arr.length ; i++){
            sum += arr[i];

            if (sum > maxFreq){
                maxFreq = sum;
                res =i;
            }
        }
        return res;
    }
}
