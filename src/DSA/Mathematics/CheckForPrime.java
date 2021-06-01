package DSA.Mathematics;

import java.util.Scanner;

public class CheckForPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if (n == 2|| n==3)
            return true;
        if (n % 2 ==0) isPrime =false;
        if (n % 3 ==0) isPrime =false;
        for(int i =5 ; i*i <= n ; i = i + 6){
            if(n % i ==0 || n % (i+2) ==0) isPrime = false;
        }

        return isPrime;
    }
}
