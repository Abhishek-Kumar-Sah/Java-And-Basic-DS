package DSA.Hashing;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,-7,5,7,-4,-3,-6,5,2,-4};

        System.out.println(subArrayZeroSum(arr));

        int[] arr2 = {-3,2,1,4};

        System.out.println(subArrayZeroSum(arr2));
    }

    public static boolean subArrayZeroSum(int[]arr){

        HashSet<Integer> hs = new HashSet<>();

        int sum =0;
        for (int a: arr) {
            sum += a;

            if (hs.contains(sum) || sum == 0)
                return true;
            else
                hs.add(sum);
        }
        return false;
    }
}
