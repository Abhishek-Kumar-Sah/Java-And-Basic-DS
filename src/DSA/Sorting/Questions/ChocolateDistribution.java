package DSA.Sorting.Questions;

// Given an array of n integers where each value represents the number of chocolates in a packet.
// Each packet can have a variable number of chocolates. There are m students, the task is to
// distribute chocolate packets such that:
      // 1. Each student gets one packet.
      // 2. The difference between the number of chocolates in the packet with
      //    maximum chocolates and packet with minimum chocolates given to the students is minimum.

public class ChocolateDistribution {
    public static void main(String[] args) {

        int[] arr1 = {7,3,2,4,9,12,56};
        int[] arr2 = {3,4,1,9,56,7,9,12};

        System.out.println(differenceInChocolateDistribution(arr1,3));
        System.out.println(differenceInChocolateDistribution(arr2,5));
    }


    //Main Function
    public static int differenceInChocolateDistribution(int[] arr, int noOfStudents){

        mergeSort(arr,0,arr.length-1);

        //Find the students whose difference gives min value.
        int res = arr[noOfStudents-1] - arr[0];

        for (int i=1; i <= arr.length - noOfStudents ; i++){
            res = Math.min(res,arr[i + noOfStudents -1] - arr[i]);
        }

        return res;
    }

    //Function for merge sort
    private static void mergeSort(int[] arr, int low, int high){

        if (low < high){
            int mid = low + (high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    //Function for merging.
    private static void merge(int[] arr, int low , int mid , int high){
        int sL = mid - low +1, sR = high-mid;

        int[] left = new int[sL];
        int[] right = new int[sR];

        for (int i= low ; i <= mid; i++){
            left[i-low] = arr[i];
        }
        for (int i = mid+1; i <= high ; i++){
            right[i-mid-1] = arr[i];
        }

        int i = 0, j = 0, k = low;
        while (i < sL && j < sR){
            if (left[i] < right[j])
                arr[k++] = left[i++];
             else if (left[i] >= right[j])
                arr[k++] = right[j++];
        }

        while (i < sL)
            arr[k++] = left[i++];
        while (j < sR)
            arr[k++] = right[j++];
    }
}
