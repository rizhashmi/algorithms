package com.personal.test;

public class LongestPalindrome {
	
    public String longestPalindromeInOrder(String s) {

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
    	
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindromeInOrder("bxxbcac"));
    	//
    }

}
