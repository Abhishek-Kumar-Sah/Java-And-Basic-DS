package DSA.Sorting;

//Partition array around a given element , elements <= given element should come in left and rest in right.
//Sorting not required

public class PartitionLomuto {

    public static void main(String[] args) {
        int[] arr = {10,80,40,20,21,70,50,19,48,21};
        for (int a: lomutoPartition(arr,21)) {
            System.out.print(a+ " ");
        }
    }



    public static int[] lomutoPartition(int[] arr, int number){

        //Check if given number is already at last position , if not ....find and place it at last of array.
        int low =0, high = arr.length-1;
        if (arr[high] != number){
            for (int i =0 ; i < high ; i++){
                if (arr[i] == number){
                    swap(arr,i,high);
                    break;
                }
            }
        }

        // Now apply actual Lomuto Partition where the partitioning element should be at the last.
        int i = low -1;
        for (int j = 0 ; j < high ; j++){
            if (arr[j] <= number){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);

        return arr;
    }



    //Swap function
    public static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
