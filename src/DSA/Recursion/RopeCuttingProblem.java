package DSA.Recursion;

//Cut a total of n length rope into any of a,b,c length to get max no. of ropes
//No rope length should b left at the end

import java.util.Scanner;

public class RopeCuttingProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(noOfPieces(n,a,b,c));
        System.out.println(noOfPiecesGfG(n,a,b,c));
    }

    public static int noOfPieces(int n , int a, int b , int c){

        if ( (n & 1) == 1 && (a & 1) ==0 && (b & 1) ==0 && (c & 1) ==0  ||  n < 0)
            return -1;

        if (n == 0)
            return 0;

        else
            return  Math.max(1+noOfPieces(n - a,a,b,c) , Math.max(1+noOfPieces(n - b, a,b,c),1+noOfPieces(n - c , a,b,c)));
    }

    public static int noOfPiecesGfG(int n , int a, int b, int c){
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res ;
        res =  Math.max(noOfPieces(n - a,a,b,c) , Math.max(noOfPieces(n - b, a,b,c),noOfPieces(n - c , a,b,c)));

        if (res == -1)
            return -1;
        else
            return res + 1;
    }
}
