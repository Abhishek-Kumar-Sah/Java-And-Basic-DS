package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class EXTENDED_MOOREY_VOTING_ALGO_MoreThan_NbyK_Occurrences {
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,20,10,10};


        printMoreThanNbyKOccurrences(arr,2);
        printMoreThanNbyKOccurrencesMOOREYS(arr,2);
    }


    // This is an O(n*k) solution.
    // Extension of MOOREY'S VOTING ALGORITHM
    public static void printMoreThanNbyKOccurrencesMOOREYS(int[] arr, int k){


        HashMap<Integer, Integer> map = new HashMap<>();

        //Finding eligible candidates. Which cannot be more than k-1 ... for proof
        // refer gfg course last video of hashing.
        for (int i =0 ; i < arr.length ; i++){

            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);

            if (map.containsKey(arr[i]) == false && map.size() < k-1)
                map.put(arr[i],1);

            else{
                for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    if (e.getValue() == 1)
                        map.remove(e.getKey());
                    else
                        map.put(e.getKey(),e.getValue() - 1);
                }
            }
        }

        // Now we have the map of all eligible candidates.
        // Now check whether they are actually occurring more than n/k times.

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int count =0;

            for (int i = 0; i < arr.length; i++){
                if (arr[i] == e.getKey())
                    count++;
            }
            if (count > arr.length/k)
                System.out.print(e.getKey() + " ");

        }
        System.out.println();
    }



    public static void printMoreThanNbyKOccurrences(int[] arr, int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a , map.getOrDefault(a,0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {

            if (e.getValue() > arr.length / k)
                System.out.print(e.getKey() + " ");
        }
        System.out.println();
    }
}
