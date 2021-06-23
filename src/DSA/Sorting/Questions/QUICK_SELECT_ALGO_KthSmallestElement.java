package DSA.Sorting.Questions;

// All Elements are distinct

public class QUICK_SELECT_ALGO_KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,5,30,12,60,12,23,17,25,3,32,41,80};

        System.out.println(kthSmallestElement(arr,5));
    }


    public static int kthSmallestElement(int[] arr,int k){

        int low =0, high = arr.length-1;

        while (low < high){
            int p = lomutoPartition(arr,low,high); // Check which element is being fixed in its correct place

            if (p == k-1)
                return arr[p];
            else if (p > k-1)
                high = p-1;
            else
                low = p+1;
        }
        return -1;
    }



    private static int lomutoPartition(int[] arr, int low , int high){
        int i = low -1 , pivot = arr[high];

        for (int j = low ; j < high ; j++){
            if (arr[j] <= pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);

        return i+1;
    }

    private static void swap (int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
