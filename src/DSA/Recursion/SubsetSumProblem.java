package DSA.Recursion;

import java.util.Scanner;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int arr[] = {3,5,3,5,6,8,8,5,5,4,8,6,45,6,};
        int n = arr.length;
        System.out.println(noOfSubsets(arr,n,10));
    }
    public static int noOfSubsets(int[] arr, int totalNoOfElements , int reqSum){

        if (totalNoOfElements == 0)
            return (reqSum == 0)? 1:0;

        return noOfSubsets(arr,totalNoOfElements-1,reqSum) +
                noOfSubsets(arr,totalNoOfElements-1,reqSum-arr[totalNoOfElements-1]);
    }
}
