package DSA.Mathematics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(Math.max(a,b)-Math.min(a,b),b));
        System.out.println(gcdEuclid(a,b));

    }

    //funcion for Greatest Commom Divisor

    public static int gcd(int a , int b){

        int gcd = Math.min(a,b) ;
        for (int i =gcd; i > 0 ; i--){
            if(a%i ==0 && b%i ==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }

    //Euclid's Algorithm

    public static int gcdEuclid(int a , int b){

        if (b == 0)
            return a;
        else
            return gcdEuclid(b,a%b);
    }
}
