package DSA.Array;

//Majority element is an element that appears more than n/2 times in an array of size n
//If no such element ....return -1.
public class MOORES_VOTING_ALGO_MajorityElement {
    public static void main(String[] args) {
        int[] arr1 = {8,7,6,8,6,6,6,6};
        int[] arr2 = {8,8,8,7,7,3,3,3,8,8};
        System.out.println(majorityElementIndex(arr1)+"  "+majorityElementIndexEfficient(arr1));
        System.out.println(majorityElementIndex(arr2)+"  "+majorityElementIndexEfficient(arr2));
    }


    public static int majorityElementIndex(int[] arr){
        for (int i =0; i < arr.length ; i++){
            int count = 1;
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > arr.length/2)
                return i;
        }
        return -1;
    }


    //Moore's Voting Algo
    public static int majorityElementIndexEfficient(int[] arr){

        //First find the max occurring element in the array ..... then check
        // whether that element has occurred for more than n/2 times or not (IN THE NEXT LOOP).
        int res =0, count =1;
        for (int i = 1; i <arr.length ; i++){
            if (arr[i] == arr[res])
                count++;

            else count--;

            if (count ==0){
                res = i;
                count =1;
            }
        }
        //We have the index of max occurring element(not sure about it has appeared for n/2 times or not)
        //As 'res' .... now check for occurrence of n/2 times .
        count =0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == arr[res])
                count++ ;
        }
        if (count <= arr.length/2)
            res = -1;

        return res;
    }
}
