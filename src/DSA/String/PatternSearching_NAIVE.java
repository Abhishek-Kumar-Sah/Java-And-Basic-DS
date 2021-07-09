package DSA.String;

import java.util.ArrayList;

public class PatternSearching_NAIVE {
    public static void main(String[] args) {

        String s = "android is not just android it is a whole lot than android";
        String p = "android";

        System.out.println(patternSearching_Naive(s,p));
    }


    public static ArrayList<Integer> patternSearching_Naive(String text, String pattern){

        ArrayList<Integer> al = new ArrayList<>();

        for (int i =0; i <= text.length() - pattern.length() ; i++){

            int j =0;
            for (; j < pattern.length() ; j++){
                if (text.charAt(i+j) != pattern.charAt(j))
                    break;
            }
            if (j == pattern.length())
                al.add(i);
        }

        return al;
    }
}
