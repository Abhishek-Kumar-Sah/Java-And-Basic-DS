package dataStructures.Queue;

import java.util.ArrayDeque;

public class ApplyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(23);
		mq.enqueue(988);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
	}

}
