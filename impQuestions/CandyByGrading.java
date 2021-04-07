package impQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyByGrading {

	public static void noOfCandy(int g[]) {
		
		int r[] = new int [g.length];
		for(int j =0 ; j< g.length ; j++)
			r[j] = 1;
			
		
		for(int i =0 ; i < g.length-1; i++) {
			
		if(g[i] < g[i+1])
			r[i+1] = r[i]+1;
		}
		
		for(int i=g.length-1; i >0 ; i--) {
			
		if(g[i] < g[i-1])
		r[i-1] = Math.max(r[i] +1, r[i-1]);
		
			
	}
		int sum =0;
		for(int j :r)
		sum += j;
		for(int q :r)
			System.out.print(q +" ");
		System.out.println();
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> S = new ArrayList(0);
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		int arr[] = new int [n];
//		for (int j =0 ; j<n ; j++) {
//			
//			arr[j]= sc.nextInt();
//	}
		int[] arr = { 2,4,2,6,1,7,8,9,2,1};
//		int[] arr = {5,4,3,2,1};
		noOfCandy(arr);
		
	}

}
