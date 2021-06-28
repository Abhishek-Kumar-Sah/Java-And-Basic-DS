package DSA.Hashing;

// Given an array, we need to find the longest subsequence that has consecutive elements.
// These consecutive elements may appear in any order in the subsequence.

import java.util.*;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,3,2,9,10};

        System.out.println(longestSubsequence(arr));
        System.out.println(longestSubsequenceNormal(arr));
    }


    public static int longestSubsequence(int[] arr){
        Set<Integer> hs = new HashSet<>();

        for (int a : arr) {
            hs.add(a);
        }

        Iterator<Integer> i = hs.iterator();

        int count =0, maxCount =0;
        while (i.hasNext()){
            int key = i.next();

            if (hs.contains(key-1))
                continue;

            else{
                while (hs.contains(key++)){
                    count++;
                    maxCount = Math.max(maxCount,count);
                }
                count =0;
            }
        }
        return maxCount;
    }


    public static int longestSubsequenceNormal(int[] arr){

        Arrays.sort(arr);
        int currentSize =1, maxSize =0;
        for (int i =1; i < arr.length ; i++){
            if (arr[i] == arr[i-1] +1){
                currentSize++;
            }
            else if (arr[i] != arr[i-1]){
                maxSize = Math.max(maxSize,currentSize);
                currentSize =1;
            }
        }

        maxSize = Math.max(maxSize,currentSize);

        return maxSize;
    }
}
