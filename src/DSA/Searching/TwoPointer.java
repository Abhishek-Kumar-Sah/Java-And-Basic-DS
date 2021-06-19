package DSA.Searching;

import java.util.ArrayList;

public class TwoPointer {

    public static void main(String[] args) {
        int[] arr = {2,4,8,9,11,12,20,30};
        pairOfSumInSortedArray(arr,23);
        System.out.println(tripletOfSumInSortedArray(arr,33));
    }


    public static void pairOfSumInSortedArray(int[] arr, int reqSum){
        int low = 0, high = arr.length-1;
        boolean notFound = true;
        while(low < high){
            int sum = arr[low] + arr[high];

            if (sum == reqSum) {
                System.out.println("Pair with sum " + reqSum + " is " + arr[low] + " and " + arr[high]);
                notFound = false;
                break;
            }
            else if (sum > reqSum)
                high --;

            else low ++;
        }
        if (notFound)
            System.out.println("No such pair found");
    }

    

    public static ArrayList<Integer> tripletOfSumInSortedArray(int[] arr, int reqSum){
        ArrayList<Integer> al = new ArrayList<>();

        for (int i =0 ; i< arr.length-2 ; i++){
            al = pairOfSum(arr,reqSum - arr[i],i+1);
            if (al.size() == 0)
                continue;

            else{
                al.add(arr[i]);
                break;
            }
        }
        if (al.size() == 3)
            return al;

        else{
            System.out.println("No triplet found");
            return al;
        }
    }

    private static ArrayList<Integer> pairOfSum(int[] arr, int reqSum, int startIndex){
        int low = startIndex, high = arr.length-1;
        ArrayList<Integer> al = new ArrayList<>();

        while(low < high){
            int sum = arr[low] + arr[high];

            if (sum == reqSum) {
                al.add(arr[low]);
                al.add(arr[high]);
                break;
            }
            else if (sum > reqSum)
                high --;

            else low ++;
        }
       return al;
    }
}
