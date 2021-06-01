package DSA.Mathematics;

import java.util.Scanner;

import static DSA.Mathematics.GCD.gcdEuclid;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(lcm(a,b));
    }
    public static int lcm(int a , int b){
        return a*b / gcdEuclid(a,b);
    }
}
