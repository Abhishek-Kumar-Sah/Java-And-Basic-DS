package DSA.String;

import java.util.ArrayList;

public class PatternSearching_RABIN_KARP_ALGO {

    public static void main(String[] args) {

        String s = "android is not just android it is a whole lot than android";
        String p = "android";

        System.out.println(rabinKarpPatternSearch(s,p));
    }




    public static ArrayList<Integer> rabinKarpPatternSearch(String text, String pattern){
        ArrayList<Integer> al = new ArrayList<>();


        int patternHash = 0 , textHash =0 , d = 7 , h = 1;
        final int HUGE_PRIME_NO = 99999997;

        //Calculate hash for pattern and first window of text.
        //Hash can go beyond int range so take mod of a huge prime no.
        for (int i =0 ; i < pattern.length() ; i++){
            patternHash = (patternHash * d + (int)pattern.charAt(i)) % HUGE_PRIME_NO;

            textHash = (textHash * d + (int)text.charAt(i)) % HUGE_PRIME_NO;

            // h is Math.pow(h, d-1)....it will be used in next loop
            if (i > 0)
            h = (h * d) % HUGE_PRIME_NO ;
        }



        for (int i =0; i <= text.length() - pattern.length() ; i++){

            if (textHash == patternHash){ // if hash matches , check each char to prevent Spurious hit.

                int j =0;
                for (; j < pattern.length() ; j++){
                    if (text.charAt(i+j) != pattern.charAt(j))
                        break;
                }
                if (j == pattern.length())
                    al.add(i);
            }

            // Compute hash value of next window by removing first element of current window
            // and adding last element of next window.
            if (i < text.length() - pattern.length()) {

                textHash = ( d * (textHash - (int) text.charAt(i) * h)
                        + (int) text.charAt(i + pattern.length()) )  % HUGE_PRIME_NO;
                if (textHash < 0)
                    textHash += HUGE_PRIME_NO;
            }
        }


        return al;
    }
}
