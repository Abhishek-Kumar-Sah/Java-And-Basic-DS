package DSA.Array;
//leaders sre those integers in array whose all elements on right are less than that.
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr1 = {7,10,4,3,6,5,2};
        int[] arr2 = {10,20,30};
        int[] arr3 = {30,20,10};
        leaders(arr1);
        leaders(arr2);
        leaders(arr3);
    }
    public static void leaders(int[] arr){
        int max =0;
        for(int i = arr.length-1 ; i >=0 ; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
    }
}
