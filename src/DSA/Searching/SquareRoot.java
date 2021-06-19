package DSA.Searching;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(squareRoot(n));
    }

    public static int squareRoot(int number){
        int low = 1, high = number;
        while (low <= high){
            int mid = (low + high) /2;
            int product = mid*mid;
            if (product > number)
                high = mid -1;
            else if (product == number)
                return mid;

            else{
                if ((mid+1) * (mid+1) > number)
                    return mid;
                else
                    low = mid+1;
            }
        }
        return 0;
    }
}
