package DSA.ImpQues;


//    You are given an array arr[] of N integers including 0. The task is to find the
//    smallest positive number missing from the array.
//
//    Example 1:
//
//    Input:
//    N = 5
//    arr[] = {1,2,3,4,5}
//    Output: 6
//    Explanation: Smallest positive missing
//    number is 6.

//    Example 2:
//
//    Input:
//    N = 5
//    arr[] = {0,-10,1,3,-20}
//    Output: 2
//    Explanation: Smallest positive missing
//    number is 2.


public class SmallestPositiveMissingNumber {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {0,-10,1,3,-20};

        System.out.println(missingNumber(arr1,arr1.length));
        System.out.println(missingNumber(arr2,arr2.length));
    }



    //Function to find the smallest positive number missing from the array.
    public static int missingNumber(int arr[], int size)
    {

        //Segregate all +ve numbers to right side
        int i =-1 , j =0;

        for (; j < size ; j++){

            if(arr[j] > 0){
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        // VVIP step
        // As all nos from index 0 to i is +ve.
        // Your answer will range from 1 to i+2
        // Iterate from index 0 to i and make the element corresponding to arr[i] if arr[i] lie
        // between 1 to i+1 negative. Check if that value is already negative ..if yes that means there
        // is a repetition of that index element.

        int sizeOfPositives = i+1;
        for(int k =0; k <= i ; k++){
            if (Math.abs(arr[k]) <= sizeOfPositives){
                if(arr[Math.abs(arr[k])-1] > 0)
                    arr[Math.abs(arr[k])-1] *= -1;
            }
        }

        //Now search for first +ve element from 0 to i ... if found return i+1; else return size+1
        for(int k =0; k <= sizeOfPositives -1 ; k++){
            if(arr[k] > 0)
                return k+1;
        }

        return sizeOfPositives + 1;

    }
}
