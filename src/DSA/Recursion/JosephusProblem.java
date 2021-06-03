package DSA.Recursion;

import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(josephus(n,k));

    }

    public static int josephus(int noOfPersons, int killingPosition){

        if (noOfPersons == 1)
            return 0;

        else
            return (josephus(noOfPersons-1,killingPosition) + killingPosition) % noOfPersons;
    }

}
