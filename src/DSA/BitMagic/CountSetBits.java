package DSA.BitMagic;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countSetBits(n));
        System.out.println(countSetBitLookUpTable(n));

    }


    //Brain Karningam's Algorithm
    public static int countSetBits(int n){
        if (n ==0)
            return 0;

        else
            return 1 + countSetBits(n & (n-1));
    }

    //LookUp Table Method
    public static int countSetBitLookUpTable(int n){

        int[] table = new int[256];
        initializeTable(table);

        int result = 0;
        while(n > 0) {
            result = result + table[n & 0xff];
            n = n >> 8;
        }
        return result;
    }

    //Pre-processing of LookUp Table
    private static void initializeTable(int[] table){
        table[0] =0;
        for (int i =1 ; i<256 ; i++){
            table[i] = (i&1) + table[i/2];
        }
    }
}
