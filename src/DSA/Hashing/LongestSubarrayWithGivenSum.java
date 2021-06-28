package DSA.Hashing;

import java.util.HashMap;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {5,8,-4,-4,9,-2,2};
        int[] arr2 = {3,1,0,1,8,2,3,6};
        int[] arr3 = {8,3,7};

        System.out.println(longestSubarrayWithGivenSum(arr1,0));
        System.out.println(longestSubarrayWithGivenSum(arr2,5));
        System.out.println(longestSubarrayWithGivenSum(arr3,15));


    }



    public static int longestSubarrayWithGivenSum(int[] arr, int requiredSum){
        HashMap<Integer, Integer> map = new HashMap<>();

        int currentSum =0 , size =0;

        for (int i =0 ; i< arr.length ; i++){
            currentSum += arr[i];

            if (currentSum == requiredSum){ // If subarray is starting from the index 0.
                size = i+1;
            }

            if (map.containsKey(currentSum) == false)
                map.put(currentSum,i);

            if (map.containsKey(currentSum-requiredSum)){
                size = Math.max(size,  i - map.get(currentSum-requiredSum));
            }

        }
        return size;
    }
}
