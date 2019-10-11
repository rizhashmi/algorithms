package com.personal.test;

import java.util.*;
public class NextGreaterElement {
	

	
	public static void findNextGreater(int arr[]) {
		Stack<Integer> st = new Stack<>();
		//st.push(arr[arr.length-1]);
		
		
		int previousValue = -1;
		for (int i =arr.length -1; i >=0; i--) {
			int v = arr[i];
			
			if (previousValue ==-1) {
				System.out.println(v + " " + previousValue  );
				previousValue = v;
				st.push(previousValue);
			} else 
			if (v < previousValue) {
				System.out.println(v + " " + previousValue  );

				st.push(previousValue);
				previousValue = v;
			} else {
				if (st.empty()) {
					System.out.println(v + " " + -1  );
					previousValue = v;
				} else 
				while (!st.empty()) {
					int value = st.pop();
					if (v < value) {
						System.out.println(v + " " + value  );
						st.push(value);
						previousValue = v;

						break;
					} else {
						if (st.isEmpty()) {
							System.out.println(v + " " + -1  );
							previousValue = v;
						}
					}
					
				}
			}
		}
		
	}
	public static void main(String args[]) {
		int arr[] = {200, 9,7,8,6,15, 20, 21, 100,2,3,4,20,2030,100,100 };
		findNextGreater(arr);
		
	}
}
