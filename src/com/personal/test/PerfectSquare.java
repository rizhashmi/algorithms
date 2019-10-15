package com.personal.test;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num/2;
        
        if (num == 1) {
        	return true;
        }
        if (num <0 ) {
        	return false;
        }
        
        while (left<=right){
            int mid =  (left + right)/2  ;
            int div = num /mid;
            if ( div== mid && num % mid ==0)
                return true;
            
            if (div >= mid ){
                left = mid +1;
            } else
                right = mid -1;
            
        }

        return false;
    }	
    
    public static boolean isPerfectSquare1(int num) {
    	for (int i =0; i <=num/2; i++) {
    		if (i*i ==num) {
    			System.out.println(i);
    			return true;
    		}
    	}
        return false;
    }	
    
    public static void main(String args[]) {
		int a = 
				4;
		System.out.println(isPerfectSquare(a));
		System.out.println(isPerfectSquare1(a));
		
    }

}
