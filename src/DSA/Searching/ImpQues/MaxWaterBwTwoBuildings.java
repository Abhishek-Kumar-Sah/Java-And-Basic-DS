package DSA.Searching.ImpQues;
//Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such
//that the water that can be trapped between the remaining two building is maximum.

//Note: The total water trapped between two buildings is gap between them (number of buildings removed)
// multiplied by height of the smaller building.

//Input:
//        N = 6
//        height[] = {2,1,3,4,6,5}
//        Output: 8
//        Explanation: The heights are 2 1 3 4 6 5.
//        So we choose the following buildings
//        2 1 3 4 6 5  and remove others. So total
//        removed buildings is equal to 4, now the
//        height of smaller one is 2. So answer is
//        2 * removed buildings = 2*4 = 8. There is
//        no answer greater than this.


public class MaxWaterBwTwoBuildings {

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,6,5};

        System.out.println(maxWater(arr));
    }

    public static int maxWater(int[] arr){
        int low = 0, high = arr.length-1,max =0 ;
        while (low < high){
            if (arr[low] > arr[high]){
                max = Math.max(max, (high-low-1) * arr[high]);
                high--;
            }
            else if (arr[low] < arr[high]){
                max = Math.max(max, (high-low-1) * arr[low]);
                low++;
            }
            else if (arr[low] == arr[high]){
                max = Math.max(max, (high-low-1) * arr[low]);
                low++;
                high--;
            }
        }
        return max;
    }
}
