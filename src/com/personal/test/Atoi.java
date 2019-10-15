package com.personal.test;

public class Atoi {
	    public static boolean isNumber(char ch){
	        return (((int)ch) >=48 && ((int)ch) <= 57 );
	    }
	    public static int myAtoi(String str) {
	        Long number =null;
	        int signedNumber = 1;
	        boolean hasSign = false;
	        char ch[] = str.trim().toCharArray();
	        
	        boolean overflow = false;
	        
	        boolean stopIt = false;
	        
	        for (int i =0; i < ch.length; i ++){
	            
	            if (hasSign && !isNumber(ch[i]) && number ==null){
	                return 0;
	            }
	            
	            if (ch[i] =='-' && number==null){
	                signedNumber = -1;
	                hasSign=true;
	            } else 
	            if (ch[i] =='+' && number==null){
	                hasSign = true;
	            } else 

	            if (!stopIt && isNumber(ch[i])) {
	                number = ((number==null)?0 :number *10) + Character.getNumericValue(ch[i]);
	            } else {
	                if (number >0){
	                    stopIt = true;
	                }
	                if (number == 0 &&!isNumber(ch[i]) ){
	                    return 0;
	                }
	            }
		        if (number!=null && number > Integer.MAX_VALUE){
		            number= (long)Integer.MAX_VALUE;
		            overflow = true;
		            break;
		        }

	        }
	        number *= signedNumber ;
	        if (overflow && signedNumber <0) {
	        	number -=1;
	        }

	        return number.intValue();
	    }
	    public static void main(String args[]) {
	    	System.out.println(myAtoi(
	    			"0-1"));
	    	
	    	int i = Integer.MAX_VALUE;
	    	
	    	System.out.println(i + "   " + (i + 1));
	    }
}
