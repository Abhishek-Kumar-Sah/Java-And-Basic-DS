package DSA.Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,2,4,5,2,3,5,6,7,8,5,6};
        int[] arr2 = {4,3,6,9,6,2,10,45,19};

        intersectionOfArrays(arr1,arr2);
    }

    public static void intersectionOfArrays(int[] arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int a: arr1) {
            hs.add(a);
        }

        for (int a: arr2) {
            if (hs.contains(a))
                System.out.print(a + " ");
            hs.remove(a);
        }
    }
}
