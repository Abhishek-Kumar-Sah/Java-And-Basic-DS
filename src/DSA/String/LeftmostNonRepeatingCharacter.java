package DSA.String;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "hishek";

        System.out.println(leftmostNonRepeatingCharacter(s));
    }



    public static int leftmostNonRepeatingCharacter(String s){

        int[] count = new int[256];
        Arrays.fill(count,-1);

        for (int i =0; i< s.length() ; i++){

            if (count[s.charAt(i)] == -1)
                count[s.charAt(i)] = i;
            else
                count[s.charAt(i)] = -2;
        }

        int ans = s.length();
        for (int a : count) {

            if (a > -1)
               ans = Math.min(ans,a);
        }

        return ans;
    }
}
