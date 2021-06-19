package DSA.Searching;
import DSA.Searching.IndexOfFirstOccurrence;
import DSA.Searching.IndexOfLastOccurrence;
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4,5,5,5,6,6,6,7,7,7,8,8,8,9,11,11};

        System.out.println(countOccurrences(arr,7));
    }
    public static int countOccurrences(int[] arr, int number){
        int firstOcc = IndexOfFirstOccurrence.indexOfFstOccrr(arr,number);
        if (firstOcc == -1)
            return 0;
        else
            return (IndexOfLastOccurrence.lastIndexOfOccurrence(arr,number) - firstOcc + 1);
    }
}
