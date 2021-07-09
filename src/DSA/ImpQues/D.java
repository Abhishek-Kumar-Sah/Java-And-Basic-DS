package DSA.ImpQues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for (int i =0; i < n ;i++){
            al.add(sc.nextInt());
        }

        int size = n-k+1;

        for (int i =0; i <= n - size ;i++){

            System.out.println(findMin(al,size));
            al.remove(0);
        }
    }

    public static int findMin(ArrayList<Integer> al, int size){
        HashSet<Integer> set = new HashSet<>();

        for (int i =0 ; i < size ; i++){
            set.add(al.get(i));
        }

        for(int i = 0; i < Integer.MAX_VALUE; i++){
            if (set.contains(i) == false)
                return i;
        }

        return 0;
    }
}
