package com.personal.test;

public class ReverseStringWithoutParameter {
	public static char[] reverseString(char [] str) {
		
		for (int i =0;i <str.length/2; i ++) {
			str[i] = (char) ((int)str[i] - (int)str[str.length - i -1]);
			str[str.length - i -1] = (char) ((int)str[i] + (int)str[str.length - i -1]);
			str[i] = (char) ((int)str[str.length - i -1] -(int)str[i]);
		}
		return str;
	}
	
	public static void main(String args[]) {
		char [] str = "GeeksforGeeks".toCharArray();
		System.out.println((str));

		System.out.println(reverseString(str));
	}
	
}
