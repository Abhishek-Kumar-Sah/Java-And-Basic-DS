package DSA.Hashing;

// Both arrays should be of same length.

import java.util.HashMap;

public class LongestCommonSpanWithSameSum {
    public static void main(String[] args) {
        int[] arr1 = {0,1,0,0,0,0};
        int[] arr2 = {1,0,1,0,0,1};

        System.out.println(longestCommonSpanWithSameSum(arr1,arr2));
    }



    public static int longestCommonSpanWithSameSum(int[] arr1 , int[] arr2){

        // Compute the difference array
        for (int i =0; i < arr1.length ; i++){
            arr1[i] = arr1[i] - arr2[i];
        }

        // Now find longest subarray with 0 sum in arr1.
        HashMap<Integer,Integer> map = new HashMap<>();

        int currentSum =0, size =0;
        for (int i =0; i < arr1.length ; i++){
            currentSum += arr1[i];

            if (currentSum == 0)
                size = i+1;

            if (map.containsKey(currentSum) == false)
                map.put(currentSum,i);

            if (map.containsKey(currentSum))
                size = Math.max(size, i - map.get(currentSum));
        }

        return size;
    }
}
