package com.personal.test;

import java.util.Stack;

public class BalancedBracketAlgo {

	public static boolean checkBalanced(char[] exp) {
		if (exp.length % 2 != 0)
			return false;

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < exp.length; i++) {
			if ((exp[i] == ')' || exp[i] == '}' || exp[i] == ']') && st.isEmpty())
				return false;

			if ((exp[i] == '(' || exp[i] == '{' || exp[i] == '[')) {
				st.push(exp[i]);
			} else {
				if (exp[i] == ')' && st.pop() != '(') {
					return false;
				}
				if (exp[i] == '}' && st.pop() != '{') {
					return false;
				}
				if (exp[i] == ']' && st.pop() != '[') {
					return false;
				}

			}

		}
		return st.empty();
	}

	

	public static boolean checkBalancedRecursived(String in) {
		if (in.isEmpty())
			return true;
		if (isOpen(in.charAt(0))) {
			return checkBalancedRecursived(in.substring(1));
		}
		if (isClose(in.charAt(0)))
			return checkBalancedRecursived(in.substring(1));
		else
			return false;
	}

	static String open = "([{";
	static String close = ")]}";

	private static boolean isOpen(char ch) {
		return open.indexOf(ch) != -1;
	}

	private static boolean isClose(char ch) {
		return close.indexOf(ch) != -1;
	}

	private static boolean isMatching(char chOpen, char chClose) {
		return open.indexOf(chOpen) == close.indexOf(chClose);
	}

	public static void main(String args[]) {
		String value = "([)]";
		char[] exp = value.toCharArray();
		// char[] exp = "[()]{}".toCharArray();
		boolean result = checkBalanced(exp);
		System.out.println(result);

		boolean result1 = checkBalancedRecursived(value);
		System.out.println(result1);

	}
}
