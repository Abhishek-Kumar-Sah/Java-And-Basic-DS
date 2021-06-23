package DSA.Searching;

public class MinElementInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        System.out.println(minElementInSortedRotatedArray(arr));

    }
    public static int minElementInSortedRotatedArray(int[] arr){
        int low = 0, high = arr.length-1;
        while ( low <= high){
            int mid = (low + high)/2;
            if (mid > low && arr[mid-1] > arr[mid])
                return arr[mid];

            if (mid < high && arr[mid+1] < arr[mid])
                return arr[mid+1];

            if (arr[mid] > arr[low])
                low = mid +1;
            else
                high = mid -1;
        }
        return arr[0];
    }
}
