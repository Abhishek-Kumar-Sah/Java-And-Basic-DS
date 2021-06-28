package DSA.Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqual0And1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,0};

        System.out.println(longestSubarrayWithEqual0And1(arr));

    }



    public static int longestSubarrayWithEqual0And1(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        int currentSum =0, size=0;

        for (int i =0  ; i< arr.length ; i++){
            if (arr[i] == 0)
                currentSum -= 1;
            else
                currentSum += 1;

            if (currentSum ==0)
                size = i+1;

            if (map.containsKey(currentSum) == false)
                map.put(currentSum,i);

            if (map.containsKey(currentSum))
                size = Math.max(size, i - map.get(currentSum));
        }

        return size;
    }
}
