package com.personal.test;
import java.util.*;
public class StackUsingQueue {
	int size=0;
	
	Queue <Integer> mainQueue= new LinkedList<>();
	
	public void push(int number) {
		Queue <Integer> helperQueue= new LinkedList<>();

		while (!mainQueue.isEmpty()) {
			helperQueue.offer(mainQueue.poll());
		}
		mainQueue.offer(number);
		
		while (!helperQueue.isEmpty()) {
			mainQueue.offer(helperQueue.poll());
		}	
		size++;
	}
	
	
	public int top() {
		if (mainQueue.isEmpty())
			return -1;
		return mainQueue.peek();
	}
	
	public int pop() {
		if (size <=0)
			return -1;
		size--;
		return mainQueue.poll();
	}
	
	public static void main(String args[]){
		StackUsingQueue stackUsingQueue = new StackUsingQueue();
		stackUsingQueue.push(10);
		stackUsingQueue.push(20);
		stackUsingQueue.push(30);
		stackUsingQueue.push(400);
		stackUsingQueue.push(20);
		
		//System.out.println(stackUsingQueue.top());
		while (stackUsingQueue.top() != -1){
			System.out.println(stackUsingQueue.top());
			stackUsingQueue.pop();
		}
	}
	
	
}


/**

private int size;

private Queue<Integer> q1 = new LinkedList<>();
private Queue<Integer> q2 = new LinkedList<>();


public StackUsingQueue(){
	size=0;
}

public void push (int x ){
	q2 = new LinkedList<>();
	q2.offer(x);
	size++;

	while (!q1.isEmpty()){
		q2.offer(q1.remove());
	}
	
	q1=q2;
}
public void pop(){
	if (q1.isEmpty())
		return ; 
	q1.remove();
	size --;
}

public int top(){
	if (q1.isEmpty())
		return -1;
	return q1.peek();
}

**/