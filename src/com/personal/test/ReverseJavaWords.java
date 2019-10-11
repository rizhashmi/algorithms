package com.personal.test;

public class ReverseJavaWords {

	
	
	public void reverseWords(char[] s) {

	 
	    reverse(s, 0, s.length-1);
	    
	    int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	            reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	 
	    reverse(s, i, s.length-1);
	}
	 
	public void reverse(char[] s, int i, int j){
	    while(i<j){
	        char temp = s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        i++;
	        j--;
	    }
	}
	
	
	public static void main(String args[]) {
		char str[] = "the sky is blue ".toCharArray();
		
		ReverseJavaWords reverseJavaWords = new ReverseJavaWords();
		reverseJavaWords.reverseWords(str);
		
		System.out.println(String.valueOf(str));
	}
}
