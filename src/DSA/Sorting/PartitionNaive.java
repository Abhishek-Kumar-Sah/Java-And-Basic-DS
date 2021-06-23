package DSA.Sorting;

//Partition array around a given element , elements <= given element should come in left and rest in right.
//Sorting not required

//This method of partitioning is stable. But TIME EXPENSIVE.

public class PartitionNaive {
    public static void main(String[] args) {
        int[] arr = {10,80,40,20,21,70,50,19,48,21};
        for (int a: partitionNaive(arr,21)) {
            System.out.print(a+ " ");
        }
    }
    public static int[] partitionNaive(int[] arr, int number){
        int[] ans = new int[arr.length];
        int k =0;

        for (int i =0; i < arr.length ; i++){
            if (arr[i] < number)
                ans[k++] = arr[i];
        }
        for (int i =0; i < arr.length ; i++){
            if (arr[i] == number)
                ans[k++] = arr[i];
        }
        for (int i =0; i < arr.length ; i++){
            if (arr[i] > number)
                ans[k++] = arr[i];
        }

        return ans;
    }
}
