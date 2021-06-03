package DSA.Recursion;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(isPalindrome(s , 0 , s.length()-1));
    }

    public static boolean isPalindrome (String str, int startIndex , int endIndex){

        if (startIndex >= endIndex)
            return true;
        else
            return (str.charAt(startIndex) == str.charAt(endIndex)  &&  str.charAt(startIndex + 1) == str.charAt(endIndex - 1));
    }
}
