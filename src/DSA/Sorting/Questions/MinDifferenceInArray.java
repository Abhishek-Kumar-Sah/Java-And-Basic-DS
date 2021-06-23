package DSA.Sorting.Questions;

//Find min diff between any two elements in an array

public class MinDifferenceInArray {

    public static void main(String[] args) {
        int[] arr = {10,20,32,56,7,44};

        System.out.println(minDiff(arr));

    }

    //Main function
    public static int minDiff(int[] arr){

        quickSort(arr,0,arr.length-1);

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <arr.length; i++){
            min = Math.min(min,arr[i] - arr[i-1]);
        }

        return min;
    }

    //Function for sorting
    private static void quickSort(int[] arr, int low , int high){

        if (low < high){

            int partition = hoarePartition(arr,low,high);
            quickSort(arr,low,partition);
            quickSort(arr,partition+1,high);
        }
    }

    private static int hoarePartition(int[] arr , int low , int high){
        int i = low-1, j = high+1, pivot = arr[low];
        while (true){

            do {
                i++;
            }while (arr[i] < pivot);

            do {
                j--;
            }while (arr[j] > pivot);

            if (i >= j)
                break;

            swap(arr,i,j);
        }

        return j;
    }

    //Swap function
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
