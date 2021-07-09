package DSA.String;

// Here it is assumed that the pattern will have all distinct characters.

import java.util.ArrayList;

public class PatternSearchingDistinct_IMPROVED_NAIVE {
    public static void main(String[] args) {

        String s = "android is not just android it is a whole lot than android";
        String p = "android";

        System.out.println(patternSearching_ImprovedNaive(s,p));
    }
    public static ArrayList<Integer> patternSearching_ImprovedNaive(String text, String distinctPattern){

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i <= text.length() - distinctPattern.length() ; ){

            int j =0;
            for (; j < distinctPattern.length() ; j++){
                if (text.charAt(i+j) != distinctPattern.charAt(j))
                    break;
            }

            if (j == 0) // Switch to naive
                i++;

            // If j > 0 , as all char of pattern is distinct, char [i , i+j) cannot match with pattern
                // so move i to i+j
            else if (j == distinctPattern.length()) {
                al.add(i);
                i += j;
            }
            else
                i += j;
        }

        return al;
    }
}
