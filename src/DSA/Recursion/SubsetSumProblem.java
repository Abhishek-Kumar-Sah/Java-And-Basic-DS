package DSA.Recursion;

import java.util.Scanner;
    //to get max no of subsets with sum of elements equal to 'r', that can be formed
    // using elements of given array.

public class SubsetSumProblem {

    public static void main(String[] args) {



        int arr[] = {3,5,3,5,6,8,8,10,5,4,8,6,45,6,};
        int n = arr.length;
        int r = 10;
        System.out.println(noOfSubsets(arr,n,r));
        System.out.println(noOfSubs(arr,0,r));


    }





    public static int noOfSubsets(int[] arr, int totalNoOfElements , int reqSum){

        if (totalNoOfElements == 0)
            return (reqSum == 0)? 1:0;

        return noOfSubsets(arr,totalNoOfElements-1,reqSum) +
                noOfSubsets(arr,totalNoOfElements-1,reqSum-arr[totalNoOfElements-1]);
    }

    public static int noOfSubs(int[] arr, int i,int reqSum){

        if (i == arr.length){
            return (reqSum ==0)? 1:0;
        }
            return noOfSubs(arr,i+1,reqSum) + noOfSubs(arr,i+1,reqSum-arr[i]);

    }
}
