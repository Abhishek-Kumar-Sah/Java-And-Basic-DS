package DSA.String;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";

        String s3 = "sillent";
        String s4 = "lisente";

        System.out.println(isAnagramUsingMap(s1,s2));
        System.out.println(isAnagram(s1,s2));

        System.out.println(isAnagramUsingMap(s3,s4));
        System.out.println(isAnagram(s3,s4));
    }


    public static boolean isAnagramUsingMap(String s1 , String s2){

        if (s1.length() != s2.length())
            return false;


        HashMap<Character,Integer> map = new HashMap<>();

        for (int i=0 ; i < s1.length() ; i++){

            map.put(s1.charAt(i) , map.getOrDefault(s1.charAt(i),0) +1);
        }

        for (int i =0; i < s2.length() ; i++){
            if (map.containsKey(s2.charAt(i))){
                if (map.get(s2.charAt(i)) == 1)
                    map.remove(s2.charAt(i));
                else
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            }
            else
                return false;
        }

        return (map.size() == 0);
    }

    //O(n) and O(1) solution.
    public static boolean isAnagram(String s1 , String s2){

        if (s1.length() != s2.length())
            return false;

        int[] count = new int[26];

        for (int i =0; i < s1.length() ; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int a: count) {
            if (a != 0)
                return false;
        }
        return true;
    }
}
