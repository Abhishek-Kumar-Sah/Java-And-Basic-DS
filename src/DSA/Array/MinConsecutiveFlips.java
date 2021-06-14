package DSA.Array;
//Given a binary array, we need to find the minimum of number of group flips to make all
//array elements same.  In a group flip, we can flip any set of consecutive 1s or 0s.
public class MinConsecutiveFlips {
    public static void main(String[] args) {

        int[] arr1 = {1,1,0,0,0,1,1,1,0,0,1,0};
        int[] arr2 = {0,0,0,1,1,1,0,0,1,0,0,0,1,1,1,1,1,1,0,0,0,1,0,1,0};

        getMinFlips(arr1);
        System.out.println();
        System.out.println("---------------------");
        getMinFlips(arr2);
    }



    public static void getMinFlips(int[] arr){
        int firstGrpElement = arr[0];

        for (int i = 1 ; i< arr.length ; i++){
            if (arr[i] != firstGrpElement && arr[i-1] == firstGrpElement)
                System.out.print("Flip " + arr[i] +" From Index "+ i);

            if (arr[i] == firstGrpElement && arr[i-1] != firstGrpElement) {
                System.out.print(" To Index " + (i-1));
                System.out.println();
            }
        }
    }
}
