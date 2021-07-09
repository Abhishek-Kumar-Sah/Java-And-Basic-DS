package DSA.ImpQues;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = (int)Math.pow(10,9) + 7;
        int size = sc.nextInt();
        int range = sc.nextInt();

        int[] arr = new int[range];

        for (int i =0; i< range ;i++){
            arr[i] = i+1;
        }

        int nos =0;
        for (int i =0; i < range; i++){
            int gcd = gcdEuclid(arr[i],arr[i]);
            for (int j = i; j < range ; j++){
                gcd = gcdEuclid(gcd,arr[j]);
                if (gcd == 1){
                    nos += 1;
                }
                if (gcd == 1){
                    nos += factorial(j-i+1) % h;
                }
            }
        }

    }

    public static long factorial(int n){
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1) % (int)Math.pow(10,9) + 7;
    }
    public static int gcdEuclid(int a , int b){

        if (b == 0)
            return a;
        else
            return gcdEuclid(b,a%b);
    }
}
