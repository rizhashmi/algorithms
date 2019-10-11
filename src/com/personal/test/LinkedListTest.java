package com.personal.test;

public class LinkedListTest {
	
	private Node head;

	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	// ascending order 
	public void sortInsert(int i){
		Node newNode = this.getNode(i);
		if (head == null || head.data >=i) {		
			newNode.next = head;
			head = newNode;
		} else {
			Node runningNode = head;
		
			while (runningNode.next !=null && runningNode.next.data < i){
				runningNode = runningNode.next;
			}
			newNode.next = runningNode.next;
			runningNode.next = newNode;
			
		}
	}
	
	public void printAllNodeElements(){
		Node currentNode = head;
		
		while (currentNode!=null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	private Node getNode(int i ){
		return new Node(i);
	}
	public static void main(String args[]){
		LinkedListTest linkedList = new LinkedListTest();
		linkedList.sortInsert(10);
		linkedList.sortInsert(20);
		linkedList.sortInsert(30);
		linkedList.sortInsert(40);
		linkedList.sortInsert(19);
		linkedList.sortInsert(200);
		linkedList.sortInsert(100);
		linkedList.sortInsert(2);
		
		linkedList.printAllNodeElements();
		
	}
}



