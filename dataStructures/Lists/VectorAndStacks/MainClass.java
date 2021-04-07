package dataStructures.Lists.VectorAndStacks;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		Stack<Integer> s = new Stack<Integer>();
//		
//		s.push(62);
//		s.push(45);
//		s.push(34);
//		
//		s.pop();
		
		MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.add(23);
		stack.add(19);
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		Queue <Integer> q = new LinkedList<>();
		q.add(23);
		
	}

}
