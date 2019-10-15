package middle;

public class GetMiddleOfLinkedList {
	 
	 public static void main(String[] args) {
	  new GetMiddleOfLinkedList();
	 }
	 
	 public GetMiddleOfLinkedList() {
	  Node startNode = new Node(10);
	  Node temp2 = new Node(20);
	  Node temp3 = new Node(30);
	  Node temp4 = new Node(40);
	  Node temp5 = new Node(50);
	  Node temp6 = new Node(60);
	  Node temp7 = new Node(70);
	  Node temp8 = new Node(80);
	  Node temp9 = new Node(90);
	 
	  startNode.setNext(temp2);
	  temp2.setNext(temp3);
	  temp3.setNext(temp4);
//	  temp4.setNext(temp5);
//	  temp5.setNext(temp6);
//	  temp6.setNext(temp7);
//	  temp7.setNext(temp8);
//	  temp8.setNext(temp9);
	  
	  Node mover = startNode;
	  while (mover !=null) {
		  System.out.print(mover.getData() + " " );
		  mover= mover.getNext();
	  }
	  
	  System.out.println();
	  
	  Node temp = findMiddleNodeOfLinkedList(startNode);
	  System.out.println(temp.getData());
	 }
	 
	 private Node findMiddleNodeOfLinkedList(Node startNode) {
	  if(startNode==null){
	   return startNode;
	  }
	 
	  Node slowPointer = startNode;
	  Node fastPointer = startNode;
	  while( fastPointer.getNext()!=null && fastPointer.getNext().getNext()!=null){
	   slowPointer = slowPointer.getNext();
	   fastPointer = fastPointer.getNext().getNext();
	 
	  }
	  return slowPointer;
	 }
}

class Node{
	 private int data;
	 private Node next;
	 public Node(int data, Node next) {
	  this.data = data;
	  this.next = next;
	 }
	 public Node(int data) {
	  this.data = data;
	 }
	 public int getData() {
	  return data;
	 }
	 public void setData(int data) {
	  this.data = data;
	 }
	 public Node getNext() {
	  return next;
	 }
	 public void setNext(Node next) {
	  this.next = next;
	 }
	}