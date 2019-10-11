package com.personal.test;
import java.util.Set;
import java.util.HashSet;

public class Max0SubArray {
	
	static int maxLen(int arr[]) {
		int maxLenV = 0;
		
		for (int i =0; i <arr.length; i ++) {
			
			int sum = 0; 
			
			for (int j=i; j< arr.length; j++) {
				sum += arr[j];
				
				if (sum==0) {
					maxLenV = java.lang.Math.max(maxLenV, j -i +1);
				}
			}
			
		}
		
		return maxLenV;
		
	}
	
	static void printDistinctByWindowSize(int arr[], int k) {
	
		for (int i =0; i < arr.length-k +1; i ++) {
			Set <Integer> s = new HashSet();
			for (int j=i; j <k+i; j ++) {
				s.add(arr[j]);
			}
			System.out.println("Size => " + s.size());
		}
	}
	
	public static void main(String args[]) {
		//int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
		
		int arr[] = {-10, 10, -10, 10, 10, -10, -10, 10};
		System.out.println(maxLen(arr));
		
		int arr1[] = {1, 2, 1, 3, 4, 2, 3};
		printDistinctByWindowSize(arr1, 4);
		
		System.out.println(9 % 6);
	}
}
