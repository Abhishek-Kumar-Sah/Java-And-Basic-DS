package DSA.Mathematics;

import java.util.ArrayList;
import java.util.Scanner;

import static DSA.Mathematics.CheckForPrime.isPrime;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(primeFactors(n));
    }
    public static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        for(int i = 2 ; i < n  ; i++){
            if (n % i ==0 && isPrime(i)) {
                for (int r = 1 ; (n % Math.pow(i,r)) == 0 ; r++)
                listOfPrimeFactors.add(i);
            }
        }
        return listOfPrimeFactors;
    }
}
