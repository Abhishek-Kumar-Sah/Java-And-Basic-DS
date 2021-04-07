package dataStructures.Lists.VectorAndStacks;

import dataStructures.Lists.LinkedList.MyLinkedList;

public class MyStack<E> {

	private MyLinkedList<E> ll = new MyLinkedList<E>();
	
	public void add(E e) {
		ll.add(e);
	}
	
	public E pop() throws Exception{
		
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		return ll.removeLast();
	}
	
	public E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception ("peeking from null list");
		}
		return ll.getLast();
	}
	
}
