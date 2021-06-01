package DSA.BitMagic;

import java.util.Scanner;

public class CanBeRepresentedAsPowOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(canBeRepresentedAsPowOf2(n));
    }

    public static boolean canBeRepresentedAsPowOf2(int n){
        return ((n & (n-1)) ==0 );
    }
}
