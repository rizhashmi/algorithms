package com.personal.test;

import java.util.HashMap;

public class FindAllSymmetricPairs {
	public static void find(int arr[][]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		
		for (int row=0; row <arr.length; row ++) {
			Integer val1 = arr[row][0];
			Integer val2 = arr[row][1];
			
			Integer mapElement = map.get(val2);
			if (mapElement!=null ) {
				System.out.println(String.format("{%s,%s} and {%s, %s}",val1, val2, val2, mapElement));
			}
			map.put(val1, val2);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
		find(arr);
	}

}
