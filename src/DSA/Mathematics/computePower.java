package DSA.Mathematics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class computePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(pow(n,m));
    }
    public static int pow(int n, int m){
        if (m ==0)
            return 1;
        if (m % 2 ==0)
            return pow(n*n,m/2);
        else
            return n * pow(n,m-1);

    }
}
