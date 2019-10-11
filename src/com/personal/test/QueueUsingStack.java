package com.personal.test;

import java.util.*;

public class QueueUsingStack {
	private int size;
	
	private Stack<Integer> q1, q2 ;

	
	public QueueUsingStack(){
		size=0;
	}
	
	public void add (int x ){
		q2 = new Stack<>();
		size++;
		

		while (q1!=null && !q1.isEmpty()){
			q2.push(q1.pop());
		}
		if (q1==null){
			q1 = new Stack();
		}
		q1.push(x);
		while (!q2.isEmpty()){
			q1.push(q2.pop());
		}
	}
	public void offer(){
		if (q1.isEmpty())
			return; 
		size --;
		q1.pop();

	}
	public int peek(){
		if (q1.empty())
			return -1;
		return q1.peek();
	}
	
	
	public static void main(String args[]){
		QueueUsingStack stackUsingQueue = new QueueUsingStack();
		stackUsingQueue.add(10);
		stackUsingQueue.add(20);
		stackUsingQueue.add(30);
		stackUsingQueue.add(400);
		stackUsingQueue.add(20);
		
		//System.out.println(stackUsingQueue.top());
		while (stackUsingQueue.peek() != -1){
			System.out.println(stackUsingQueue.peek());
			stackUsingQueue.offer();
		}
	}
	
	


}
