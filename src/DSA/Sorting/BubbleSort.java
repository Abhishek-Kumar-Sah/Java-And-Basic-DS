package DSA.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,5,2,4,8,6,2,0,1};
        for (int a:
             bubbleSort(arr)) {
            System.out.print(a+" ");
        }
    }


    public static int[] bubbleSort(int[] arr){
        for (int i=0; i < arr.length -1; i++){
            boolean swapping = false;

            for (int j = 0; j < arr.length - i-1 ; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapping = true;
                }
            }
            if (!swapping) break; // If swapping remains false , means no swapping was done
                                  // and array is already sorted.
        }
        return arr;
    }
}
