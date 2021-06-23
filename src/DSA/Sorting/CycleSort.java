package DSA.Sorting;

// USED TO SOLVE QUESTIONS LIKE :
// FIND THE MINIMUM SWAPS NEEDED TO SORT THE ARRAY

public class CycleSort {

    public static void main(String[] args) {
        int[] arr = {50,10,30,10,40,10,20,30,10,20,40,30,20,50,20,30,10,40};

        for (int a: cycleSort(arr)) {
            System.out.print(a +" ");
        }
    }

    //Cycle Sort
    public static int[] cycleSort(int[] arr){

        // cs : cycle sorted
        // After 1 iteration of this loop index cs will have its correct element.
        // Hence array till cs will be sorted.
        for (int cs = 0 ; cs < arr.length-1 ; cs++){

            int item = arr[cs]; //item is the element which will be placed at its correct position.
            int position = cs;  //Till which array will be sorted after this iteration.

            //Finding the correct position of the current item.
            for (int i = cs+1 ; i < arr.length ; i++){
                if (arr[i] < item)
                    position++;
            }

            //If position is not changed then it means this element is already at it's correct position.
            //VERY CRUCIAL IN CASE OF REPEATING ELEMENTS
            if (position == cs)
                continue;

            //Skip duplicates
            while (arr[position] == item)
                position++;

            //Swap item and arr[position]
            int temp = item;
            item = arr[position];
            arr[position] = temp;
            //Now we have the element at which was at arr[position], and it needs to be placed in its correct position.

            //If position == cs , it means the index cs has its correct element.
            //If not, we need to repeat the process until we get the correct element at cs index.
            while (position != cs){
                position = cs;

                //Finding the correct position of the current item.
                for (int i = cs+1 ; i < arr.length ; i++){
                    if (arr[i] < item)
                        position++;
                }

                //Skip duplicates
                while (arr[position] == item)
                    position++;

                //Swap item and arr[position]
                temp = item;
                item = arr[position];
                arr[position] = temp;
            }
        }
        return arr;
    }

}
