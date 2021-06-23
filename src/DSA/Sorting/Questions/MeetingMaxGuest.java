package DSA.Sorting.Questions;
// You are given arrival and departure times of the guests, you need to
// find the time to go to the party so that you can meet maximum people.

import java.util.Arrays;

public class MeetingMaxGuest {

    public static void main(String[] args) {
        int[] arrival = {1500,940,1100,900,1800,950};
        int[] departure = {1900,1200,1130,910,2000,1120};

        System.out.println(maxGuestGfG(arrival,departure));
        System.out.println(maxGuestMeets(arrival,departure));
    }


    //Main function using concept of Merge Sort
    public static int maxGuestGfG(int[] arrival , int[] departure){

        Arrays.sort(arrival);
        Arrays.sort(departure);

        // Now we will iterate all the arrival and departure timings and find out the max guest at any time.
        // As arrival time means increment of guest and departure means decrement of guest.
        int i =0 , j = 0, count = 0 , maxGuest = 0;

        while (i < arrival.length){ // Because once all guest arrives, no need to see the departing time after that.
            // As beyond that time, number of guests will eventually decrease and cannot increase.

            if (arrival[i] <= departure[j]){
                count++; i++;
                maxGuest = Math.max(maxGuest,count);
            }
            else{
                count--; j++;
            }
        }
        return maxGuest;
    }


    //Main function using concept of Quick Sort (Requires extension of Quick Sort).
    public static int maxGuestMeets(int[] arrival, int[] departure){

        quickSortBasedOnArrival(arrival,departure,0,arrival.length-1);

        int testGuestIndex = 0 , count = 1 , maxGuest = 0 , arrivalTime = arrival[0], departureTime = departure[0];
        for (int i = 1; i < arrival.length ; i++){
            if (departure[testGuestIndex] >= arrival[i]){
                count++;
                maxGuest = Math.max(maxGuest, count);
            }

            else if (departure[testGuestIndex] < arrival[i]){
                count = 1;
                testGuestIndex = i;
            }
        }
        return maxGuest;
    }

    //Quick sort : sorting arrival array maintaining arrival departure timing pair of each guest.
    private static void quickSortBasedOnArrival(int[] arrival, int[] departure, int low, int high){

        if (low < high){

            int partition = partitionLomuto(arrival,departure,0,high);
            quickSortBasedOnArrival(arrival,departure,low,partition-1);
            quickSortBasedOnArrival(arrival,departure,partition+1,high);
        }
    }

    //Partitioning of Quick sort : maintaining arrival departure timing pair of each guest.
    private static int partitionLomuto(int[] arrival, int[] departure, int low, int high){

        int i = low -1 , pivot = arrival[high];

        for (int j = low ; j< high ; j++){
            if (arrival[j] <= pivot){
                i++;
                swap(arrival,i,j);
                swap(departure,i,j); // As arrival changes ... change the departure simultaneously
                // to maintain the arrival departure timing pair of that guest.
            }
        }

        swap(arrival,i+1,high);
        swap(departure,i+1,high);

        return i+1;
    }

    //Swap function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
