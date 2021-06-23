package DSA.Sorting.Questions;

// Segregation in array of 2 types of elements using Hoare partition.

public class SortArrayOf2TypesOfElements {
    public static void main(String[] args) {

        int[] arr1 = {0,13,45,0,-8,6,-34,6,2,-8,-3,5,4,0};
        segregatePositiveNegative(arr1);

        int[] arr2 = {4,3,7,8,6,1,2,87,45,96,35,29,11,90,0};
        segregateEvenOdd(arr2);

        int[] arr3 = {1,0,1,1,1,0,0,1,0,1,0,0,0,1,1};
        segregate0And1(arr3);

    }

    // Segregate -ve element at left side and non -ve on right side.
    public static void segregatePositiveNegative(int[] arr){
        int i = -1, j = arr.length;

        while (true) {
            do {
                i++;
            } while (arr[i] < 0);

            do {
                j--;
            } while (arr[j] >= 0);

            if (i >= j)
                break;

            swap(arr, i, j);
        }

        for (int a: arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    //Segregate even and odd numbers.
    public static void segregateEvenOdd(int[] arr){
        int i = -1, j = arr.length;

        while (true){

            do {
                i++;
            }while ((arr[i] & 1) == 0);

            do {
                j--;
            }while ((arr[j] & 1) != 0);

            if (i >= j)
                break;

            swap(arr,i,j);
        }

        for (int a: arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }


    //Segregate 0 and 1
    public static void segregate0And1(int[] arr){
        int i = -1, j = arr.length;

        while (true){

            do {
                i++;
            }while (arr[i] == 0);

            do {
                j--;
            }while (arr[j] == 1);

            if (i >= j)
                break;

            swap(arr,i,j);
        }

        for (int a: arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }



    //Swap function
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
