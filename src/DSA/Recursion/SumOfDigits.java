package DSA.Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        if (n <= 9)
            return n;
        else
            return n % 10 + sumOfDigits(n/10);
    }
}
