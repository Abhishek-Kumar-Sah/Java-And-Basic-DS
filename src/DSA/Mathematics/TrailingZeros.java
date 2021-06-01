package DSA.Mathematics;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(noOfTrailingZeros(n));
    }
    public static int noOfTrailingZeros(int n){
        int trailingZeros =0;

        for( int i =5 ; i < n ;i= i*5){
            trailingZeros = trailingZeros + n/i ;}
        return trailingZeros;
    }

}
