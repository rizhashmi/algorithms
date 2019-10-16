package com.personal.test;

import java.util.*;

public class TreeSort {    
    public static void main(String[] args) {
        int[] arr = {50, 30, 70, 15, 7, 62, 22, 35, 87, 22, 31};
    	//int [] arr= {1,2,3,4,5};
        System.out.println("Original array- "+ Arrays.toString(arr));
        Tree tree = new Tree(arr[0]);
        for(int num : arr){
            tree.insert(tree.node, num);
        }
        System.out.println("Sorted Array (Ascending)- ");
        tree.inOrder(tree.node);
        System.out.println();
        System.out.println("Sorted Array (Descending)- ");
        tree.inOrderDesc(tree.node);
        System.out.println();
        System.out.println(tree.findDepthOfTree(tree.node));

        System.out.println("   " + tree.findKthElementInTree(tree.node,0));

    }
}

class NodeTree{
    int value;
    NodeTree left;
    NodeTree right;
    NodeTree(int value){
        this.value = value;
        left = null;
        right = null;        
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return value + "";
    }
}

class Tree{
    NodeTree node;
    Tree(int value){
        node = new NodeTree(value);
    }
    public NodeTree insert(NodeTree node, int value){
        if(node == null){
            return new NodeTree(value);
        }
        // Move to the left if passed value is 
        // less than the current node
        if(value <node.value){
            node.left = insert(node.left, value);
        }
        // Move to the right if passed value is 
        // greater than the current node
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }
    
    // For traversing in order
    public void inOrder(NodeTree node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }
    
    public void inOrderDesc(NodeTree node){
        if(node != null){
            inOrderDesc(node.right);
            System.out.print(node.value + " ");
            inOrderDesc(node.left);
        }
    }
    public int findDepthOfTree(NodeTree node ) {
    	int depth = 0;
    	if (node!=null) {
    		Queue<NodeTree> queue = new LinkedList<NodeTree>(); 
    		Queue<NodeTree> queue2 = new LinkedList<NodeTree>();
    		queue.offer(node);
			depth =1;

    		while (!queue.isEmpty()) {
    			NodeTree traverseNode = queue.poll();
    			System.out.println(traverseNode.value);
    			

    			if (traverseNode.right !=null ) {
    				queue2.add(traverseNode.right);
    			}
    			if (traverseNode.left !=null ) {
    				queue2.add(traverseNode.left);
    			}
    			
    			if (queue.isEmpty() && !queue2.isEmpty()) {
    				queue = queue2;
    				queue2 = new LinkedList<NodeTree>();
    				depth ++;
    			}
    			
    		}
		
    	}
    	return depth;
    }
    
    public int findKthElementInTree(NodeTree node, int kthElement ) {
    	int depth = 0;
    	if (node!=null) {
    		Queue<NodeTree> queue = new LinkedList<NodeTree>(); 
    		Queue<NodeTree> queue2 = new LinkedList<NodeTree>();
    		queue.offer(node);
    		depth = 1;
    		while (!queue.isEmpty()) {
    			NodeTree traverseNode = queue.poll();
    			//System.out.println(traverseNode.value);
    			
    			if (kthElement<=1) {
    				return traverseNode.value;
    			}
    			
    			if (traverseNode.right !=null ) {
    				queue2.add(traverseNode.right);
    			}
    			if (traverseNode.left !=null ) {
    				queue2.add(traverseNode.left);
    			}
    			

    			
    			if (queue.isEmpty() && !queue2.isEmpty()) {
    				queue = queue2;
    				queue2 = new LinkedList<NodeTree>();
    				depth ++;
    				kthElement--;

    			}
    			
    		}
		
    	}
    	return -1;
    }
}
