package DSA.Searching;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {15,20,40,30,20,50,60,30,50,10,40,60};

        System.out.println(peakElement(arr));
    }

    public static int peakElement(int[] arr){
        int low =0, high = arr.length-1;
        while (low <= high){
            int mid = (low+high) /2;
            if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == arr.length-1 || arr[mid+1] <= arr[mid]))
                return mid;

            else
                if (mid > 0 && arr[mid-1] >= arr[mid])
                    high = mid -1;
                else low = mid +1;
        }
        return -1;
    }
}
