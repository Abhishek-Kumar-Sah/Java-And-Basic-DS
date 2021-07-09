package DSA.Searching;

//Max allotted pages to any student must be minimized.

public class AllocateMinPages {
    public static void main(String[] args) {
        int[] arr = {148,122};
        System.out.println(allocatedMaxPages(arr,1));
    }
    public static int allocatedMaxPages(int[] arr, int noOfStudents){
        int sumOfPages = 0, maxPage =0, result=0;
        for (int a: arr) {
            sumOfPages += a;
            maxPage = Math.max(maxPage,a);
        }
        int low = maxPage, high = sumOfPages;

        while (low <= high){
            int mid = (low + high)/2;
            int minStudentsWithMid = studentsReq(arr,mid);

            if (minStudentsWithMid <= noOfStudents) {
                result = mid;
                high = mid - 1;
            }
            else {
                low = mid +1;
            }
        }
        return result;
    }

    private static int studentsReq(int[] arr,int mid){
        int count =1, tempSum =0;
        for (int i =0; i< arr.length ; i++){

            tempSum += arr[i];
            if (tempSum <= mid)
                continue;
            else{
                count++;
                tempSum = arr[i];
            }
        }
        return count;
    }
}
