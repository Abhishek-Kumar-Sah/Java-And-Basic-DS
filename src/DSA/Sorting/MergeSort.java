package DSA.Sorting;
import DSA.Sorting.Questions.MergeFunctionOfMergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,6,1,8,2,3,9,0,7,5,6,2,41,7,50};

        mergeSort(arr,0,arr.length-1);

        for (int a: arr) {
            System.out.print(a+" ");
        }
    }



    public static void mergeSort(int[] arr, int low, int high){
        if (low < high){
            int mid = low + (high-low)/2 ;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            MergeFunctionOfMergeSort.mergeFunction(arr,low,mid,high);
        }
    }
}
