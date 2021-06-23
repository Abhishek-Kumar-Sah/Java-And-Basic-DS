package DSA.Sorting;

public class RadixSort {

    public static void main(String[] args) {
        int[] arr = {4,3,7,66,44,8,7,56,34,3,645,635,7,356,223,54,2,4,2,34,52,76,652,45,
                    735,6,74,6,8467,84,7,845,6,45,6,745,67,45,67,456};

        for (int a: radixSort(arr)) {
            System.out.print(a +" ");
        }
    }



    //Main Function
    public static int[] radixSort(int[] arr){

        int max =0;
        for (int a: arr) {
            max = Math.max(max,a);
        }

        for (int divisor = 1 ; max/divisor > 0 ; divisor = divisor*10){ // Until the max element becomes 0
            cycleSort(arr,divisor);
        }

        return arr;
    }


    //Cycle sort as sub-routine for Radix sort.
    private static void cycleSort(int[] arr, int divisor){

        int[] count = new int[10]; // Because inputs will lie in 0 to 9 : range of a single digit.

        for (int i = 0 ; i < arr.length ; i++){
            count[(arr[i]/divisor) % 10]++;
        }

        for (int i =1 ; i < count.length ; i++){
            count[i] = count[i-1] + count[i];
        }

        int[] output = new int[arr.length];

        for (int i = arr.length-1; i >= 0 ; i--){
            output[count[(arr[i]/divisor) % 10] -1] = arr[i];

            count[(arr[i]/divisor) % 10]--;
        }

        for (int i = 0; i <arr.length ; i++){
            arr[i] = output[i];
        }
    }
}
