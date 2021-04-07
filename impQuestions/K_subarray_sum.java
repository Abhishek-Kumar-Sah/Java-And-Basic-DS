package impQuestions;

import java.util.*;
import java.util.Map.Entry;

public class K_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Given an integer array arr of size N and two integers K and M, the task is to find M largest sums of K sized subarrays. 
//
//		Input: 
//		1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//		2. The first line of each test case contains three integers N, K, and M.
//		3. The next line contains N space-separated integers.
//
//
//		Output: For each test case, print M space-separated integers (Print the sums from the maximum to minimum)
		
		
				
				
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int m = sc.nextInt();
		    
		    int a[] = new int[n];
		    Queue<Integer> dq = new PriorityQueue<>();
		    
		    for (int i =0 ; i <n ; i++)
		    a[i] = sc.nextInt();
		    
		    for(int i =0; i<n-k+1 ; i++) {
		        int sum =0;
		        int p = k;
		        while(p-- != 0){
		    	sum += a[i+p];
		    }
		    	if(i<m)
		        dq.add(sum);
		    	else if(sum > dq.peek()) {
		    		dq.add(sum);
		    		dq.poll();
		    	
		    	}
		    }
		    ArrayList<Integer> al = new ArrayList<>();
		    for(int x :dq)
		    	al.add(x);
		    Collections.sort(al, Collections.reverseOrder());
		    for(int x : al)
		    	System.out.print(x+" ");
		    	System.out.println();
//		    	
//		    	Map <String , Integer> map = new HashMap<>();
//		    	
//		    	map.put("one", 1);
//		    	
//		    	Set<Entry<String, Integer>> entry = map.entrySet();
//		    	
//		    	System.out.println(entry);   
		}
		
		
	

	
}}
