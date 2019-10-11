package com.personal.test;

public class LinkedListAnother {
	  Node head;  // head of list 
	    static Node a, b; 
	  
	    /* Node Class */
	    static class Node { 
	  
	        char data; 
	        Node next; 
	  
	        // Constructor to create a new node 
	        Node(char d) { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	    int compare(Node node1, Node node2) { 
	    	
	    	while (node1 != null && node2 != null && node1.data == node2.data){
	    		node1 = node1.next;
	    		node2 = node2.next;	
	    	}
	    	
	    	if (node1 == null && node2 ==null ){
	    		return 0;
	    	}
	    	else 
		    if (node1!=null && node2!=null){
		    		if (node1.data > node2.data)
		    				return 1;
		    			else {
		    				return -1;
		    			}  		
		    }
		   	else 
	    	if (node1==null && node2!=null){
	    		return -1;
	    	}
	    	else
	    	//if (node1!=null && node2==null){
	    		return 1;
	    	//}
	    }
	    
	    public static void main(String[] args) { 
	    	  
	    	LinkedListAnother list = new LinkedListAnother(); 
	        Node result = null; 
	  
	        list.a = new Node('g'); 
	        list.a.next = new Node('e'); 
	        list.a.next.next = new Node('e'); 
	        list.a.next.next.next = new Node('k'); 
	        list.a.next.next.next.next = new Node('s'); 
	        //list.a.next.next.next.next.next = new Node('b'); 
	  
	        list.b = new Node('g'); 
	        list.b.next = new Node('e'); 
	        list.b.next.next = new Node('e'); 
	        list.b.next.next.next = new Node('k'); 
	        list.b.next.next.next.next = new Node('s'); 
	        list.b.next.next.next.next.next = new Node('a'); 
	  
	        int value; 
	        value = list.compare(b, a); 
	        System.out.println(value); 
	  
	    } 
}
