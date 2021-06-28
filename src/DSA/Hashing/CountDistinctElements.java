package DSA.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3,4,5,4,6,7,5,6,8,2,3,5,6,8,9,7,8,9,3,4,10,2,3,6};

        System.out.println(countDistinctElements(arr));
        System.out.println(countDistinctElementsNormal(arr));
    }


    public static int countDistinctElements(int[] arr){
        HashSet<Integer> hs = new HashSet<>();

        for (int a: arr) {
            hs.add(a);
        }

        return hs.size();
    }


    public static int countDistinctElementsNormal(int[] arr){
        Arrays.sort(arr);
        int count =1;

        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] != arr[i-1])
                count++;
        }

        return count;
    }
}
