package DSA.Array;

import java.sql.Time;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr){
        reverse(arr,0,0);

    }

    //Main Function
    public static void reverse(int[] arr,int startIndex,int curr){
        if (startIndex == arr.length) {
            return;
        }
        curr = arr[startIndex];

        reverse(arr,startIndex+1,curr);

        System.out.print(curr + " ");
        }
    }

