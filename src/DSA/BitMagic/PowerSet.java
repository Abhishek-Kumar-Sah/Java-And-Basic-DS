package DSA.BitMagic;

public class PowerSet {

    public static void main(String[] args) {
        printAllPermutations("abc");
    }

    //To find all the permutations of characters in a string . NOT in lexicographical order
    public static void printAllPermutations(String str){

        int n = str.length();
        int maxNum = (int)Math.pow(2,n);

        for (int i =0 ; i < maxNum ; i++){
            for (int j =0 ; j < n ; j++){
                if ((i & (1 << j)) != 0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
