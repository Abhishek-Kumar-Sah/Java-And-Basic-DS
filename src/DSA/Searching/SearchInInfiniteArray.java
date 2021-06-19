package DSA.Searching;
import DSA.Searching.BinarySearch;
public class SearchInInfiniteArray {
   public static void main(String[] args) {
      int[] arr = new int[99999999];
      for (int i =0 ; i < 99999999; i++){
         arr[i] = i;
      }

      System.out.println(searchFor(arr,9876542));
   }



    public static int searchFor(int[] arr, int number) {
    int  high = 1;

    while (arr[high] <= number){
       high *= 2;
       arr[high] = arr[high];
    }
    if (arr[high] == number)
       return high;


    return BinarySearch.bSearchRecursive(arr,number,high/2 +1,high-1);
    }
}
