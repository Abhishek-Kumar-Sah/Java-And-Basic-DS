package DSA.Sorting.Questions;

//Taking an unsorted array and counting the inversions in it. There are two conditions for the  elements to be inverse:
//arr[i] > arr[j] where i < j : means greater element comes first

public class CountInversionsInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        System.out.println(countInversion(arr,0,4));
    }

    //Main function
    public static int countInversion(int[] arr, int low, int high) {
        int res =0;
        if (high > low) {
            int mid = low + (high - low) / 2;
            res += countInversion(arr, low, mid);
            res += countInversion(arr, mid + 1, high);
            res += countAndMerge(arr, low, mid, high);
        }
        return res;
    }


    private static int countAndMerge(int[] arr, int low, int mid, int high) {
        int s1 = mid - low + 1, s2 = high - mid;
        int[] left = new int[s1];
        int[] right = new int[s2];

        for (int i = 0; i < s1; i++)
            left[i] = arr[low + i];

        for (int i = 0; i < s2; i++)
            right[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = low , res =0;
        while (i < s1 && j < s2) {
            if (right[j] >= left[i]) {
                arr[k] = left[i];
                k++;
                i++;
            } else { //If left[i] > right[j] --> which is required in our question
                arr[k] = right[j];
                res += s1 - i; // If right[j] is smaller than left[i] then it will be smaller than
                // all the elements of left after i. As the left and right arrays are sorted.
                k++;
                j++;
            }
        }

        while (i < s1)
            arr[k++] = left[i++];

        while (j < s2)
            arr[k++] = right[j++];

        return res;
    }
}
