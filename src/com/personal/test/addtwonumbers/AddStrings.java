package com.personal.test.addtwonumbers;

public class AddStrings {
	public static String addStrings(String num1, String num2) {
		int num1Size = num1.length()-1;
		int num2Size = num2.length()-1;
		int previousCarry=0;

		int finalCharArraySize = ((num1Size>num2Size)?num1Size:num2Size) + 2;
		
		char [] x = new char[finalCharArraySize];
		
		while (num1Size >= 0  || num2Size >=0) {
			int n1 = (num1Size>=0)? (((int)num1.charAt(num1Size--))-48):0;
			int n2 = (num2Size>=0)? (((int)num2.charAt(num2Size--))-48):0;
			
			int r1 = n1 + n2 + previousCarry;
			
			previousCarry = r1 / 10;
			x[--finalCharArraySize]=(char) ((r1 % 10) + 48);

		}
		if (previousCarry!=0) {
			x[--finalCharArraySize] = (char)(previousCarry+ 48);
		}

		return new String(x);
	}
	

    public static void main(String args[]) {
		String num1="1999999";
		String num2="9999501";
		long time= System.currentTimeMillis();
		System.out.println(addStrings(num1, num2) + "  " + (System.currentTimeMillis() -time));
    }


}
