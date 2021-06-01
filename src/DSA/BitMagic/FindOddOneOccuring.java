package DSA.BitMagic;


public class FindOddOneOccuring {

    public static void main(String[] args) {

        int[] arr1 = {0,0,1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9,};
        System.out.println(findOddOneOccuring(arr1));
        int[] arr2 = {0,0,1,1,2,2,3,3,4,5,6,6,7,7,8,8,9,9,};
        find_2_OddOnes(arr2);
    }

    public static int findOddOneOccuring(int[] arr){
        int oddOne = 0;
        for(int i =0 ; i < arr.length ; i++){
            oddOne = oddOne ^ arr[i];
        }
        return oddOne;
    }

    public static void find_2_OddOnes(int[] arr){
        int xorOf2Nos = 0;

        for (int i=0 ; i < arr.length ;i++){
            xorOf2Nos = xorOf2Nos ^ arr[i];
        }
        int lastBit = xorOf2Nos & ~(xorOf2Nos-1);

        int res1 =0, res2 =0;

        for (int i=0 ; i < arr.length ;i++){
            if ((arr[i] & lastBit) == 0 )
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1+" "+res2);
    }
}
