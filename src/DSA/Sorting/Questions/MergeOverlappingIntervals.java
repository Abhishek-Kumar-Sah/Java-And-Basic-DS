package DSA.Sorting.Questions;


import java.util.ArrayList;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        Interval[] intervals = {new Interval(7, 9), new Interval(6, 10), new Interval(4, 5),
                new Interval(1, 3), new Interval(2, 4), new Interval(8, 11),
                new Interval(14, 16), new Interval(16, 19), new Interval(17, 18),
                new Interval(21, 24), new Interval(0, 4), new Interval(13, 17)};


        for (Interval a : mergedIntervals(intervals)) {
            System.out.print("(" + a.start + " , " + a.end + ") ");
        }
        System.out.println();

        mergeIntervalsGfG(intervals);

    }

    //Main function, O(nLogN) , O(N) space
    public static ArrayList<Interval> mergedIntervals(Interval[] intervals) {

        quickSortIntervals(intervals, 0, intervals.length - 1);

        //Printing the sorted intervals for better understanding
        for (Interval a : intervals) {
            System.out.print("(" + a.start + " , " + a.end + ") ");
        }
        System.out.println();

        ArrayList<Interval> mergedIntervals = new ArrayList<>();


        int current = -10, k = 0; // -10 is just to check if current is assigned any value or not

        mergedIntervals.add(new Interval(-1, -2));

        for (int i = 0; i < intervals.length; i++) {

            if (mergedIntervals.get(k).start == -1) {
                mergedIntervals.get(k).start = intervals[i].start;
                current = intervals[i].end;
            } else if (intervals[i].start > current) {
                mergedIntervals.get(k++).end = current;
                mergedIntervals.add(new Interval(-1, -2));
                mergedIntervals.get(k).start = intervals[i].start;
                current = intervals[i].end;
            } else if (intervals[i].end > current) {
                current = intervals[i].end;
            }

        }

        if (mergedIntervals.get(k).end == -2)
            mergedIntervals.get(k).end = current;


        return mergedIntervals;
    }


    //Mani function from GfG, O(nLogN) , O(1) space
    public static void mergeIntervalsGfG(Interval[] intervals) {

        quickSortIntervals(intervals, 0, intervals.length - 1);

        int mergedIntervalsIndex = 0;
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[mergedIntervalsIndex].end >= intervals[i].start) { // Means the ith interval is overlapping.
                // merging is required
                intervals[mergedIntervalsIndex].start = Math.min(intervals[mergedIntervalsIndex].start, intervals[i].start);
                intervals[mergedIntervalsIndex].end = Math.max(intervals[mergedIntervalsIndex].end, intervals[i].end);
            } else if (intervals[mergedIntervalsIndex].end < intervals[i].start) { // Means the ith interval is non overlapping.
                mergedIntervalsIndex++;
                intervals[mergedIntervalsIndex] = intervals[i];
            }
        }

        for (int i = 0; i <= mergedIntervalsIndex; i++) {
            System.out.print("(" + intervals[i].start + " , " + intervals[i].end + ") ");
        }
        System.out.println();
    }


    //Function for sorting the array of intervals
    private static void quickSortIntervals(Interval[] intervals, int low, int high) {

        if (low < high) {

            int partition = partition(intervals, low, high);
            quickSortIntervals(intervals, low, partition - 1);
            quickSortIntervals(intervals, partition + 1, high);
        }
    }


    //Lomuto partition for quick sorting intervals array
    private static int partition(Interval[] intervals, int low, int high) {
        int i = low - 1, pivot = intervals[high].start;

        for (int j = low; j < high; j++) {
            if (intervals[j].start <= pivot) {
                i++;
                swap(intervals, i, j);
            }
        }

        swap(intervals, i + 1, high);

        return i + 1;
    }


    //Swap function for swapping intervals
    private static void swap(Interval[] intervals, int i, int j) {
        Interval temp = intervals[i];
        intervals[i] = intervals[j];
        intervals[j] = temp;
    }

}


class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}