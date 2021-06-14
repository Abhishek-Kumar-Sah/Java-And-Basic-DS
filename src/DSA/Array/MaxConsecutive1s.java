package DSA.Array;

public class MaxConsecutive1s {

    public static void main(String[] args) {
        int[] arr1 = {0,0,1,1,1,1,0,1,0,1,0,1,1,0,0,1,1,1,1,1,1,0};
        System.out.println(max1s(arr1));
    }
    public static int max1s(int[] arr){
        int count =0, res =0;
        for (int i=0; i<arr.length ;i++){
            if (arr[i] == 1){
                count++;
            }
            res = Math.max(res,count);
            if (arr[i] ==0)
            count =0;
        }
        return res;
    }
}
