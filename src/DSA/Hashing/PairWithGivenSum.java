package DSA.Hashing;

import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,5,6,7,8,3,21,3,4,19};

        System.out.println(pairWithSum(arr,24));
        System.out.println(pairWithSum(arr,11));
        System.out.println(pairWithSum(arr,2));
    }


    public static boolean pairWithSum(int[] arr, int sum){
        HashSet<Integer> hs = new HashSet<>();

        for (int a: arr) {
            if (hs.contains(sum - a))
                return true;
            else
                hs.add(a);
        }

        return false;
    }
}
