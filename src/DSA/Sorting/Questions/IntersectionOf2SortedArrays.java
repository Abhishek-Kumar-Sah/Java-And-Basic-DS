package DSA.Sorting.Questions;

public class IntersectionOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,5,10,10,10,15,15,20};
        int[] arr2 = {5,10,10,15,30};

        int[] arr3 = {1,1,3,3,3};
        int[] arr4 = {1,1,1,1,3,5,7};

        printIntersection(arr1,arr2);
        printIntersection(arr3,arr4);
    }
    public static void printIntersection(int[] arr1, int[] arr2){
        int i =0, j =0;
        while(i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else if (arr1[i] == arr2[j]){
                if (i == 0 || arr1[i-1] != arr1[i])
                    System.out.print(arr1[i]+ " ");
                i++; j++;
            }
        }
        System.out.println();
    }
}
