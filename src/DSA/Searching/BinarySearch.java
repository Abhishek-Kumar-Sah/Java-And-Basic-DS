package DSA.Searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr1 = {10,15};
        int[] arr2 = {10,10};
        int[] arr3 = {1,2,3,5,6,7};

        System.out.println(bSearchIterative(arr1,20) +"  "+ bSearchRecursive(arr1,20,0,arr1.length-1));
        System.out.println(bSearchIterative(arr1,5)  +"  "+ bSearchRecursive(arr1,5,0,arr1.length-1));
        System.out.println(bSearchIterative(arr2,10) +"  "+ bSearchRecursive(arr2,10,0,arr2.length-1));
        System.out.println(bSearchIterative(arr3,6)  +"  "+ bSearchRecursive(arr3,6,0,arr3.length-1));
    }



    public static int bSearchIterative(int[] arr , int number){
        int low = 0, high = arr.length-1;

        while (low <= high){

            int midIndex = (low+high) / 2;

            if (arr[midIndex] == number)
                return midIndex;
            else if (arr[midIndex] > number)
                high = midIndex-1;
            else
                low = midIndex+1;
        }
        return -1;
    }

    public static int bSearchRecursive(int[] arr , int number , int low , int high){

        if (low > high)
            return -1;

        int midIndex = (low+high) /2;

        if (arr[midIndex] == number)
            return midIndex;

        if (arr[midIndex] > number)
            return bSearchRecursive(arr,number,low,midIndex-1);
        else
            return bSearchRecursive(arr,number,midIndex+1,high);
    }
}
