package DSA.ImpQues;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        double k = sc.nextDouble();

        double[] arr1 = new double[n];
        for (int i =0 ; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        double[] arr2 =new double[m];
        for (int i =0 ; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        for (int i =0 ; i < m; i++){
            arr2[i] *= -1;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i =0 ; i < m; i++){
            arr2[i] *= -1;
        }

        for (int i =1 ; i < n; i++){
            arr1[i] += arr1[i-1];
        }

        for (int i =1 ; i < m; i++){
            arr2[i] += arr2[i-1];
        }

        if (arr1[n-1] > arr2[m-1]){
            System.out.println("YES");
            return;
        }

        int x = Math.min(n,m);

        for (int i =0 ; i < x; i++){

            if (arr2[i] >= arr1[i]){
                System.out.println("NO");
                return;
            }

        }
        int j = x;
        while (j < m){
            if (arr2[j++] >= arr1[x-1]){
                System.out.println("NO");
                return;
            }

        }

        System.out.println("YES");

    }


}
