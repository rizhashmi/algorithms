package com.personal.test;
import java.util.*;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        int [] array = new int[58];
        
        
        for (int i = 0; i <s.length(); i ++){
            int characterIntValue = (int)s.charAt(i) -65 ;
            array[characterIntValue] +=1;
        }
        int result = 0;
        int largestOdd = 0;
        for (int i = 57; i >=0; i-- ){
        	//System.out.println(array[i]);
        	if (array[i] != 0 ) {
            if (array[i] %2 == 0){
                result += array[i];
            } else {
                if (array[i] > largestOdd) {
                	if (largestOdd !=0)
                		result+= largestOdd -1;
                    largestOdd = array[i];
                } else {
                	result += array[i]-1;
                }
            }
        }
        }
        return result + largestOdd;
 
    }

    public static void main(String args[]) {
    	String str = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
    	System.out.println(longestPalindrome(str));
    	
    	
    	//
    }
}
