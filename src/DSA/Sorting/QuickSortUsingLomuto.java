package DSA.Sorting;

public class QuickSortUsingLomuto {
    public static void main(String[] args) {
        int[] arr = {6,4,9,1,8,3,9,6,3,7,5,14,7,45,10,84,56};

        quickSortUsingLomuto(arr,0,arr.length-1);

        for (int a: arr) {
            System.out.print(a+" ");
        }
    }

    //Main Quick Sort function
    public static void quickSortUsingLomuto(int[] arr, int low , int high){

        if (low < high){  // There should be at least 2 elements

            int p = lomutoPartition( arr,low ,high); // First fix the last element to its correct place.
            quickSortUsingLomuto(arr,low,p-1); // Now sort the left half using same concept recursively.
            quickSortUsingLomuto(arr,p+1,high); // Then sort the right half using same concept recursively.
        }
    }

    //Partitioning function : which places the last element(pivot) to its correct place and returns its index.
    // AFTER THIS FUNCTION :
    // All elements to left of pivot is <= pivot & all elements to right of it is > pivot.
    private static int lomutoPartition(int[] arr, int low , int high){
        int i = low-1 , pivot = arr[high];
        for (int j =low; j < high  ; j++){
            if (arr[j] <= pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,high);

        return (i+1);
    }


    //Swap function
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
