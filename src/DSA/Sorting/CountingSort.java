package DSA.Sorting;

//Counting Sort, a linear time sorting algorithm for limited range elements,
// where comparison between elements is not allowed.

public class CountingSort {
    public static void main(String[] args) {
        int[] arr1 = {5,6,2,4,1,3,5,3,1,5,3,6,4,5,2,3,1,0,5,0,0,3,0,0,0,1,2,3,6,3};
        int rangeUpto = 7;

        for (int a: countingSort(arr1,rangeUpto)) {
            System.out.print(a + " ");
        }
        System.out.println();


        int[] arr2 = {36,35,37,40,36,38,37,39,35,39,40,37,36,35,38,40,37,39,35,37,38,40,39,35};
        int rangeFrom = 35 , rangeTo = 41;

        for (int a: countingSortForArbitraryRange(arr2,rangeFrom,rangeTo)) {
            System.out.print(a + " ");
        }
    }



    //Counting sort for 0 to k ranging elements.
    public static int[] countingSort(int[] arr,int rangeUpto){
        // If range given is 5 then numbers from 0 to 4 only be used in given array.
        // Count is the array of number of occurrences of each element from 0 range-1;
        int[] count = new int[rangeUpto];

        // Counting number of occurrences of each element.
        for (int i=0 ;i< arr.length ; i++){
            count[arr[i]]++;
        }

        //Now, the index in count array is the element itself and the value at that index in count
        //array is the number of occurrences.

        //Calculating total number of elements less than a particular element by adding up values
        //before it in count array.
        for (int i=1; i< rangeUpto ; i++){
            count[i] = count[i-1] + count[i];
        }

        //Array to store sorted array.
        int[] output = new int[arr.length];

        // 1. count[arr[i]] gives the number of occurrences of that element arr[i] &

        // 2. (count[arr[i]] - 1) gives the correct sorted index in output array of the element arr[i].

        // 3. After placing arr[i] in its correct position, (count[arr[i]]--;) reduces the number of
        //    occurrences of arr[i] because it is already placed in it's correct position in output array.
        for (int i = arr.length-1 ; i >= 0 ;i--){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        return output;
    }



    //Counting sort for any arbitrary range elements.
    public static int[] countingSortForArbitraryRange(int[] arr,int rangeFrom,int rangeUpto){

        //For arbitrary range count array size becomes difference of that range.
        int[] count = new int[rangeUpto-rangeFrom];

        //To fit in count array indexes,  arr[i] is replaced with (arr[i] - lowLimit)
        for (int i=0 ;i< arr.length ; i++){
            count[arr[i]-rangeFrom]++;
        }

        for (int i=1; i < rangeUpto-rangeFrom ; i++){
            count[i] = count[i-1] + count[i];
        }

        int[] output = new int[arr.length];

        for (int i = arr.length-1 ; i >= 0 ;i--){
            output[count[arr[i] - rangeFrom] - 1] = arr[i];
            count[arr[i] - rangeFrom]--;
        }

        return output;
    }
}
