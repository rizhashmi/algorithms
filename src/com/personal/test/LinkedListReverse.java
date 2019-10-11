package com.personal.test;

public class LinkedListReverse {
    Node head;  // head of list 
    
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; }
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + data;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			Node other = (Node) obj;
			if (data != other.data)
				return false;
			return true;
		}
    } 
    
    Node reverse(Node head, int k) 
    { 
    	if (head ==null || head.next == null){
    		return head;
    	}
    	Node runningNode = head;
    	Node next = null;
		Node previous = null;

    	 
    	while (k >1 && runningNode!=null){
    		next = runningNode.next;
    		runningNode.next = previous; 
    		previous=runningNode;
    		runningNode=next;
    		k--;
    	}
    	

    	if (runningNode !=null){
    		head.next = runningNode.next;
    		runningNode.next = previous;
    		head = runningNode;
    	} else{
    		//head.next = previous;
    		head = previous;
    		//previous.next = null;
    	}
    	 
    	return head;
    }
    
    Node reverse2(Node head, int k) 
    { 
    	if (head ==null || head.next == null){
    		return head;
    	}
    	Node runningNode = head;
    	Node next = runningNode.next; // prior statement has null check already
		Node previous = null;

    	 
    	while (k >1 && runningNode!=null && runningNode.next != null){
    		runningNode.next = previous; 
    		previous=runningNode;
    		runningNode=next;
    		next = next.next;
    		k--;
    	}
    	
    	runningNode.next = previous; 
    	head.next = next;
    	head = runningNode;
    	 
    	return head;
    }
    
    public void push(int data){
    	Node newNode = new Node(data);
    	newNode.next=head;
    	head =newNode;
    }
    public void printList(){
    	Node runningNode = head;
    	
    	while (runningNode != null ){
    		System.out.println(runningNode.data);
    		runningNode= runningNode.next;
    	}
    	
    }
    public static void main(String args[]) 
    { 
    	LinkedListReverse llist = new LinkedListReverse(); 
          
        /* Constructed Linked List is 1->2->3->4->5->6-> 
           7->8->8->9->null */
        llist.push(9); 
        llist.push(8); 
        llist.push(7); 
        llist.push(6); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
          
        System.out.println("Given Linked List"); 
        llist.printList(); 
          
        llist.head = llist.reverse2(llist.head, 4); 
  
        System.out.println("Reversed list"); 
        llist.printList(); 
        
    } 

}
