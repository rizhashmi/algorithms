package com.personal.test;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] i = {-1,-1};
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for (int d = 0; d <nums.length; d ++){
            int v = target - nums[d];
            
            Integer lookup = hm.get(nums[d]);
            
            if (lookup == null ){
                hm.put( v,d);    
            } else {
                i[0]=lookup;
                i[1]=d;
                return i;
            }
            
        }
        return i;
    }
    public static void main(String args[]) {
    	int arr[] = {2,9,11,15};
    	
    	int target = 13;
    	
    	System.out.println(twoSum(arr,target)[0] + " " + twoSum(arr,target)[1]);
    	
    }
}
