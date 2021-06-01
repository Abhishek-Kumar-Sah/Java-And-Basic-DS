package DSA.Mathematics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static DSA.Mathematics.CheckForPrime.isPrime;

public class All_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(printAllDivisors(n));
    }
    public static ArrayList<Integer> printAllDivisors(int n){
        ArrayList<Integer> allDivisors = new ArrayList<>();
        allDivisors.add(1);
        allDivisors.add(n);

        if (isPrime(n)) {
            return allDivisors;
        }

        for (int i = 2 ; i*i <= n ; i++){
            if (n % i ==0){
                allDivisors.add(i);
                allDivisors.add(n/i);
            }
        }

        Collections.sort(allDivisors);
        return allDivisors;
    }
}
