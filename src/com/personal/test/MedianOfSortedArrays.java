package com.personal.test;

public class MedianOfSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int resultantArray[] = mergeSortedArray(nums1, nums2);
    	if (resultantArray.length % 2 ==0) {
    		return (resultantArray[resultantArray.length/2 -1 ] + resultantArray[(resultantArray.length/2) ])/2.0;
    	} else {
    		return resultantArray[resultantArray.length/2];
    	}
    }
    
    private static int[] mergeSortedArray(int[] nums1, int[] nums2) {
      	int nums1Size = nums1.length;
      	int nums2Size = nums2.length;
      	
      	int resultedArray[] = new int[nums1Size +nums2Size];
      	int counterNums1Size=0;
      	int counterNums2Size=0;
      	int resultedArrayCounter = 0;
      	
      	while (counterNums1Size <nums1Size && counterNums2Size < nums2Size) {
      		if (nums1[counterNums1Size]<nums2[counterNums2Size]) {
      			resultedArray[resultedArrayCounter]=nums1[counterNums1Size++];
      		} else {
      			resultedArray[resultedArrayCounter]=nums2[counterNums2Size++];
      		}
      		resultedArrayCounter ++;
      	}
      	
      	for (;counterNums1Size <nums1Size ;counterNums1Size++) {
      		resultedArray[resultedArrayCounter++] = nums1[counterNums1Size];
      	}
    
	  	for (; counterNums2Size <nums2Size ;counterNums2Size++) {
	  		resultedArray[resultedArrayCounter++] = nums2[counterNums2Size];
	  	}
          	
    	return resultedArray;
    }
    
    public static void main(String args[]) {
    	int num1[]= {1,3};
    	int num2[] = {2};
    	
    	System.out.println(findMedianSortedArrays(num1, num2));
//    	for (int i : mergeSortedArray(num1, num2)) {
//    		System.out.println(i);
//    	}
    }
    
}
