package DSA.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {4,538,34,5,34,53,4,53,4,53,45,56,67,7,40,76,7,8,7,867,8,67,85,77,467,35,3,45,2,34,12,4,23,423,5};

        for (int a: bucketSort(arr,10)) {
            System.out.print(a +" ");
        }
    }


    //Main function
    public static int[] bucketSort(int[]arr , int noOfBuckets){

        //Find maximum element to know how many elements will be there in each bucket.
        int max =0;
        for (int i =0 ; i< arr.length ; i++){
            max = Math.max(max, arr[i]);
        }

        //max++ is done to prevent arraylist index out of bound.
        //In calculating [bucketNumber = arr[i] / (max / noOfBuckets);] ,  some arr[i] will be equal to max
        // and in that case [bucketNumber will be EQUAL TO noOfBuckets , which will be out of bound
        // for ArrayList of buckets.
        max++;

        //Generate buckets ...maximum index of bucket will be = noOfBuckets - 1
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i =0 ; i < noOfBuckets ; i++){
            buckets.add(new ArrayList<Integer>());
        }

        //Feed elements in their respective bucket according to their values.
        for (int i =0; i < arr.length ; i++){
            int bucketNumber = (arr[i] *  noOfBuckets) / (max);
            buckets.get(bucketNumber).add(arr[i]);
        }

        //Sort each bucket
        for (int i =0; i < noOfBuckets ; i++){
            Collections.sort(buckets.get(i));
        }

        //Merge all bucket elements.
        int index =0;
        for (int i =0; i < noOfBuckets ; i++){
            for (int j = 0 ; j < buckets.get(i).size() ; j++){
                arr[index++] = buckets.get(i).get(j);
            }
        }


        return arr;
    }
}
