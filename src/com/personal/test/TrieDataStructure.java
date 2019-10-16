package com.personal.test;

import java.util.HashMap;
import java.util.Stack;

public class TrieDataStructure {
	static TrieNode head = null;

	public static void insertTrieNode(String text) {
		if (text.length() == 0)
			return;

		TrieNode runningNode = head;

		for (int i = 0; i < text.length(); i++) {
			char characterToInsert = text.charAt(i);

			if (runningNode == null) {
				runningNode = new TrieNode(characterToInsert);
				head = runningNode;
				runningNode = runningNode.map.get(characterToInsert);
			} else {
				TrieNode temp = runningNode.map.get(characterToInsert);
				if (temp == null) {
					runningNode.map.put(characterToInsert, new TrieNode());
				}
				runningNode = runningNode.map.get(characterToInsert);
			}
		}
		runningNode.isWord = true;

	}

	
	  public static boolean searchTrie(String text) {
			if (text.length() == 0)
				return false;
			
		  TrieNode runningNode = head;

			
		  for (int i=0; i < text.length(); i ++) {
			char characterToInsert = text.charAt(i);
			TrieNode temp = runningNode.map.get(characterToInsert);
			if (temp !=null) {
				runningNode = temp;
			} else {
				return false;
			}
		  }
		 return runningNode.isWord;
	  }
	  
	  public static boolean removeTrieNode(String text) {
			if (text.isEmpty())
				return false;
		
		  Stack<TrieNode> st = new Stack<>();
		  TrieNode runningNode = head;
		  for (int i = 0; i < text.length(); i ++) {
			  char characterToInsert = text.charAt(i);
			  TrieNode temp = runningNode.map.get(characterToInsert);
			  if (temp == null ) {
				  return false;
			  } else {
				  st.push(temp);
				  runningNode = temp;
			  }
		  }
		  while (!st.isEmpty()) {
			  
		  }
		  
		  return true;
	  }
	  
	  
	  public static void main(String args[]) {
		String arr[] = { "Car", "Motor", "Truck", "Card" };

		for (String element : arr) {
			insertTrieNode(element.toLowerCase());
		}
		
		System.out.println(searchTrie("Moto".toLowerCase()));

	}
}

class TrieNode {
	HashMap<Character, TrieNode> map = new HashMap<>();
	boolean isWord = false;

	TrieNode() {
	}

	TrieNode(char ch) {
		map.put(ch, new TrieNode());
	}

	TrieNode(char ch, TrieNode t) {
		map.put(ch, t);
	}
}