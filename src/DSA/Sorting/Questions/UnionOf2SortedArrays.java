package DSA.Sorting.Questions;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,5,10,10,10,15,15,20};
        int[] arr2 = {5,10,10,15,30};

        int[] arr3 = {1,1,3,3,3};
        int[] arr4 = {1,1,1,1,3,5,7};

        printUnion(arr1,arr2);
        printUnion(arr3,arr4);
    }
    public static void printUnion(int[] arr1 , int[] arr2){
        int i =0, j= 0;
        while (i < arr1.length && j < arr2.length){

            if (i >0 && arr1[i-1] == arr1[i]){
                i++; continue;
            }
            if (j > 0 && arr2[j-1] == arr2[j]){
                j++; continue;
            }

            if (arr1[i] < arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
            }
            else if (arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++; j++;
            }
        }

        while (i < arr1.length){
            if (i >0 && arr1[i-1] == arr1[i]){
                i++; continue;
            }
            System.out.print(arr1[i]+ " ");
            i++;
        }

        while (j < arr2.length){
            if (j > 0 && arr2[j-1] == arr2[j]){
                j++; continue;
            }
            System.out.print(arr2[j]+ " ");
            j++;
        }
        System.out.println();
    }
}
