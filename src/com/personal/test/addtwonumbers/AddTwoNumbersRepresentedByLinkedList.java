package com.personal.test.addtwonumbers;


public class AddTwoNumbersRepresentedByLinkedList {
	static long getNumberFromLinkedList(NodeBasic nodeBasic) {
		if (nodeBasic == null) {
			return 0;
		} else {

			return getNumberFromLinkedList(nodeBasic.next) * 10 + nodeBasic.value ;
		}
	}
	static NodeBasic getNodeFromNumber(long number) {
		if (number == 0) {
			return null;
		}else {
			long newValue = number % 10;
			NodeBasic nodeTemp = new NodeBasic(newValue);
			nodeTemp.next = getNodeFromNumber(number / 10);
			return nodeTemp;
		}
	}
	
    static NodeBasic convertToListNode1(int number){
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
	static void println(NodeBasic node) {
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
		NodeBasic node = new NodeBasic(5);
		node.next = new NodeBasic(6);
		node.next.next = new NodeBasic(3);
		println(node);
		
		NodeBasic node2 = new NodeBasic(8);
		node2.next = new NodeBasic(4);
		node2.next.next = new NodeBasic(2);
		println(node2);
		
		long newValue = getNumberFromLinkedList(node) + getNumberFromLinkedList(node2);
		
		NodeBasic sumList = getNodeFromNumber(newValue);
		println(sumList);
		
		NodeBasic node64957 = getNodeFromNumber(64957);
		NodeBasic node48 = getNodeFromNumber(48);
		long result = getNumberFromLinkedList(node64957) + getNumberFromLinkedList(node48);
		System.out.println(result);
		println(getNodeFromNumber(result));
		


		
		println(convertToListNode1(807));
		println(getNodeFromNumber(807));

		
	}


}

class NodeBasic{
	long value;
	NodeBasic next;
	
	NodeBasic(long value) {
		this.value =value;
	}
}
