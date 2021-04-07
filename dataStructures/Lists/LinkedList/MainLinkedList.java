package dataStructures.Lists.LinkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		
		getTimeDiff(al);
		getTimeDiff(ll);
		
		
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
//		
//		System.out.println(ll);
//		
//		ll.set(2, 11);
//		
//		System.out.println(ll.get(2));
		
		
	}

	
	public static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0 ; i< 100000 ; i++) {
			
			list.add(0,i);
		}
		long end =  System.currentTimeMillis();
		
		System.out.println(  list.getClass().getName() +"---> "+ (end - start));
	}
}
