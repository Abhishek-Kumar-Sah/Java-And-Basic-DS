package DSA.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,5,2,4,8,6,2,0,1};
        for (int a:
                insertionSort(arr)) {
            System.out.print(a+" ");
        }
    }

    public static int[] insertionSort(int[] arr){
        for (int i =1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
