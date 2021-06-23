package DSA.Sorting;

public class QuickSortUsingHoare {
    public static void main(String[] args) {
        int[] arr = {6,4,9,1,8,3,9,6,3,7,5,14,7,45,10,84,56};

        quickSortUsingHoare(arr,0,arr.length-1);

        for (int a: arr) {
            System.out.print(a+" ");
        }
    }

    //Main Recursive Function
    public static void quickSortUsingHoare(int[] arr, int low , int high){

        if (low < high){// There should be al least 2 elements

            int p = hoarePartition(arr,low,high); //First move elements <= arr[low] to left side and return the index.
            quickSortUsingHoare(arr,low,p); // Sort the left half upto p.
            quickSortUsingHoare(arr,p+1,high); // Now sort the rest half.
        }
    }

    // Hoare partition : which returns the index of element before which every element is <= pivot &
    // & after which every element is >= pivot
    // Pivot is assumed to be first element in hoare partition
    private static int hoarePartition(int[] arr, int low , int high){
        int i = low-1 , j = high +1 , pivot = arr[low];

        while (true){

            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                break;

            swap(arr,i,j);
        }
        return (j);
    }

    //Swap function
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
