package DSA.Sorting;

// Hoare Partition which is another method of partitioning. This is better than the previously discussed
// partitioning method .. Lomuto Partition . This method takes constant space and O(n) time for partitioning.
// It also travels the input array only once.

// ---------It assumes the partitioning element to be in first position-------

// DEMERIT -- THIS METHOD DOES NOT PLACES THE PARTITIONING ELEMENT IN IT'S CORRECT POSITION.

public class PartitionHoare {

    public static void main(String[] args) {
        int[] arr = {9,3,8,4,2,7,5,1,10};

        for (int a: hoarePartition(arr,5)) {
            System.out.print(a+" ");
        }
    }


    public static int[] hoarePartition(int[] arr, int number){
        int low = 0, high = arr.length-1;

        if (arr[low] != number){
            for (int i =1 ; i <= high ; i++){
                if (arr[i] == number)
                    swap(arr,0,i);
            }
        }

        //Now apply actual Hoare Partition which requires partitioning element to be at first position.
        int i = low-1, j = high+1;

        while (true) {
            do {
                i++;
            } while (arr[i] < number);

            do {
                j--;
            } while (arr[j] > number);

            if (i >= j)
                break;
            swap(arr,i,j);
        }
        return arr;
    }


    //Swap function
    public static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
