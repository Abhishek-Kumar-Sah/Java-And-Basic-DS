package DSA.Array;
//find arr[j] - arr[i] , where j > i

public class MaximumDifference {

    public static void main(String[] args) {
        int[] arr1 = {2,3,10,6,4,8,1};
        int[] arr2 = {7,9,5,6,3,2};
        int[] arr3 = {10,20,30};
        int[] arr4 = {30,10,8,2};


        System.out.println(maxDiff(arr1)+"  "+ maxDiffEfficient(arr1));
        System.out.println(maxDiff(arr2)+"  "+ maxDiffEfficient(arr2));
        System.out.println(maxDiff(arr3)+"  "+maxDiffEfficient(arr3));
        System.out.println(maxDiff(arr4)+"  "+maxDiffEfficient(arr4));

    }


    public static int maxDiff(int[] arr){
        int max = (int) -Math.pow(2,31);
        for (int i =0 ; i <arr.length ;i++){
            for (int j = i+1 ; j < arr.length ; j++){
               max = Math.max(max, arr[j] - arr[i]);
            }
        }
        return max;
    }


    public static int maxDiffEfficient(int[] arr){
         int min = arr[0], max = (int) -Math.pow(2,31);
         for (int i=1 ; i < arr.length ; i++){
             max = Math.max(max, arr[i] - min);
             min = Math.min(min ,arr[i]);
        }
         return max;
    }
}
