package com.personal.test;

import java.util.*;

public class FindAllDistinctPalindromicSubString {

	public static int execute(String str) {
		HashSet<String> hs = new HashSet<>();
		int count =0;
		for (int i =0; i <str.length(); i++) {
			if (!hs.contains(String.valueOf(str.charAt(i)))) {
				System.out.println( str.charAt(i));
				hs.add(String.valueOf(str.charAt(i)));
				count+=1;
			}
			count += traverseForPalindromicString(str, i, i, hs);
			count += traverseForPalindromicString(str, i, i+1, hs);

		}
		
		return count;
	}
	
	public static int traverseForPalindromicString(String str, int left, int right, HashSet<String> memory) {
		int count = 0;
		while (right<str.length() && left >=0 && str.charAt(left) == str.charAt(right)) {
			String temp = str.substring(left, right+1);
			if (!memory.contains(temp)) {
				System.out.println( temp);
				memory.add(temp);
				count++;
			}
			left --;
			right++; 
		}
		return count;
	}
	
	public static void main(String args[]) {
		String str = "aaasfsfsdfddddsfdsfdddfsdfsdfsdddsfsdddd";
		System.out.println("Count " + execute(str));
	}
}
