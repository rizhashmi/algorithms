package com.personal.test;

import java.util.HashMap;
import java.util.HashSet;

public class KthHighestNumber {
	/**
	 * s1= abba  s2=abbaa -> a
	 * s1=abba  s2=axbba -> x
	 * s1=abba  s2=abbba->b
	 * @param s
	 * @param t
	 * @return
	 */
 	public static char findTheDifference(String s, String t) {
 		HashMap<Character, Integer> sCharacterMap = new HashMap<>();
 		
 		for (char sCharacter : s.toCharArray()) {
 			sCharacterMap.put(sCharacter, sCharacterMap.getOrDefault(sCharacter, 0) +1);
 		}
 		 		
 		HashMap<Character, Integer> tCharacterMap = new HashMap<>();
 		for (char tCharacter : t.toCharArray()) {
 			tCharacterMap.put(tCharacter, tCharacterMap.getOrDefault(tCharacter, 0) + 1);

 		}
 		
 		for (char tCharacter : t.toCharArray()) {
 			Integer tCharacterCount = tCharacterMap.get(tCharacter);
 			Integer sCharacterCount = sCharacterMap.get(tCharacter);
 			
 			if (sCharacterCount == null ) {
 				return tCharacter;
 			} else {
 				if (tCharacterCount != sCharacterCount) {
 					return tCharacter;
 				}
 			}
 			
 		}
 		
 		return 1;
 		
 		
 	}
 	public static int function(int [] array, int kthElement) {
 		HashMap<Integer, Integer> map = new HashMap<>();
 		
 		for (int element :array) {
 			map.put(element, map.getOrDefault(element, 0) + 1);
 		}
 		
 		for (int loop=100; loop>=0; loop --) {
 			Integer element = map.get(loop);
 			
 			if (element!=null) {
 				kthElement-=element;
 			}
 			if (kthElement<=0) return loop;
 			
 		}
 		return -1;
 		
 	}

	/**
	 * k = 1 ;  93
	 * k = 2 ;  88
	 * k = 4 ;  52
	 * @param args
	 */
	public static void main(String args[]) {
		int arr[] = {35,14,52,23,31,72,88,52, 93, 93};
		int k = 1;
		
		System.out.println(function(arr, k));
		
		System.out.println(findTheDifference("abba"
				,"axbba"));
	}
}

/**
 * 
 * 	public static int function(int [] arrays, int kthPosition ) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int element: arrays) {
			map.put(element, map.getOrDefault(element, 0) + 1);
		}
		
		for (int scan=100; scan >=0; scan --) {
			Integer hashElement = map.get(scan);
			if (hashElement != null ) {
				kthPosition-=hashElement;
			}
			if (kthPosition<=0) return scan;
			
		}
		
		return -1;
		
	}
 * 	public static char findTheDifference(String s, String t) {
        char sArray[]=s.toCharArray();
        char tArray[]=t.toCharArray();
        
        HashMap<Character, Integer> hC = new HashMap<>();
        
        for (char c : sArray){
            if (hC.containsKey(c)){
            	hC.put(c, hC.get(c) +1 );
            }else {
            	hC.put(c, 1);
            }
        }
        for (char c : tArray){
            if (!hC.containsKey(c)){
                return c;
            }
        }
        HashMap<Character, Integer> hT = new HashMap<>();
        for (char c : tArray){
            if (hT.containsKey(c)){
                hT.put(c, hT.get(c) +1 );
            }else {
                hT.put(c, 1);
            }
        }
        for (char c : sArray){
            Integer i = hT.get(c);
            Integer j = hC.get(c);
            
            if (i!=j) {
            	return c;
            }

        }
        
        return '1';
    }
    */
