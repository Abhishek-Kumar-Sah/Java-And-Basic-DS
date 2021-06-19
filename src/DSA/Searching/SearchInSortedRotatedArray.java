package DSA.Searching;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {10,20,40,60,5,8};

        System.out.println(searchInSortedRotatedArray(arr,40));
    }
    public static int searchInSortedRotatedArray(int[] arr, int number){
        int low =0, high = arr.length-1;
        while (low <= high){
            int mid = (low+high) /2;
            if (arr[mid] == number)
                return mid;

            else if (arr[low] < arr[mid]){
                if (number >= arr[low] && number < arr[mid])
                    high = mid -1;
                else
                    low = mid +1;
            }

            else
                if (number > arr[mid] && number <= arr[high])
                    low = mid+1;
                else
                    high = mid-1;
        }
        return -1;
    }
}
