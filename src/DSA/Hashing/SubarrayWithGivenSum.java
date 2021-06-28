package DSA.Hashing;

import java.util.HashSet;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {

        int[] arr1 = {5,8,6,13};
        System.out.println(subarrayWithGivenSum(arr1,14));
    }


    public static boolean subarrayWithGivenSum(int[] arr ,int requiredSum){
        HashSet<Integer> hs = new HashSet<>();
        int currentSum =0;

        for (int a: arr) {
            currentSum += a;

            if (hs.contains(currentSum - requiredSum) || currentSum == requiredSum)
                return true;
            else
                hs.add(currentSum);
        }
        return false;
    }
}
