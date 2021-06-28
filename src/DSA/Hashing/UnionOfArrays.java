package DSA.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class UnionOfArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,4,5,6,3,4,7,8,9,10,70};
        int[] arr2 = {2,4,6,98,67,54,3,21,34,56};

        System.out.print(unionOfArrays(arr1,arr2));

        System.out.println();

        Iterator<Integer> i = unionOfArrays(arr1,arr2).iterator();
        while (i.hasNext())
            System.out.print(i.next() + "  ");

    }


    public static HashSet<Integer> unionOfArrays(int[] arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();

        for (int a: arr1) {
            hs.add(a);
        }
        for (int a: arr2) {
            hs.add(a);
        }

        return hs;
    }
}
