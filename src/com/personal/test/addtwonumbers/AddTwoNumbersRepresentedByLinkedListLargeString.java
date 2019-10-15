package com.personal.test.addtwonumbers;


public class AddTwoNumbersRepresentedByLinkedListLargeString {
	
	static ListNode addSum(ListNode l1, ListNode l2 ) {
		ListNode l1internal = l1;
		ListNode l2internal = l2;
			
		ListNode resultantNode = null;
		ListNode head = null;
		int carry=0;
		
		while(l1internal != null || l2internal != null){
			int number1 = 0;
			if (l1internal !=null) {
				number1 = l1internal.val;
				l1internal = l1internal.next;
			} 
			
			int number2 =0;
			if (l2internal!=null) {
				number2 = l2internal.val;
				l2internal = l2internal.next;
			} 
			int finalSum = number1 + number2 + carry;
			
			carry = finalSum /10;
			
			if (head == null) {
				head = new ListNode(finalSum % 10);
				resultantNode = head;
			} else {
				ListNode tempNode = new ListNode(finalSum % 10);
				resultantNode.next = tempNode; 
				resultantNode = tempNode;
			}			
		}
		if (carry>0 ) {
			ListNode tempNode = new ListNode(carry);
			resultantNode.next = tempNode; 


		}
		return head;
	}
	
	static void println(ListNode node) {
		boolean isTrue = false;
		if (node!=null) {
			System.out.print(node.val + " ");
			println(node.next);
			if (!isTrue) {
				isTrue = true;
				System.out.println();
			}
		}
	};
	
	public static void main(String args[]) {
		ListNode node = new ListNode(2);
		node.next = new ListNode(4);
		node.next.next = new ListNode(9);
		println(node);
		
		ListNode node2 = new ListNode(5);
		node2.next = new ListNode(6);
		node2.next.next = new ListNode(4);
		println(node2);
		
		ListNode n1 = addSum(node, node2);
		println(n1);
		
	}


}

 class ListNode {     
	 int val;     
	 ListNode next;     
	 ListNode(int x) 
	 { val = x; }
}