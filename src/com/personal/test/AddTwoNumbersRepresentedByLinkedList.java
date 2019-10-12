package com.personal.test;
import java.util.Stack;

public class AddTwoNumbersRepresentedByLinkedList {
	public static long getNumberFromLinkedList(NodeBasic nodeBasic) {
		if (nodeBasic == null) {
			return 0;
		} else {

			return getNumberFromLinkedList(nodeBasic.next) * 10 + nodeBasic.value ;
		}
	}
	public static NodeBasic getNodeFromNumber(long number) {
		if (number == 0) {
			return null;
		}else {
			long newValue = number % 10;
			NodeBasic nodeTemp = new NodeBasic(newValue);
			nodeTemp.next = getNodeFromNumber(number / 10);
			return nodeTemp;
		}
	}
	
    public static NodeBasic convertToListNode1(int number){
        if (number/10 ==0 )
            return new NodeBasic(number % 10);
        else {
            int div = number / 10;
            NodeBasic l = convertToListNode1(div);
            NodeBasic l1 = new NodeBasic(number % 10);
            l.next =l1;
            return l;
        }
        
    }
	public static void println(NodeBasic node) {
		boolean isTrue = false;
		if (node!=null) {
			System.out.print(node.value + " ");
			println(node.next);
			if (!isTrue) {
				isTrue = true;
				System.out.println();
			}
		}
	};
	
	public static void main(String args[]) {
//		NodeBasic node = new NodeBasic(5);
//		node.next = new NodeBasic(6);
//		node.next.next = new NodeBasic(3);
//		println(node);
//		
//		NodeBasic node2 = new NodeBasic(8);
//		node2.next = new NodeBasic(4);
//		node2.next.next = new NodeBasic(2);
//		println(node2);
//		
//		long newValue = getNumberFromLinkedList(node) + getNumberFromLinkedList(node2);
//		
//		NodeBasic sumList = getNodeFromNumber(newValue);
//		println(sumList);
//		
//		NodeBasic node64957 = getNodeFromNumber(64957);
//		NodeBasic node48 = getNodeFromNumber(48);
//		long result = getNumberFromLinkedList(node64957) + getNumberFromLinkedList(node48);
//		System.out.println(result);
//		println(getNodeFromNumber(result));
//		
		String num1="1999999";
		String num2="9999501";
		
		System.out.println(addStrings(num1, num2));
		int a = 
				4;
		System.out.println(isPerfectSquare(a));
		System.out.println(isPerfectSquare1(a));
		
		
		println(convertToListNode1(807));
		println(getNodeFromNumber(807));

		
	}

	public static String addStrings(String num1, String num2) {
		int num1Size = num1.length()-1;
		int num2Size = num2.length()-1;
		int previousCarry=0;

		StringBuilder builder = new StringBuilder("");
		int finalCharArraySize = ((num1Size>num2Size)?num1Size:num2Size) + 2;
		
		char [] x = new char[finalCharArraySize];
		
		while (num1Size >= 0  || num2Size >=0) {
			int n1 = (num1Size>=0)? (((int)num1.charAt(num1Size--))-48):0;
			int n2 = (num2Size>=0)? (((int)num2.charAt(num2Size--))-48):0;
			
			int r1 = n1 + n2 + previousCarry;
			
			previousCarry = r1 / 10;
			//builder.append(r1 % 10);
			x[--finalCharArraySize]=(char) ((r1 % 10) + 48);

		}
		if (previousCarry!=0) {
			x[--finalCharArraySize] = (char)(previousCarry+ 48);
		}

		return x.toString();
	}
	
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
    


}

class NodeBasic{
	long value;
	NodeBasic next;
	
	NodeBasic(long value) {
		this.value =value;
	}
}
