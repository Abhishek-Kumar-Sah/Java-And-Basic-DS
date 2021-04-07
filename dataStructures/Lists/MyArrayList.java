package dataStructures.Lists;

import java.util.ArrayList;
import java.util.List;



public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = new ArrayList();
	 	List<String> vegetables = new ArrayList();
	 	
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		
		//addAll function
		
		fruits.addAll(vegetables);
		
		System.out.println(fruits);
		
		//get function
		System.out.println(fruits.get(2));
		
		System.out.println("After Setting potato as Banana");
		//set function
		fruits.set(2,"Banana");
		System.out.println(fruits);
		
		System.out.println("Removing Banana");
		//remove function
		fruits.remove(2);
		
		System.out.println(fruits);
		
		System.out.println("Removing vegetables collection");
		//removeAll function
		fruits.removeAll(vegetables);
		System.out.println(fruits);
		
		
		System.out.println(fruits.contains("Apple"));
		System.out.println(fruits.isEmpty());
		
		
		System.out.println("After converting list to array");
		String arr[] = new String[fruits.size()];
		fruits.toArray(arr);
		
		for(String j: arr)
			System.out.print(j+"  ");
		
		System.out.println();
		
		
		
		ArrayList<Integer> marks = new ArrayList();
		
		marks.add(34);
		marks.add(78);
		
		System.out.println(marks);
		
		/* The Pair generic class is defined in Pair.java class */
		
//		Pair <String , Integer> p1 = new Pair("Abhishek" , 22);
//		Pair <String , Integer> p2 = new Pair("Sah" , 22);
//		
//		p1.getDescription();
//		p2.getDescription();
		
		
		}

}
