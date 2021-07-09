package DSA.String;

public class CheckForSubsequence {
    public static void main(String[] args) {
        String s1 = "abhishek";
        String s2 = "hhk";

        System.out.println(isSubsequence(s1,s2));
        System.out.println(isSubsequenceRecursive(s1,s2,0,0));
    }

    public static boolean isSubsequence(String s1 , String s2){
        int i =0, j=0;

        for (; i< s1.length(); i++){

            if (s2.charAt(j) == s1.charAt(i)) {
                j++;
            }
        }

        return (j == s2.length());
    }

    public static boolean isSubsequenceRecursive(String s1,String s2, int i, int j){

        if (j == s2.length())
            return true;

        if (i == s1.length())
            return false;

        if (s1.charAt(i) == s2.charAt(j))
            return isSubsequenceRecursive(s1,s2,i+1,j+1);
        else
            return isSubsequenceRecursive(s1,s2,i+1,j);
    }
}
