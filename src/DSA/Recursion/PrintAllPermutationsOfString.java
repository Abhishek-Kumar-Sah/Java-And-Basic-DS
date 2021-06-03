package DSA.Recursion;

import java.util.Scanner;

public class PrintAllPermutationsOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printAllPermutations(str);
    }



    public static void printAllPermutations(String str){
        printAll(str,0);
    }

    //main function
    public static void printAll(String string,int startIndex){
        if (startIndex == string.length()-1){
            System.out.print(string+" ");
            return;
        }

        for (int j = startIndex; j < string.length() ; j++){

            string = swap(string,startIndex,j);
            printAll(string,startIndex+1);
            string = swap(string,j,startIndex);
        }
    }

    public static String swap(String str, int i , int j){

        char[] c = str.toCharArray();

        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

        String swappedString = new String(c);

        return swappedString;
    }
}
