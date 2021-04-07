package dataStructures.Lists.LinkedList;

public class MyLinkedList<E> {

	Node<E> head;
	
	
	//secondly : define add function of our LinkedList
	public void add (E data) {
		
			Node<E> toAdd = new Node<E>(data);
			
			// if your list is empty : head will be null
			if(head == null) {
				head = toAdd;
				return;
				
			}
			// this will throw a nullPoEException if head will be null which is possible if our list is empty : So refer line 13
			Node<E> temp = head;
			while(temp.next != null) {
				temp = temp.next;
	}
			temp.next = toAdd;
	}
	
	// to check if the LinkedList is empty or not. 
	public boolean isEmpty() {
		return (head == null);
	}
	
	
	
	// first create a Node<E>
	public static class Node<E> {
		 
		public E data;
		 public Node<E> next;
		 
		 public Node(E data) {
			 
			 this.data = data;
			 next = null;
		 }
	 }
	 
	 // for printing elements of our LinkedList
	 
	public  void print() {
		 Node<E> temp = head;
		 System.out.print("[");
			while(temp != null) {
				System.out.print(temp.data+ " ");
				temp = temp.next;
	}
			System.out.print("]");
		 
	 }
	 
	 E get(int i) {
		 
		 Node<E> temp = head;
		 for(int j=0 ; j< i; j++) {
			 temp = temp.next;
		 }
		 return temp.data;
	 }
	 
	public  void set(int i , E j) {
		 Node<E> temp = head;
		 for(int k=0 ; k< i; k++) {
			 temp = temp.next;
		 }
		 temp.data = j;
	 }
	
	public  void remove(int i) {
		 Node<E> temp = head;
		 for(int k=0 ; k< i-1; k++) {
			 temp = temp.next;
		 }
		 temp.next = temp.next.next;
		 
	 }
	 
	 public void removeAll() {
		 
		 head=null;
	 }
	 
	public void add(int i , E j) {
		 
		 Node<E> toAdd = new Node<E>(j);
		 Node<E> temp = head;
		 if(i==0) {
			 toAdd.next=head;
			 head=toAdd;
			 return;
		 }
		 for(int k=1; k < i ; k++) {
			 temp = temp.next;		 
		 }
		 Node<E> forward = temp.next;  
		 temp.next = toAdd;
		 toAdd.next = forward;
		 
	 }
	
	 public int size() {

		 
		 Node<E> temp = head;
		 int i=0;
		 while(temp != null) {
			 temp = temp.next;
			 i++;
		 }
		 return i;
	 }

	 public void reverse() {
		 Node<E> temp = head;
		 Node<E> prev  = null;
		 Node<E> n  = null;
		 while(temp != null){
             n=temp.next;  
             temp.next = prev;
             prev = temp;
             temp = n;
         }
		 head = prev;
		
        
		 
	 }

	 public E removeLast() throws Exception {
		 
		 if(head == null) {
			 throw new Exception ("Null pointer : No element in List");
		 }
		 if(head.next == null) {
			 Node<E> toRemove = head;
			 head = null;
			 return toRemove.data;
		 }
		 Node<E>  temp = head;
		 while (temp.next.next != null)
			 temp = temp.next;
	 
	 Node<E> toRemove = temp.next;
	 temp.next = null;
	 return toRemove.data;
	 
}
	 public E getLast() throws Exception {
		 
		 if(head == null) {
			 throw new Exception ("Null pointer : No element in List");
		 }
		 if(head.next == null) {
			 return head.data;
		 }
		 Node<E>  temp = head;
		 while (temp.next != null)
			 temp = temp.next;
	 return temp.data;
	 }
	 
}










