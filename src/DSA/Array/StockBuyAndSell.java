package DSA.Array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr1 = {1,5,3,8,12};
        int[] arr2 = {30,20,10};
        int[] arr3 = {10,20,30};
        int[] arr4 = {1,5,3,1,2,8};

        System.out.println(maxProfit(arr1));
        System.out.println(maxProfit(arr2));
        System.out.println(maxProfit(arr3));
        System.out.println(maxProfit(arr4));
    }
    public static int maxProfit(int[] arr){
        int res = 0;
        for (int i =1 ; i< arr.length ; i++){
            if (arr[i] > arr[i-1]){
                res += arr[i] - arr[i-1];
            }
        }
        return res;
    }
}
