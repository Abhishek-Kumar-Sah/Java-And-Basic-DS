package DSA.Searching;

public class Count_1s_InSortedBinaryArray {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,1};

        System.out.println(count1s(arr));
    }
    public static int count1s(int[] arr){
        int low = 0 , high = arr.length-1;

        while (low <= high){
            int midIndex = (low + high) /2;

            if (arr[midIndex] == 1)
                high = midIndex -1;
            if (arr[midIndex] == 0)
                if (midIndex == arr.length-1 || arr[midIndex+1] == 1)
                    return (arr.length - midIndex - 1);
                else
                    low = midIndex +1;
        }
        return arr.length ;
    }
}
