package DSA.Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr1 = {3,0,1,2,5};
        int[] arr2 = {1,2,3,0,1};
        int[] arr3 = {0,2,1,1,4,0,1,2,3,4,5,0,1};
        int[] arr4 = {1,0,2,0,3,0,5,0,3,0,1};
        int[] arr5 = {10,0,2,6,3,0,2,7,0,6,4,10};

        System.out.println(trappedWater(arr1)+" "+trappedWaterGfG(arr1));
        System.out.println(trappedWater(arr2)+" "+trappedWaterGfG(arr2));
        System.out.println(trappedWater(arr3)+" "+trappedWaterGfG(arr3));
        System.out.println(trappedWater(arr4)+" "+trappedWaterGfG(arr4));
        System.out.println(trappedWater(arr5)+" "+trappedWaterGfG(arr5));
    }



    public static int trappedWater(int[] arr){
        int counter =0 , middleValues = 0, leftBarrier = arr[0], result1=0, result2 =0;

        int lastMaxLevel =0; // for end point in traversing the array in next loop


        for (int i = 1; i < arr.length ; i++){

            if (arr[i] >= leftBarrier){
                int maxWaterLevel = Math.min(leftBarrier, arr[i]);

                lastMaxLevel = i; // for setting end point in traversing
                                  // the array in next loop(in reverse direction).

                result1 += maxWaterLevel * counter - middleValues;
                counter = -1;
                leftBarrier = arr[i];
                middleValues = -arr[i];
            }
            counter++;
            middleValues += arr[i];
        }

        //Traversing in reverse direction to accumulate the water trapped in
        //decreasing height bars.  Ex - arr = {1,0,5};

        int rightBarrier = arr[arr.length-1];
        counter =0 ; middleValues = 0;

        for (int j = arr.length-1; j >= lastMaxLevel ; j--){

            if (arr[j] >= rightBarrier){
                int maxWaterLevel = Math.min(rightBarrier, arr[j]);
                result2 += maxWaterLevel * counter - middleValues;
                counter = -1;
                rightBarrier = arr[j];
                middleValues = -arr[j];
            }
            counter++;
            middleValues += arr[j];
        }


        return result1 + result2;
    }




    public static int trappedWaterGfG(int[] arr){

        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];

        leftMax[0] = arr[0];
        for (int i =1 ; i < arr.length ; i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }

        rightMax[arr.length-1] = arr[arr.length-1];
        for (int j = arr.length-2 ; j >= 0 ; j--){
            rightMax[j] = Math.max(rightMax[j+1],arr[j]);
        }

        int res =0;

        for (int k =1; k < arr.length-1 ; k++){
            res += Math.min(leftMax[k], rightMax[k]) - arr[k];
        }

        return res;
    }
}
