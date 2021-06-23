package DSA.Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4,6,2,9,5,2,4,8,6,2,0,1};
        for (int a:
                selectionSort(arr)) {
            System.out.print(a+" ");
        }
    }
    public static int[] selectionSort(int[] arr){
        for (int i =0 ; i < arr.length-1; i++){
            int min = i;
            for (int j =i+1 ; j < arr.length ; j++){
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
