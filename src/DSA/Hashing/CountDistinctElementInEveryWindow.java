package DSA.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElementInEveryWindow {
    public static void main(String[] args) {

        int[] arr1 = {10,20,20,10,30,40,10};
        int[] arr2 = {10,20,30,40};

        countDistinctElementsGfG(arr1,4);
        countDistinctElementsGfG(arr2,3);
        countDistinctElementInEveryWindow(arr1,4);
        countDistinctElementInEveryWindow(arr2,3);
    }


    // This is an O(n) time complexity solution.
    public static void countDistinctElementsGfG(int[] arr , int window){
        HashMap<Integer, Integer> map = new HashMap<>(window);

        for (int i =0; i < window; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        System.out.print(map.size()+ " ");

        for (int i = window; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);

            if (map.get(arr[i-window]) == 1)
                map.remove(arr[i-window]);
            else
                map.put(arr[i-window], map.get(arr[i-window]) - 1);

            System.out.print(map.size()+ " ");
        }

        System.out.println();
    }



    // This solution is NOT in O(n) time complexity.
    public static void countDistinctElementInEveryWindow(int[] arr, int window){

        ArrayList<Integer> al = new ArrayList<>(window);
        HashSet<Integer> set = new HashSet<>(window);

        for (int i = 0 ; i < arr.length ; i++) {

            if (i < window) {
                al.add(arr[i]);

                if (i == window - 1) {
                    set.addAll(al);
                    System.out.print(set.size()+ " ");
                }

            } else {
                al.add(arr[i]);
                al.remove(0);

                set.clear();
                set.addAll(al);
                System.out.print(set.size()+ " ");
            }
        }
        System.out.println();
    }
}
