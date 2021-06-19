package DSA.Searching;

public class IndexOfFirstOccurrence {

    public static void main(String[] args) {
        int[] arr1 = {1,10,10,10,20,20,40};
        int[] arr2 = {10,20,30};
        int[] arr3 = {15,15,15};

        System.out.println(indexOfFstOccrr(arr1,20) +"  "+ indexOfFstOccrrRecursion(arr1,0,arr1.length-1,20));
        System.out.println(indexOfFstOccrr(arr2,15) +"  "+ indexOfFstOccrrRecursion(arr2,0,arr2.length-1,15));
        System.out.println(indexOfFstOccrr(arr3,15) +"  "+ indexOfFstOccrrRecursion(arr3,0,arr3.length-1,15));
    }

    //Binary Search Approach
    public static int indexOfFstOccrr(int[] arr, int number){
        int low = 0, high = arr.length-1 , res = -1;

        while (low <= high){

            int midIndex = (low+high) / 2;

            if (arr[midIndex] == number) {
                res = midIndex;

                if (midIndex == 0 || arr[midIndex-1] != arr[midIndex]) break;

                high = midIndex-1;
            }

            else if (arr[midIndex] > number)
                high = midIndex-1;
            else
                low = midIndex+1;
        }
        return res;
    }


    //Recursive Method
    public static int indexOfFstOccrrRecursion(int[] arr, int low, int high, int number){
        if (low > high)
            return -1;

        int midIndex = (high + low) /2;

        if (arr[midIndex] > number)
            return indexOfFstOccrrRecursion(arr,low,midIndex-1,number);

        if (arr[midIndex] < number)
            return indexOfFstOccrrRecursion(arr,midIndex+1,high,number);

        else
            if (midIndex == 0 || arr[midIndex-1] != arr[midIndex])
                return midIndex;
            else
            return indexOfFstOccrrRecursion(arr,low,midIndex-1,number);
    }
}

