package DSA.Array;

public class SecondLargest {
    public static void main(String[] args) {

        int [] arr = {2,3,13,23,53,4,45,32,46,7,86,47,57,67,8,7,96,8,67,8,75,76,4,5,33,3,33,5};
        System.out.println(secondLargest(arr));
        System.out.println(arr[secondLargest(arr)]);

    }
    public static int secondLargest(int[] arr){
        int max =0, max2 = 0;
        for (int i =0 ; i < arr.length ; i++){
            if(arr[i] > arr[max]){
                max2 = max;
                max = i;
            }

            if(arr[max] == arr[max2] || (arr[i] > arr[max2] && arr[i] < arr[max])){
                max2 = i;
            }
        }
        return max2;
    }
}
