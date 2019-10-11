package com.personal.test;

public class DPFib {
	public static int fibonacci(int n) {
		if (n <=1) {
			return n;
		} else {
			int i = fibonacci(n-1);
			int j = fibonacci(n -2);
			return i + j ;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(6));
	}

}
