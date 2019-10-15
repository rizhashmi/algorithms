package com.personal.test;
import java.lang.Math;
public class LongestPalindrome {
	
    public String longestPalindrome(String s) {

    	int start=0;
    	int end =0;
    	for (int loop=0; loop <s.length(); loop++) {
    		int size1 =this.getPalindromeSize(s, loop, loop);
    		int size2 = this.getPalindromeSize(s, loop, loop + 1);
    		int finalSize = Math.max(size1, size2);
    		if (finalSize > end - start) {
    			start = loop - (finalSize -1)/2;
    			end = loop +finalSize/2;
    		}
    		
    	}
    	//System.out.println(max);
    	return s.substring(start,end+1);
    }
    private int getPalindromeSize(String str,int i, int j) {
    	
    	while (i >=0 && j<str.length() && str.charAt(i) == str.charAt(j)) {

    			i --;
    			j++;
    	}
    	
    	return j-i -1;
    }
    
	public static void main(String args[]) {
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome("bxxbcac"));
	}
}
