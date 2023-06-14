package com.interview.bp;

import java.util.List;
import java.util.ArrayList;

public class Solution {
	public void scooterCode2(List<String> namingScheme, int count) {
		int track = 0;
		if (count == 0)
			return;
		int[] indexer = new int[namingScheme.size()];
		for (;;) {
			String myScooterCode = "";
			for (int k = 0; k < namingScheme.size(); k++) {

				// for (int i =indexer[k]; i <namingScheme.get(k).length(); i ++ ){
				String temp = namingScheme.get(k);
				myScooterCode += temp.charAt(indexer[k]);
				// }

				if (k == namingScheme.size() - 1) {
					System.out.println(myScooterCode);
					myScooterCode = "";
					track++;
					if (track >= count) {
						return;
					}
					int checker = k;
					while (indexer[checker] + 1 >= namingScheme.get(checker).length()) {
						indexer[checker] = 0;
						checker--;
						if (checker < 0) {
							System.out.println("I cannot generate anymore item");
							break;
						}
					}
					indexer[checker] += 1;
				}
			}
		}
	}
	public void scooterCode(List<String> namingScheme, int count) {
		int indexer[] = new int[namingScheme.size()];
		for (int i=0; i < count ; i ++) {
			String myScooterCode = "";
			for (int k = 0; k < namingScheme.size(); k++) {
				String temp = namingScheme.get(k);
				myScooterCode += temp.charAt(indexer[k]);
			}
			
			System.out.println(myScooterCode);
			
			int checker = namingScheme.size()-1;
			while (indexer[checker] >= namingScheme.get(checker).length()-1 ) {
				indexer[checker] = 0;
				checker--; 
				if (checker < 0 ) {
					return;
				}
			}
			indexer[checker] +=1;

		}
	}

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("abcdefghjklmnpqvwxy");
		str.add("abcdefghjklmnpqvwxy");
		str.add("-/");
		str.add("0123");
		str.add("$%^");
		Solution sol = new Solution();
		sol.scooterCode(str, 1000);
	}
}