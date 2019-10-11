package com.personal.test;

import java.util.function.*;
public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> times2 = a -> a* 2;
		Function<Integer, Integer> squared = e -> e * e;  
		
		System.out.println(times2.compose(squared).apply(4));
		
		
		System.out.println(times2.andThen(squared).apply(4));

		UnaryOperator<Integer> f = (i) -> {
			System.out.println("Test Messsage" + i);
			return i;
		};

		System.out.println(f.apply(10));
		
		
		Function<Integer, Function<String, Integer>> sum = x -> y -> x + Integer.valueOf(y);
		Function<String,Integer> plus10 = sum.apply(10) ;
		System.out.println(plus10.apply("20"));
	}

}
