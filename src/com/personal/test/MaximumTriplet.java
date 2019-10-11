package com.personal.test;
import java.util.Vector;

public class MaximumTriplet {
	
	public static int findHighestTriplet(int arr[]) {

		Integer firstHighest =  null;
		Integer secondHighest=  null;
		Integer thirdHighest =  null;

		for (int a : arr){
			if (firstHighest == null || a >=firstHighest){
				thirdHighest = secondHighest;
				secondHighest = firstHighest;
				firstHighest = a;
			} else if (secondHighest == null || a >= thirdHighest){
				thirdHighest = secondHighest;
				secondHighest = a;
			} else if (thirdHighest == null || a >= thirdHighest){
				thirdHighest = a;
			}
		}
		
		return ((firstHighest == null)? 0:firstHighest)  + ((secondHighest == null)? 0:secondHighest) + ((thirdHighest == null)?0:thirdHighest);

	}
	static void originalArray(int greater[], int n)  
	{  
	    // Array that is used to include every  
	    // element only once  
	    Vector<Integer> temp = new Vector<Integer>();  
	    for (int i = 0; i <= n; i++)  
	        temp.add(i);  
	  
	    // Traverse the array element  
	    int arr[] = new int[n];  
	    for (int i = 0; i < n; i++) 
	    {  
	  
	        // find the K-th (n-greater[i]-i)  
	        // smallest element in Include_Array  
	        int k = n - greater[i] - i;  
	  
	        arr[i] = temp.get(k);  
	  
	        // remove current k-th element  
	        // from Include array  
	        temp.remove(k);  
	    }  
	  
	    // print resultant array  
	    for (int i = 0; i < n; i++)  
	            System.out.print(arr[i] + " ");  
	}  
	  
	public static void main(String args[]) {
		int arr[] = {1,2,3,0,-1,8,10};
		int arr1[] = {1,2,3,0,-1,8,10};
		System.out.println(findHighestTriplet(arr1));
		
		 int Arr[] = { 6, 3, 2, 1, 0, 1, 0 }; 
		 int n = Arr.length;  
		    originalArray(Arr, n); 
	}
}
