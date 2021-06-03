package DSA.Recursion;

import java.util.Scanner;

public class PrintAllSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        printAllSubsets(string,"",0);
    }


        public static void printAllSubsets(String str, String curr , int pointer){
            if (pointer == str.length()) {
                System.out.println(curr);
                return;
            }

            printAllSubsets(str, curr, pointer + 1);
            printAllSubsets(str, curr + str.charAt(pointer), pointer + 1);
        }
    }

