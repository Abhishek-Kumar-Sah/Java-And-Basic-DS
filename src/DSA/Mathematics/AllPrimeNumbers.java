package DSA.Mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static DSA.Mathematics.CheckForPrime.isPrime;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        allPrimeNos_sieve(n);
    }

    //Seive Algorithm

    public static void allPrimeNos_sieve(int n){
        boolean[] primeNos = new boolean[n+2];
        Arrays.fill(primeNos,true);

        for (int i =2 ; i <= n; i++){
            if (primeNos[i]){
                System.out.print(i+" ");
                for (int j = i*i ; j<=n ; j= j+i)
                    primeNos[j] = false;
            }
        }
    }
}
