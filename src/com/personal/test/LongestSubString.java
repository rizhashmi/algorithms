package com.personal.test;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        char ch[] = s.toCharArray();
        
        int max= 1;
        int count=1;
        char previousCharacter = ch[0];
        
        for (int loop = 1; loop< ch.length; loop++) {
        	if (previousCharacter!=ch[loop]) {
        		count ++;
        		previousCharacter = ch[loop];
        	} else {
        		if (count>max) max = count;
        		count=1;
        	}
        }
        
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
	}

}
