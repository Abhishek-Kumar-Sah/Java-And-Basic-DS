package DSA.Array;

public class SlidingWindow {

    public static void main(String[] args) {

        int[] arr1 = {1, 8, 30, -5, 20, 7};
        int[] arr2 = {5, -10, 6, 90, 3, 8};
        int[] arr3 = {1, 4, 20, 3, 10, 5};
        int[] arr4 = {1, 4, 0, 0, 3, 10, 5};
        int[] arr5 = {2, 4};

        System.out.println(maxSumInWindow(arr1, 3));
        System.out.println(maxSumInWindow(arr2, 2));
        System.out.println(isSubArrayPresent(arr3, 33));
        System.out.println(isSubArrayPresent(arr4, 7));
        System.out.println(isSubArrayPresent(arr5, 3));

        N_BonacciNumbers(3,8);
        N_BonacciNumbers(4,10);
    }

    //To find the max sum sub-array with a given length (<= arr.length)
    public static int maxSumInWindow(int[] arr, int windowLength) {
        int sum = 0, res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < windowLength) {
                sum += arr[i];
                continue;

            } else {
                sum += arr[i] - arr[i - windowLength];
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    //Find subarray with given sum
    public static boolean isSubArrayPresent(int[] arr, int reqSum) {

        int sum = 0, window = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum < reqSum) {
                sum += arr[i];
                window++;
            }

            // Means either sum > reqSum OR sum = reqSum
            // Start removing element from start of window, till sum > reqSum
            while (sum > reqSum) {
                sum -= arr[i - window + 1];
                window--;
            }
            // Means either sum < reqSum OR sum = reqSum
            if (sum == reqSum)
                return true;
        }
        return false;
    }


    //N-bonacci numbers
    public static void N_BonacciNumbers(int N , int noOfDigits){

        int[] arr = new int[noOfDigits];
        int sum =1;

        for (int i = 0 ; i < noOfDigits ; i++){

            if (i < N){
                if (i == N-1)
                    arr[i] =1;
                else
                    arr[i] = 0;
                continue;
            }

            arr[i] = sum ;
            sum += arr[i] - arr[i-N];
        }

        for (int a:
             arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
