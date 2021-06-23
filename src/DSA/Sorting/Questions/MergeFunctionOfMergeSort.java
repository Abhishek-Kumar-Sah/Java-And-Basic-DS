package DSA.Sorting.Questions;

//Here we take a single array with three points namely, the lower, the middle and the highest point.
//The elements from the lower to the middle are sorted and the elements from the (middle+1) to the
//higher are sorted. The task is to merge these two sorted parts into one.

public class MergeFunctionOfMergeSort {

    public static void main(String[] args) {
        int[] arr = {10,15,20,40,8,11,55};
        mergeFunction(arr,0,3,6);
        for (int a: arr) {
            System.out.print(a+" ");
        }
    }



    public static void mergeFunction(int[] arr, int low , int mid, int high){
        int[] left = new int[mid-low+1];
        int[] right = new int[high - mid];

        for (int i =low ; i <= mid ;i++){
            left[i-low] = arr[i];
        }
        for (int i = mid+1 ; i <= high ; i++){
            right[i-(mid+1)] = arr[i];
        }


        int i =0, j=0, k=low;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                arr[k] = left[i];
                k++; i++;
            }
            else{
                arr[k] = right[j];
                k++; j++;
            }
        }

        while (i < left.length){
            arr[k] = left[i];
            k++; i++;
        }

        while (j < right.length){
            arr[k] = right[j];
            k++; j++;
        }
    }
}
