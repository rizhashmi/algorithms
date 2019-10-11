package com.personal.test;

import java.util.Arrays;

public class TreeSort {    
    public static void main(String[] args) {
        int[] arr = {50, 30, 70, 15, 7, 62, 22, 35, 87, 22, 31};
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
        if(value < node.value){
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
}
