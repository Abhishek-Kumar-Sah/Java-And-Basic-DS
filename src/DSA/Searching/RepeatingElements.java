package DSA.Searching;

//array has all elements from 0 to max(element) present in array
//any 1 element is repeating any number of times

import java.util.Arrays;

public class RepeatingElements {

    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1,0,2,2};
        System.out.println(repeatingElement(arr)+"  "+repeatingElementEfficient(arr));
    }

    //This takes O(n) time and O(1) space
    public static int repeatingElementEfficient(int[]arr){
        int slow = arr[0]+1, fast = arr[0]+1;
        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        }
        while (slow != fast);

        slow = arr[0] + 1;
        while (slow != fast){
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }
        return slow - 1;
    }

    //This takes O(n) time and O(n) space
    public static int repeatingElement(int[] arr){
        int max =0;
        for (int a: arr) {
            max = Math.max(max,a);
        }

        boolean[] visited = new boolean[max+1];

        Arrays.fill(visited,false);

        for (int i =0; i < arr.length ; i++){
            if (visited[arr[i]])
                return arr[i];
            visited[arr[i]] = true;
        }
        return -1;
    }
}
