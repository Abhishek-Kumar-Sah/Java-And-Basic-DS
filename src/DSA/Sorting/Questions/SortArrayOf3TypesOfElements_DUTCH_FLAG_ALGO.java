package DSA.Sorting.Questions;

public class SortArrayOf3TypesOfElements_DUTCH_FLAG_ALGO {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 0, 1, 0, 2, 0, 1, 1, 0, 0, 2, 1, 0, 2, 1, 0,};
        sort123(arr1);

        int[] arr2 = {3, 6, 4, 3, 0, 2, 5, 8, 9, 6, 6, 4, 4, 6, 3, 6, 4, 3, 4, 6, 4, 3, 6, 4, 3, 7, 9, 1, 4};
        sortAroundPivot(arr2, 4);

        int[] arr3 = {10, 5, 6, 3, 20, 9, 40, 80, 12, 34, 27, 15, 58, 31, 4, 8, 1, 99, 55};
        partitionAroundARange(arr3, 5, 15);

    }


    //Sort array of 0,1,2 in O(n) and O(1)
    public static void sort123(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1)
                mid++;

            else {
                swap(arr, mid, high);
                high--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }


    // Sort with a given element occurring together & elements < given element in left &
    // & elements > given element in right.
    public static void sortAroundPivot(int[] arr, int pivot) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < pivot) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == pivot)
                mid++;

            else if (arr[mid] > pivot) {
                swap(arr, mid, high);
                high--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

    }


    //Sort in such a way that range given appears together, elements < range to left, elements > range to right
    public static void partitionAroundARange(int[] arr, int fromNumber, int toNumber) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < fromNumber) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] >= fromNumber && arr[mid] <= toNumber)
                mid++;

            else if (arr[mid] > toNumber) {
                swap(arr, mid, high);
                high--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //Swap function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
