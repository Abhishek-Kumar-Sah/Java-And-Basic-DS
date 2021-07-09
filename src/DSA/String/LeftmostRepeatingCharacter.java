package DSA.String;

import java.util.Arrays;
import java.util.HashMap;


public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "abccb";

        System.out.println(leftmostRepeatingCharacter(s1));
        System.out.println(leftmostRepeatingCharacterUsingMap(s1));

        System.out.println(leftmostRepeatingCharacter(s2));
        System.out.println(leftmostRepeatingCharacterUsingMap(s2));
    }

    // O(n) & O(1)
    public static int leftmostRepeatingCharacter(String s){

        int[] count = new int[256];
        Arrays.fill(count,-1);

        int res = s.length();

        for (int i =0; i < s.length() ; i++){
            if (count[s.charAt(i)] == -1)
            count[s.charAt(i)] = i;

            else
                res = Math.min(res,count[s.charAt(i)]);
        }

        return res;
    }



    //O(n) & O(n)
    public static int leftmostRepeatingCharacterUsingMap(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        int index = s.length();
        boolean found = false;

        for (int i=0; i < s.length() ; i++){

            if (map.containsKey(s.charAt(i))) {
                found = true;
                index = Math.min(index , map.get(s.charAt(i)));
            }
            else
                map.put(s.charAt(i) , i);
        }
        if (found)
            return index;
        else
            return -1;
    }
}
