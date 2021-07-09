package DSA.ImpQues;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] arr = {8,4,1,5,0};
        int s =0;
        Arrays.sort(arr);

        for (int i = arr.length-1 ; i >= 0 ; i--){
             s += arr[i] ^ arr[i-1];
        }

        System.out.println(s);
    }
}
