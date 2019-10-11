package com.personal.test;

import java.util.function.*;

public class TestBiFunctionConsumer {
	
	public static void main(String args[]) {
		BiFunction<Integer, Integer, String> biFunction = (a, b) -> {
			return String.valueOf(a + b);
		};
		
		BiFunction<Integer, BiFunction<Integer, Integer, String>, String> complexBiFuction100 
		= (a, function) -> {
			return function.apply(a, 100) ;
		};
			
		System.out.println(complexBiFuction100.apply(10, biFunction));
		System.out.println(biFunction.apply(10, 10));
		
		Function<String, Function<String, Letter>> SIMPLE_CURRIED_LETTER_CREATOR 
		  = salutation -> body -> new Letter(salutation, body);
	}
}
class Letter {
    private String salutation;
    private String body;
     
    Letter(String salutation, String body){
        this.salutation = salutation;
        this.body = body;
    }
}