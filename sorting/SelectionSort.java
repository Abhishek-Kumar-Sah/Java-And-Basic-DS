package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		
		for (int i =0 ; i<n ; i++) {
			
			arr1[i] = sc.nextInt();	
		}
		
		for(int i=0 ; i < n-1 ; i++) {
			
			int r = i;
			
			for(int j = i ; j < n ; j++) {
			
			if (arr1[r] > arr1[j])
				
				r= j;
				
			}
			int temp = arr1[i];
			arr1[i] = arr1[r];
			arr1[r] = temp;
			
		}
		
		for(int r : arr1)
			System.out.print(r + "  ");
	}

}
