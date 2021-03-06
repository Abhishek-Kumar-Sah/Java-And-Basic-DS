package DSA.Recursion;

import java.util.Scanner;

public class FactorialOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(factorial(n));
    }
    public static long factorial(long n){
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
}
