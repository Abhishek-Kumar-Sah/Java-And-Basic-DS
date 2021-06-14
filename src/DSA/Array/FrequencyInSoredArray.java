package DSA.Array;

public class FrequencyInSoredArray {

    public static void main(String[] args) {
        int[] arr1 ={10,10,10,25,30,30};
        int[] arr2 = {10,10,10,10};
        int[] arr3 = {40,50,50,50};

        freq(arr1); freq(arr2); freq(arr3);
    }
    public static void freq(int[] arr){
        int counter = 1;
        for (int i =1 ; i <arr.length ; i++){
            if (arr[i] != arr[i-1]){
                System.out.println(arr[i-1] + "  " + counter);
                counter = 0;
            }
            counter++;
        }
        System.out.println(arr[arr.length-1] + "  " + counter);
        System.out.println("-----");
    }
}
