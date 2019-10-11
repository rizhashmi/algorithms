package com.personal.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Java Program to print Fibonacci series without using recursion.
 * input : 10
 * output : 0 1 1 2 3 5 8 13 21 34 55 
 *
 * @author WINDOWS 8
 */

public class FibonacciSeriesWithoutRecursion {

    public static void main(String args[]) {
     
        // printing first 10 numbers of Fibonacci series
        fibonacci(10);
     
    }
     
 
    public static void fibonacci(int number){
        for(int i=0; i <= number; i++){
            //System.out.print(getFibonacci(i) + " ");
            System.out.print(fiborecursive(i) + " ");

        }
        
        System.out.print(fiborecursive(6) + " ");

    }
  
    /**
     * This function return nth Fibonacci number in Java
     * @param n
     * @return nth number in Fibonacci series
     */
    public static int getFibonacci(int n){
      
        if (n == 0) {
            return 0;
        }
        
        if (n == 1){
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }
    
    static int fiborecursive(int n){
    	 if(n <= 1){
    	  return n;
    	 }else{
    	  return fiborecursive(n-1) + fiborecursive(n-2);
    	 }
    }
  
}