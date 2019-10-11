package com.personal.test;

import java.util.Stack;
import java.util.Random;

public class SpecialStackDataStructure {

	private Stack<StackElement> st;
	
	int size=0;
	int MAX_STACK_SIZE=10;
	int minimumValue = Integer.MAX_VALUE;
	
	public SpecialStackDataStructure() {
		st = new Stack<>();
	}
	public boolean isFull() {
		if (size == MAX_STACK_SIZE) {
			return true;
		}
		return false;
	}
	
	public boolean push(Integer value) {
		if (isFull()) {
			return false;
		}
		
		size ++;
		if (value < minimumValue) {
			minimumValue = value;
		}
		st.push(new StackElement(value, minimumValue));
		
		return true;
	}
	
	public Integer pop() {
		if (size>0) {
			size--;
		} else {
			return -1;
		}
		StackElement tmp = st.pop();
		minimumValue = tmp.minimum;
		return tmp.element;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int getMinimum() {
		return minimumValue;
	}
	
	public static void main(String args[]) {
		SpecialStackDataStructure specialStackDataStructure = new SpecialStackDataStructure();
		
		for (int i=0; i <15; i ++) {
			Random rnd = new Random();
			int n = rnd.nextInt(100);
			System.out.println(n  + " -- " + specialStackDataStructure.push(n));
		}
		
		System.out.println();
		
		while (!specialStackDataStructure.isEmpty()) {
			int v = specialStackDataStructure.pop();
			System.out.println(v  + " -- " + specialStackDataStructure.getMinimum() );
		}
	}
}
class StackElement{
	int element;
	int minimum;
	
	public StackElement(int element, int minimum) {
		this.element = element;
		this.minimum = minimum;
	}
	
}