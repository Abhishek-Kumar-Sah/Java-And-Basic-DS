package DSA.BitMagic;

import java.util.Scanner;

public class Check_Kth_Bit_IsSetOrNot {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(KthBitIsSetOrNot(n,k));
        System.out.println(KthBitByRightShift(n,k));
    }
    public static boolean KthBitIsSetOrNot(int n, int k){
        return ((n & (1 << (k-1))) != 0);
    }

    public static boolean KthBitByRightShift(int n , int k){
        return ((n >> (k-1) & 1) !=0);
    }
}
