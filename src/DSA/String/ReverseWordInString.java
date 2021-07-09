package DSA.String;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "      IntelliJ   is    the  best    platform   for   coding   ";
        String s2 = "abc";

        System.out.println(reverseWordByWord(s));
        System.out.println(reverseWordByWord(s2));
    }


    public static String reverseWordByWord(String s){

        int i = s.length()-1, j = s.length()-1;

        while (s.charAt(i) == ' '){
            i--; j--;
        }

        StringBuilder sb = new StringBuilder();

        while (i >= 0){

            if (i == 0 && s.charAt(i) != ' ')
                sb.append(s.substring(i,j+1) + " ");

            if (i < s.length() -1 && s.charAt(i) != ' ' && s.charAt(i+1) == ' ')
                j = i;

            else if (s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                //print
                sb.append(s.substring(i+1,j+1) + " ");
            }
            i--;
        }

        return sb.toString();
    }


}
