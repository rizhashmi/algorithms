package com.personal.test;

import java.util.HashMap;


public class FourElements {
	public static boolean processPair(int arr[]) {
		HashMap<Integer, Pair> map = new HashMap<>();
		for (int i =0; i < arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				
				int sum = arr[i] + arr[j];
				if (!map.containsKey(sum)) {
					map.put(sum, new Pair(i,j));
				} else {
					
					Pair pair = map.get(sum);
					
					System.out.println(String.format("First Pair (%s, %s) = Second Pair(%s, %s) ", 
							arr[i],arr[j],arr[pair.first],arr[pair.second]
							));
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		int arr []= {3, 4, 7, 1, 2, 9, 8};
		processPair(arr);
	}
}

class Pair{
	int first;
	int second;
	
	Pair(int first, int second){
		this.first = first;
		this.second =second;
	
	}
}

