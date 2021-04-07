package dataStructures.Lists.LinkedList;

public class ApplyMyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList<Integer> myLL = new MyLinkedList<>();
		
		myLL.add(12);
		myLL.add(56);
		
		myLL.add(1, 10);
		for(int i=0 ; i <10 ;i++) {
			myLL.add(i,i);
		}
		
		myLL.print();
		System.out.println();
		System.out.println(myLL.get(5));
		
		myLL.set(4, 455);
		
		myLL.print();
		System.out.println();
		myLL.remove(4);
		
		myLL.print();
		System.out.println();
		
//		myLL.removeAll();
//		myLL.print();
//		System.out.println();
		myLL.add(2, 34);
		myLL.print();
		
//		System.out.println();
//		System.out.println(myLL.size());
		
		System.out.println();
		myLL.reverse();
		myLL.print();
	}

}
