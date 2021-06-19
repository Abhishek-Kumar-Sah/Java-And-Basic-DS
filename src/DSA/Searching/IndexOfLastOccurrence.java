package DSA.Searching;

public class IndexOfLastOccurrence {
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,20,40,40};
        int[] arr2 = {5,8,8,10,10};
        int[] arr3 = {8,10,10,12};

        System.out.println(lastIndexOfOccurrence(arr1,20));
        System.out.println(lastIndexOfOccurrence(arr2,10));
        System.out.println(lastIndexOfOccurrence(arr3,7));
    }
    public static int lastIndexOfOccurrence(int[] arr, int number){
        int low = 0, high = arr.length-1;

        while (low <= high){
            int midIndex = (low + high) / 2;
            if (arr[midIndex] == number){
                if (midIndex == arr.length-1 || arr[midIndex + 1] != number)
                    return midIndex;
                else
                    low = midIndex +1;
            }

            if (arr[midIndex] > number)
                high = midIndex -1;

            else
                low = midIndex +1;
        }
        return -1;
    }
}
