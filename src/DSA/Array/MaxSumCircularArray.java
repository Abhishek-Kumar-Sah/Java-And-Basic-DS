package DSA.Array;

public class MaxSumCircularArray {
    public static void main(String[] args) {
        int[] arr1 = {5,-2,3,4};
        int[] arr2 = {2,3,-4};
        int[] arr3 = {8,-4,3,-5,4};
        int[] arr4 = {-3,4,6,-2};
        int[] arr5 = {3,-4,5,6,-8,7};

        System.out.println(maxSumCircular(arr1) +"  "+ maxSumCircularEfficient(arr1));
        System.out.println(maxSumCircular(arr2) +"  "+ maxSumCircularEfficient(arr2));
        System.out.println(maxSumCircular(arr3) +"  "+ maxSumCircularEfficient(arr3));
        System.out.println(maxSumCircular(arr4) +"  "+ maxSumCircularEfficient(arr4));
        System.out.println(maxSumCircular(arr5) +"  "+ maxSumCircularEfficient(arr5));
    }

    //Takes O(n^2) time
    public static int maxSumCircular(int[] arr){
        int max = 0;
        for (int i =0 ; i < arr.length ; i++){
            int currentSum = arr[i];
            int currentMax = arr[i];
            for (int j =1 ; j < arr.length ; j++){

                int index = (i+j) % arr.length;
                currentSum += arr[index];
                currentMax = Math.max(currentMax,currentSum);

            }
            max = Math.max(max,currentMax);
        }
        return max;
    }





    // Takes O(n) time
    public static int maxSumCircularEfficient(int[] arr){
        //Calling support function. Uses Kadane's Algo
        int normalArrayMaxSum = maxSumNormalSubarray(arr);

        if (normalArrayMaxSum < 0) // This means all elements are -ve and no need to find max
                                   // sum of circular arrays as this is the only max sum.
            return normalArrayMaxSum;


        int sumOfAllElements = 0;
        //TO FIND sumOfAllElements(OF NORMAL ELEMENTS) - minSumNormalSubArray(OF NORMAL ELEMENTS))
        //OR
        //sumOfAllElements(OF NORMAL ELEMENTS) - (-maxSumNormalSubArray(OF INVERTED ELEMENTS))
        //will give max sum of only circular sub arrays.

        for (int i =0 ; i <arr.length ; i++){
            sumOfAllElements += arr[i];
            arr[i] = -arr[i];
        }

        int onlyCircularSubArraySum = sumOfAllElements - (-maxSumNormalSubarray(arr));


        return Math.max(normalArrayMaxSum,onlyCircularSubArraySum);
    }


    //Support function for finding max subarray sum of a normal array
    //kadane's Algo
    public static int maxSumNormalSubarray(int[] arr){
        int maxTillPrevElement = arr[0];
        int maxSum = arr[0];
        for (int i = 1 ; i < arr.length ; i++){

            maxTillPrevElement = Math.max(maxTillPrevElement + arr[i], arr[i]);
            maxSum = Math.max(maxSum, maxTillPrevElement);
        }
        return maxSum;
    }
}
